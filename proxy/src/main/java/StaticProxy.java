/**
 * 静态代理测试
 *
 * @author zhenkui
 */
public class StaticProxy {

    public static void main(String args[]) {
        RealSubject1 subject = new RealSubject1();
        Proxy p = new Proxy(subject);
        p.request();
    }
}

interface Subject {

    void request();
}

class RealSubject1 implements dynamic.Subject {

    public void request() {
        System.out.println("request");
    }
}

class Proxy implements dynamic.Subject {

    private dynamic.Subject subject;

    public Proxy(dynamic.Subject subject) {
        this.subject = subject;
    }

    public void request() {
        System.out.println("PreProcess");
        subject.request();
        System.out.println("PostProcess");
    }
}
