class Student{
    //in there is a class is a blueprint of a object like basically it is a planning
    //object is a implementation and creation of real world entity problems
    String name;
    int age;
    public void stuInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class OOPs {
    public static void main(String[] args) {
        Student s1 = new Student();
         s1.name = "kalyan";
        s1.age = 23;
        s1.stuInfo();


    
        
    }

    
}
