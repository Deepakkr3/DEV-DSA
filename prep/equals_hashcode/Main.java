
import java.util.Objects;



class Main{

    public static void main(String[] args) {
        
        System.out.println("_______________");

        Student s1=new Student(1,2,"abc","xyz");
        Student s2=new Student(1,2,"abc","xyz");
        System.out.println(s1.equals(s2));
    }
}




class Student {

    int id;
    int age;
    String name;
    String vill;

    public Student(int id, int age, String name, String vill) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.vill = vill;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student otherStudent = (Student) obj;
        return id == otherStudent.id && age == otherStudent.age && name.equals(otherStudent.name) && vill.equals(otherStudent.vill);

    }

    @Override
    public int hashCode(){
        return Objects.hash(
            id,age,name,vill
        );
    }

}
