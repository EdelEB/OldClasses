
public class Magpie4
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

        else if (findKeyword(statement,"mother")>=0
        || findKeyword(statement,"father")>=0
        || findKeyword(statement,"sister")>=0
        || findKeyword(statement,"brother")>=0)
        {
            response = "Tell me more about your family.";
        }
        else if (findKeyword(statement,"dog") >= 0 || findKeyword(statement,"cat")>= 0)
            response = "Tell me more about your pets.";
        else if (findKeyword(statement,"Nastasi")>= 0)
            response = "I heard she is a great teacher.";
        else if (findKeyword(statement,"baseball") >= 0 ||findKeyword(statement,"swimming")>= 0 || statement.indexOf("basketball") >= 0 || statement.indexOf("football") >=0)
            response = "Is that your favorite sport?";
        else if (findKeyword(statement,"math") >= 0 || findKeyword(statement,"science") >= 0)
            response = "Do you like that subject?";
        else if (findKeyword(statement,"burger")>= 0 ||findKeyword(statement,"chocolate")>= 0)
            response = "Is that your favorite food?";
        else if (findKeyword(statement,"no")>= 0)
            response = "Why so negative?";
        else if (findKeyword(statement,"I want")>= 0)
            response = "Would you really be happy if you had "+transformIWantStatement(statement)+"?";
        else if (findKeyword(statement,"I")>=0&&findKeyword(statement, "you")>=0)
            response = "Why do you "+transformIYouStatement(statement)+" me?";
        else
            response = getRandomResponse();
        return response;
    }

    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
                before = phrase.substring(psn - 1, psn).toLowerCase();
            if (psn + goal.length() < phrase.length())
                after = phrase.substring(psn + goal.length(),psn + goal.length() + 1).toLowerCase();
            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
                    && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
                return psn;
            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),psn + 1);

        }

        return -1;
    }

    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }
    
    public String transformIWantStatement(String str)
    {
        str = str.substring(str.indexOf("want")+4);
        
        return str;
    }
    
    public String transformIYouStatement(String str)
    {
        str = str.substring(str.indexOf("I")+1,str.indexOf("you")-1);
        
        return str;
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
