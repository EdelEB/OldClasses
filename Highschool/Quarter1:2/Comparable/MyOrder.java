public class MyOrder
{
    public static void main(String[] args)
    {
        PhotoPrints print = new PhotoPrints(40);
        Poster post = new Poster();
        TableTop top = new TableTop("Wood");
        SpecialDeal deal = new SpecialDeal(print, post, top);
        System.out.println("Your prints cost: " + print.getCost());
        System.out.println("Your poster cost: " + post.getCost());
        System.out.println("Your tabletop cost: " + top.getCost());
        System.out.println("\nSubtotal: " + (print.getCost() + post.getCost() + top.getCost()));
        System.out.println("Special Deal: -$5.00\n");
        System.out.println("Your total cost is: " + deal.getCost());
    }
}