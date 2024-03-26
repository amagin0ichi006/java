// public class car_objects {
//     //attributes characteristics of the car
//     String car = "toyota";
//     String make = "camry";
//     String color = "black";
//     double price = 35000.00;

//     //methods actions this car can take 
//     public void drive(){
//         System.out.println("Your speeding safely with your brand new toyota camry with your bae using her phone talking to you");
//     }

//     public void brake() {
//         System.out.println("You stopped your car to attend to your lady");

//     }
    
// }

//without getters and setters


public class car_objects {
    private String car;
    private String type;
    private double price;

    car_objects(String car, String type, double price){//this is how you construct it when expecting different attributes to be made
        this.car = car;
        this.type = type;
        this.price = price;//this are accesors 

    }

    public String  getCar() {
        return car;
    }                           // this are mutators

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    } 


    public void drive() {
        System.out.println("Driving at full speed!!");
    }

    public void brake(){
        System.out.println("Hits the break HARD!");
    }
    
}

