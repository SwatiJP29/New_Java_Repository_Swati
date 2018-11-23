package logic;

public class Dog {
    private String breed;
    private String size;
    private int age;

    //No-arg contructor [Uses same name as Classname]
    public Dog(){
        breed="indian";
        size="small";
        age=1;
    }
    public String getInfo(){
        return "Breed: "+breed+", size: "+size+" , age: "+age+" years";
    }
}
