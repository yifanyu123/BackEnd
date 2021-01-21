package dynamic;

/**
 * 实际类
 *
 * @author xcw
 */
public class RealSubject implements Subject {

    public void request() {
        System.out.println("====RealSubject Request====");
    }
}
