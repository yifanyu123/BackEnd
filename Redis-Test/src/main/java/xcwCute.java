//import Student.java;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;


public class xcwCute {
    public static void main(String args[]) {
       // String text = "{\"@type\":\"cuteXcw.Student\",\"name\":\"ZhangSan\",\"age\":123}";
       // Student obj1 = JSON.parseObject(text, Student.class, Feature.SupportNonPublicField);
        Student student = new Student();
       /// student.setName("xcw");
      //  student.setAge(11);
        String studentJson = JSON.toJSONString(student);
        System.out.println     (studentJson);
        //System.out.println(obj1.getName());
        Student student1 = JSON.parseObject(studentJson, Student.class, Feature.SupportNonPublicField);
        System.out.println(student1);
    }
}
