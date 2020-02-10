import java.util.Scanner;

public class Cat {
    private String Type = "Cat";
    private String Name = "Storm";

    public static void main(String args[])
    {
        String Name = "Storm";
        String Type = "Cat";

        Home home = new Home(Name, Type);
        Animal animal = new Animal(Name, Type);
        Scanner in = new Scanner(System.in);

        //Cat barks
        System.out.println(animal.Sound());

        //Cat eats
        System.out.println(animal.Eat());

        //Adopt Dog
        System.out.println("Would you like to adopt " + Name + " y/n ?");
        String Response = in.nextLine().toLowerCase();

        if(Response.equals("y"))
        {
            System.out.println(home.adopt(Type));
        }else if(Response.equals("n"))
        {
            System.out.println("Rax is not adopted :(");
        }else {
            System.out.println("Incorrect input");
        }
    }

    public String getType(){
        return Type;
    }

    public String getName() {return Name;}

}
