import java.util.*;

public class CandidatePool
{
    private List<Candidate> pool;
    
    public CandidatePool()
    {
        pool=new ArrayList<Candidate>();
    }
    
    public void addCandidate(Candidate c)
    {
        pool.add(c);
    }
    
    public List<Candidate> getCandidatesForPosition(String p)
    {
        ArrayList<Candidate> pool2=new ArrayList<Candidate>();
        for(int i=0;i<pool.size();i++)
        {
            if(pool.get(i).getPosition().equals(p))
            {
                pool2.add(pool.get(i));
            }
        }
        
        return pool2;
    }
    
    public Candidate getBestCandidate(String p)
    {
        
    }
}
