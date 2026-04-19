public class Student {
    String name;
    String lastName;
    int id;
    String address;

    public Student(String name, String lastName , int id, String address){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
    }

    public void show(){
        System.out.println("Name :"+name);
        System.out.println("Lastname :"+lastName);
        System.out.println("ID :"+id);
        System.out.println("Address :"+address);
    }
}
