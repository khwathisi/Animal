import java.util.ArrayList;

public class Home {
    ArrayList Pets = new ArrayList();
    Dog dog = new Dog();
    Cat cat = new Cat();

    public Home() {
        super();
    }

    public String adopt(String type){
        String error = "Error";

        if(type.equals(dog.getType()))
        {
            if(Pets.contains(dog.getType()))
            {
                System.out.println("You already have a dog");
            }else
                {
                    String animalAdopt = "The " + type + " is adopted";
                    Pets.add(type);
                    System.out.println(animalAdopt);
                    return animalAdopt;
                }

        }else if(type.equals(cat.getType()))
        {
            if(Pets.contains(cat.getType()))
            {
                System.out.println("You already have a cat");
            }else
                {
                    String animalAdopt = "The " + type + " is adopted";
                    Pets.add(type);
                    System.out.println(animalAdopt);
                    return animalAdopt;
                }

        }else {
            System.out.println(error);
        }

        return error;
    }

    public String makeAllSounds(){
        int lens = Pets.size();
        for(int i=0; i< lens; i++){
            if (Pets.get(i) == dog.getType())
            {
                System.out.println(dog.getName() + " barks");
                return dog.getName() + " barks";
            }else if(Pets.get(i) == cat.getType())
            {
                System.out.println(cat.getName() + " meows");
                return cat.getName() + " meows";
            }else {
                System.out.println("No pets, it's lonely");
            }
        }
        return "No pets, it's lonely";
    }


}
