public class Bob {
    
    private static final String QUESTION_MARK = "?";

    public String hey(String incoming) {

        incoming = incoming.trim();

        if (incoming.isEmpty())
            return "Fine. Be that way!";

        if (isNumerical(incoming))
            return "Whatever.";        

        if (isNumericalQuestion(incoming))
            return "Sure.";

        if (isYellingQuestion(incoming))
            return "Calm down, I know what I'm doing!";

        if (isYelling(incoming))
            return "Whoa, chill out!";

        if (isQuestion(incoming))
            return "Sure.";

        return "Whatever.";
    }

    public boolean isNumerical(String incoming) {
        return incoming.equals(incoming.toLowerCase()) && !incoming.endsWith(QUESTION_MARK);
    }

    public boolean isNumericalQuestion(String incoming) {
        return incoming.equals(incoming.toLowerCase()) && incoming.endsWith(QUESTION_MARK);
    }

    public boolean isYellingQuestion(String incoming) {
        return incoming.equals(incoming.toUpperCase()) && incoming.endsWith(QUESTION_MARK);
    }

    public boolean isYelling(String incoming) {
        return incoming.equals(incoming.toUpperCase());
    }
    public boolean isQuestion(String incoming) {
        return incoming.endsWith(QUESTION_MARK);
    }
}



/*Bob is a lackadaisical teenager. In conversation, his responses are very limited.

Bob answers 'Sure.' if you ask him a question.

He answers 'Whoa, chill out!' if you yell at him.

He answers 'Calm down, I know what I'm doing!' if you yell a question at him.

He says 'Fine. Be that way!' if you address him without actually saying anything.

He answers 'Whatever.' to anything else.

Bob's conversational partner is a purist when it comes to written communication and always follows normal rules regarding sentence punctuation in English. */