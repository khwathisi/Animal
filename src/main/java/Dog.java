public class Dog extends Animal{
   private String Type = "Dog";
   private String Name = "Rax";

    public String getType(){
        return Type;
    }

    public String getName(){
        return Name;
    }

    public Dog(String Name, String Type) {
        super(Name, Type);
    }

    public Dog() {
        super();
    }

    @Override
    public String Sound(String Type, String Name) {
        System.out.println(super.Sound(getType(), getName()));
        return super.Sound(getType(), getName());
    }

    /*@Override
    public String Eat(String Type, String Name) {
        System.out.println(super.Eat(getType(), getName()));
        return super.Eat(getType(), getName());
    }*/


}
