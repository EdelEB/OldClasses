public class SpecialDeal implements PhotoCenter
{
    private PhotoPrints photos;
    private Poster poster;
    private TableTop tableTop;
    
    public SpecialDeal(PhotoPrints ph, Poster po, TableTop tt)
    {
        photos = ph;
        poster = po;
        tableTop = tt;
    }
    
    public String getType()
    {
        return "SpecialDeal";
    }
    
    public double getCost()
    {
        return photos.getCost() + poster.getCost() + tableTop.getCost() - 5;
    }
}