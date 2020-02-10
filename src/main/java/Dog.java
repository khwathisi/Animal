import java.lang.reflect.Type;
import java.util.Scanner;

public class Dog {
   private String Type = "Dog";
   private String Name = "Rax";

    public static void main(String args[])
    {
        String Name = "Rax";
        String Type = "Dog";

        Home home = new Home(Name, Type);
        Animal animal = new Animal(Name, Type);
        Scanner in = new Scanner(System.in);

        //Dog barks
        System.out.println(animal.Sound());

        //Dog eats
        System.out.println(animal.Eat());

        //Adopt Dog
        System.out.println("Would you like to adopt " + Name + " y/n ?");
        String Response = in.nextLine().toLowerCase();

        if(Response.equals("y"))
        {
            System.out.println(home.adopt(Type));
        }else if(Response.equals("n"))
        {
            System.out.println("Storm is not adopted :(");
        }else {
            System.out.println("Incorrect input");
        }
    }

    /*public String adoptDog(){
        return home.adopt(Type);
    }

    public void adoptD(){

        System.out.println(home.adopt(Type));
    }*/

    public String getType(){
        return Type;
    }

    public String getName(){
        return Name;
    }
}
