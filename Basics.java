import java.util.Scanner;
// this is to remember the basics and understand properly
// return methods(void, other types), values, objects, 

//Value is simply well its value dumbass what a variable holds inside this is universal never forget or mistaken it 
//methods in java

// methods can either return a value or not
//Void: When a method has a return type of void, it means the method does not return any value. It is used for methods that perform a task but do not produce any result that needs to be used elsewhere in the program.
// essentially when you call a void it needs nothing, like this is how it will be delivered at main "multiply();"" 
//if its return its a totally different ball game cuz instead of void it will have something like int, double boolean or something it will then need a variable of that same type.

//there are four instances on how you can write a code taking into account this it just depends on what you are dealing with 

public class Basics {

    public static void main(String[] args) {
       Basics ob = new Basics(); //object created with refrence ob 
        
       multiply(5, 2); //it does not return any value due to it being void oh and the reason why an object is not needed that ob. shit is cuz you kept static on it so it doesn't need an object to instantiate it (1)
       ob.mul(5,2); //(2)

       double multiply = multiply_re(5, 2);//return statements with static note how the variable had to be the same as the return of method because that is what is beign returned so it makes sense to be stored like that with its type (3)
       System.out.println(multiply);

       double var = ob.mul_re(5, 2);
       System.out.println(var);//(4)



    }


    //1 with static so no use of object
    public static void multiply(int a,int b) {
        System.out.println(a*b);
    }


    //2 without static so we need an object u create it at main
    public void mul(int a, int b){
        System.out.println(a*b);
    }

    //return with methods (i'll be doing something a lil different to prove a point)

    //a return statement with double 3rd instance
    public static double multiply_re(int a, int b){
    return a*b; //note with return statements you must always finish what you need to be returned so that it will be stored in that value.
    }

    // a return statement without static 4th instance
    public double mul_re(int a,int b) {
        return a*b;
    }
    
}

//so with static no need of an object but if no static need object
// return type needs the same type variable kept at main, while void has no return type hence no variable of anykind in main
// parameters are added so you can manipulate it on the methods side yh while at main


