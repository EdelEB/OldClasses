
public class Candidate
{
    public String position;
    int idNumber;
    double interviewScore;
    
    public Candidate(int idnum, String p, double score)
    {
        idNumber=idnum;
        position=p;
        interviewScore=score;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public double getInterviewScore()
    {
        return interviewScore;
    }
}
