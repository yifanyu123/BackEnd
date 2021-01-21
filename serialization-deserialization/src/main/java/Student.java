import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * TODO 类描述
 *
 * @author zhenkui
 */
public class Student implements Serializable {

    private String name;
    private int age;

    public Student() {
        name = new String();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private void readObject(ObjectInputStream var1) throws IOException, ClassNotFoundException {

    }
}
