class Vehicle
{
   private String myMake;
   private String myModel;
   private int myYear;

   Vehicle(String make, String model, int year)
   {
      myMake=make;
      myModel=model;
      myYear=year;
   }

   public String getMake()
   {
      return myMake;
   }

   public String getModel()
   {
      return myModel;
   }

   public int getYear()
   {
      return myYear;
   }

   public String toString()
   {
      return "Make: "+myMake+"\nModel: "+myModel+"\nYear: "+myYear+"\n";
   }
}