
public interface Monster
{
    public int getSize();
    public String getName();
    public boolean isBigger(Monster other);
    public boolean isSmaller(Monster other);
    public boolean namesTheSame(Monster other);
}
