public class Dog extends Animal{
   private String Type = "Dog";
   private String Name = "Rax";

    public String getType(){
        return Type;
    }

    public String getName(){
        return Name;
    }

    @Override
    public String Sound(String Type, String Name) {
        System.out.println(super.Sound(getType(), getName()));
        return super.Sound(getType(), getName());
    }

}
