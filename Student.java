public class Student {
    String name;
    String lastName;
    int id;

    public Student(String name, String lastName , int id){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public void show(){
        System.out.println("Name :"+name);
        System.out.println("Lastname :"+lastName);
        System.out.println("ID :"+id);
    }
}
