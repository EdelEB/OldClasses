public class VehicleRunner
{
    public static void main()
    {
        Vehicle vehicle = new Vehicle("4Wheels","0000",2000);
        System.out.println("Make = " + vehicle.getMake());
        System.out.println("Model = " + vehicle.getModel());
        System.out.println("Year = " + vehicle.getYear());
        System.out.println(vehicle);
        //Expected:  Make: 4Wheels , Model: 0000, Year: 2000
       
        Truck truck = new Truck("Ford", "F150", 2008, 5000);
        System.out.println("Make = " + truck.getMake());
        System.out.println("Model = " + truck.getModel());
        System.out.println("Year = " + truck.getYear());
        System.out.println("Tonnage = " + truck.getTonnage());
        System.out.println(truck);
        //Expected:  Make: Ford, Model: F150, Year: 2008, Tonnage: 0.5
        
        GarbageTruck garbage = new GarbageTruck("Ford", "F150", 20, 9.0, "Collect solid waste");
        System.out.println("Make = " + garbage.getMake());
        System.out.println("Model = " + garbage.getModel());
        System.out.println("Year = " + garbage.getYear());
        System.out.println("Tonnage = " + garbage.getTonnage());
        System.out.println("Purpose = " + garbage.getPurpose());
        System.out.println(garbage);
        //Expected:  Make: 4Wheels, Model: Front Loader, Year: 2015, Tonnage: 9, Purpose: Collect solid waste
        
        Car car = new Car("Kia Forte", "LX", 2018, 34);
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        System.out.println("Year = " + car.getYear());
        System.out.println("MPG = " + car.getMPG());
        System.out.println(car);
        //Expected:  Make: Kia, Model: Forte, Year: 2012, MPG: 22
     
        
        StationWagon sWag = new StationWagon("Subaru Outback", "2.5i", 2013, 25, "rear");
        System.out.println("Make = " + sWag.getMake());
        System.out.println("Model = " + sWag.getModel());
        System.out.println("Year = " + sWag.getYear());
        System.out.println("MPG = " + sWag.getMPG());
        System.out.println("MPG = " + sWag.getSuspension());
        System.out.println(sWag);
        //Expected:  Make: Subaru Outback, Model: 2.5i, Year: 2013, MPG: 25, Suspension: rear
        
        //Implement the Comparable interface in the Car class to compare the mpg of car and sWag
        System.out.println(car.compareTo(sWag));
    }

}