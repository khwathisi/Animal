public class Animal {

    public String Sound(String Type, String Name){

        String animalError = "No animal input";
        if(Type == "Dog")
        {
            String animalSound = "The " + Type + " " + Name + " barks";
            return animalSound;
        }else if(Type == "Cat")
        {
            String animalSound = "The " + Type + " " + Name + " meows";
            return animalSound;
        }
        return animalError;
    }

    public String Eat(String Type, String Name){
        String animalError = "No animal input";
        if(Type == "Dog")
        {
            String animalEat = "The " + Type + " " + Name + " eats";
            System.out.println(animalEat);
        }else if(Type == "Cat")
        {
            String animalEat = "The " + Type + " " + Name + " eats";
            System.out.println(animalEat);
        }
        return animalError;
    }
}


