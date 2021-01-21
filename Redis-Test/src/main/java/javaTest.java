import java.io.*;



public class javaTest{

    public static void main(String args[]) throws Exception {
        String obj = "ls ";
        //ObjectOutputStream objectOutputStream = null;
        // 将序列化对象写入文件object.txt中
        FileOutputStream fos = new FileOutputStream("aa.txt");
        Student student = new Student();
        student.setName("xcw");
        student.setAge(11);
        ObjectOutputStream os = new ObjectOutputStream(fos);

        ByteArrayOutputStream byteArrayOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(student);
        System.out.println(byteArrayOutputStream.toString());
        byte[] bs = byteArrayOutputStream.toByteArray();
        os.writeObject(obj);
        os.close();

        // 从文件object.txt中读取数据
        FileInputStream fis = new FileInputStream("aa.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ObjectInputStream objectInputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        byteArrayInputStream = new ByteArrayInputStream(bs);
        objectInputStream = new ObjectInputStream(byteArrayInputStream);
        //objectInputStream = new ObjectInputStream(objectOutputStream)
        //System.out.println(ois);
        // 通过反序列化恢复对象obj
        String obj2 = (String)ois.readObject();
        Student student2 = (Student)objectInputStream.readObject();
       // System.out.println(student2.toString());
        System.out.println(obj2);
        System.out.println(student2.toString());
        ois.close();
    }

}