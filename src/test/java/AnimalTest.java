import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    Animal animal = new Animal();
    /*Animal animalCat = new Animal("Storm", "Cat");*/
    Home home = new Home();
    /*Home homeAdoptCat = new Home("Storm", "Cat");*/
    Dog dog = new Dog();
    Cat cat = new Cat();


    @Test
    public void dogSound(){
        Assert.assertEquals(animal.Sound(dog.getType(), dog.getName()),"The Dog Rax barks");
    }

    @Test
    public void catSound(){
        Assert.assertEquals(animal.Sound(cat.getType(), cat.getName()),"The Cat Storm meows");
    }

    @Test
    public void adoptDog(){
        Assert.assertEquals(home.adopt(dog.getType()), "The Dog is adopted");
    }

    @Test
    public void adoptCat(){
        Assert.assertEquals(home.adopt(cat.getType()), "The Cat is adopted");
    }

    @Test
    public void allSounds(){
        Assert.assertEquals(home.makeAllSounds(), "No pets, it's lonely");
    }

}
