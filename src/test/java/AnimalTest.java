import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    Animal animalDog = new Animal("Rax", "Dog");
    Animal animalCat = new Animal("Storm", "Cat");
    Home homeAdoptDog = new Home("Rax", "Dog");
    Home homeAdoptCat = new Home("Storm", "Cat");


    @Test
    public void dogSound(){
        Assert.assertEquals(animalDog.Sound(),"The Dog Rax barks");
    }

    @Test
    public void catSound(){
        Assert.assertEquals(animalCat.Sound(),"The Cat Storm meows");
    }

    @Test
    public void adoptDog(){
        Assert.assertEquals(homeAdoptDog.adopt("Dog"), "The Dog is adopted");
    }

    @Test
    public void adoptCat(){
        Assert.assertEquals(homeAdoptCat.adopt("Cat"), "The Cat is adopted");
    }

}
