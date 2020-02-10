public class Animal {
    private String Name;
    private String Type;

    public Animal(String Name, String Type){
        this.Name = Name;
        this.Type = Type;
    }

    public String Sound(){

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

    public String Eat(){
        String animalError = "No animal input";
        if(Type == "Dog")
        {
            String animalEat = "The " + Type + " " + Name + " eats";
            return animalEat;
        }else if(Type == "Cat")
        {
            String animalEat = "The " + Type + " " + Name + " eats";
            return animalEat;
        }
        return animalError;
    }
}


