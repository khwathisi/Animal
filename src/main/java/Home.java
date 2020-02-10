import javax.naming.Name;
import java.util.ArrayList;

public class Home {
    String pets[];
    private String[] homePets;
    Dog dog = new Dog();
    Cat cat = new Cat();

    private String Type;
    private String Name;

    public Home(String Name, String Type){
        this.Name = Name;
        this.Type = Type;
        this.pets = pets;
    }

    public String adopt(String type){
        String error = "Error";

        if(Type == dog.getType())
        {
            String animalAdopt = "The " + Type + " is adopted";
            pets=new String[]{type};
            return animalAdopt;

        }else if(Type == cat.getType())
        {
            String animalAdopt = "The " + Type + " is adopted";
            pets= new String[]{type};
            return animalAdopt;
        }else {
            System.out.println(error);
        }


        return /*makeAllSounds()*/ "done";
    }

    public String makeAllSounds(){
        int len = pets.length;
        for(int i=0; i< len; i++){
            if (pets[i] == dog.getType())
            {
                System.out.println(dog.getName() + " barks");
            }else if(pets[i] == cat.getType())
            {
                System.out.println(cat.getName() + " meows");
            }else {
                System.out.println("Error");
            }
        }
        return "No pets, it's lonely";
    }


}
