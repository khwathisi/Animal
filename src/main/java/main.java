public class main {

    public static void main(String[] args){
        Home home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.Sound(dog.getType(), dog.getName());
        cat.Sound(cat.getType(), cat.getName());

        System.out.println();

        //does nothing
        home.makeAllSounds();

        //adopt pets
        home.adopt(dog.getType());
        home.adopt(cat.getType());

        //Want another dog?
        home.adopt(dog.getType());

        System.out.println();
        home.makeAllSounds();

        System.out.println();

        //Feed pet(s) after making noise
        dog.Eat(dog.getType(), dog.getName());
        cat.Eat(cat.getType(), cat.getName());
    }
}
