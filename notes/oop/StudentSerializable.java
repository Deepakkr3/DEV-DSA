
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentSerializable implements Serializable {
    int roll;
    String name;

    public StudentSerializable(int roll, String name) {
        this.roll = roll;
        this.name = name;

    }

}

class Main {

    public static void main(String args[]) {
        // System.out.println("hellow");
        // int num1=100;
        // Integer num1Wrap=Integer.valueOf(num1);
        // System.out.println( num1Wrap);
        // int premInt=num1Wrap.intValue();
        // System.out.println(premInt);
        // System.err.println(num1Wrap.equals(num1));

        StudentSerializable s = new StudentSerializable(0, "abc");

        try {
            FileOutputStream fos = new FileOutputStream("student.json");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            //accesing file 
            FileInputStream fis=new FileInputStream("student.json");
            ObjectInputStream ois=new ObjectInputStream(fis);
            StudentSerializable s2=(StudentSerializable)ois.readObject();
            System.out.println(s2.name);
            System.out.println(s2.roll);


        } catch (Exception e) {
        }

    }
}
