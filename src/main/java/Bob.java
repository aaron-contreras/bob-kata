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