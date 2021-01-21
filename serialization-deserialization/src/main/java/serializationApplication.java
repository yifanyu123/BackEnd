import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

/**
 * 序列化反序列化程序
 *
 * @author zhenkui
 */
public class serializationApplication {

    public static void main(String args[]) throws Exception {
        String obj = "ls ";
        // 将序列化对象写入文件object.txt中
        FileOutputStream fos = new FileOutputStream("aa.txt");
        Student student = new Student();
        student.setName("xcw");
        student.setAge(11);
        ObjectOutputStream os = new ObjectOutputStream(fos);

        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(student);

        System.out.println(byteArrayOutputStream.toString());
        byte[] bs = byteArrayOutputStream.toByteArray();
        os.writeObject(obj);
        os.close();

        // student=null;
        System.out.println("after serialization student: "+student);

        // 从文件object.txt中读取数据
        FileInputStream fis = new FileInputStream("aa.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bs);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        // 通过反序列化恢复对象obj
        String obj2 = (String) ois.readObject();
        Student student2 = (Student) objectInputStream.readObject();
        System.out.println(obj2);
        System.out.println("after deserialization student2: "+student2.toString());
        ois.close();

        //HashSet测试
        HashSet<Integer> x=new HashSet<>();
        x.add(12);
    }
}
