public class Cat extends Animal{
    private String Type = "Cat";
    private String Name = "Storm";

    @Override
    public String Sound(String Type, String Name) {
        System.out.println(super.Sound(getType(), getName()));
        return super.Sound(getType(), getName());
    }

    public String getType(){
        return Type;
    }

    public String getName() {return Name;}

}
