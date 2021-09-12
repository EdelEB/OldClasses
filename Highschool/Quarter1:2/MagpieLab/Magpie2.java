public class Magpie2
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        statement = statement.trim();
        if (statement.length() == 0)
            response = "Say something please.";

        else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
            response = "Tell me more about your pets.";
        else if (statement.indexOf("Nastasi") >= 0)
            response = "I heard she is a great teacher.";
        else if (statement.indexOf("baseball") >= 0 || statement.indexOf("soccer") >= 0 || statement.indexOf("basketball") >= 0 || statement.indexOf("football") >=0)
            response = "Is that your favorite sport?";
        else if (statement.indexOf("math") >= 0 || statement.indexOf("english") >= 0)
            response = "Do you like that subject?";
        else if (statement.indexOf("burger") >= 0 || statement.indexOf("pizza") >= 0)
            response = "Is that your favorite food?";
        else if (statement.indexOf("no") >= 0)
            response = "Why so negative?";
        else
            response = getRandomResponse();
        return response;
    }

    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 8;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
            response = "Interesting, tell me more.";
        else if (whichResponse == 1)
            response = "Hmmm.";
        else if (whichResponse == 2)
            response = "Do you really think so?";
        else if (whichResponse == 3)
            response = "You don't say.";
        else if (whichResponse == 4)
            response = "Enlighten me.";
        else if (whichResponse == 5)
            response = "Ummm.";
        else if (whichResponse == 6)
            response = "Are you smart.";
        else if (whichResponse == 7)
            response = "I like sports.";
        else if (whichResponse == 8)
            response = "Having fun?";
            
        return response;
    }
}
