//basically think of objects as real world scenarios(thats why we using oop actually) your object lets say its all the stuff surrounding you like in real life like your cup, phone, pen and so that is your object
//now they are 2 things you should consider about this object of yours lets say cup it's characteristics,what makes it a cup(in code this is called "attributes" like string, int and whatnot)Attribute
// the second is what actions you can perform using the cup that is in code called its method like print out drink in a method and all Method
//you make use of objects or declare an objects in a class usually speaking you already have a class so you have to create a new one its advised to just create a new file for that

//we will do without getters or setters also known as accesors or mutators first with a car example

// public class objects {
//    public static void main(String[] args) {
//     car_objects ob = new car_objects();
//     car_objects ob2 = new car_objects();
//     System.out.println(ob.car);
//     System.out.println(ob.make);
//     ob.drive();

    

//     System.out.println();
//     System.out.println(ob2.car);
//     System.out.println(ob2.make);
//     ob.brake();
//     //in real life scenarios you might have the same car but they should have different attributes if you deep it hence what i will show you next 


//    }
// }

//without getters and setters you should free car_objects as well to to remove red squibbling lines.

public class objects {

    public static void main(String[] args) {
        
        car_objects ob = new car_objects("Toyota","black",45000.00);
        String car = ob.getCar();
        System.out.println(car);
        ob.drive();


        car_objects te = new car_objects("Hyandai", "White", 75000.012);
        double price = te.getPrice();
        System.out.println(price);
    }
}
