import org.junit.Test;

/**
 * TODO 类描述
 *
 * @author zhenkui
 */
public class MyThreadTest {
    @Test
    public void runThread(){
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("运行结束!");
    }
}
