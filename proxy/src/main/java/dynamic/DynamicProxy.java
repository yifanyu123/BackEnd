package dynamic;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author zhenkui
 */
public class DynamicProxy {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();    //1.创建委托对象
        ProxyHandler handler = new ProxyHandler(realSubject);   //2.创建调用处理器对象
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), handler);    //3.动态生成代理对象
        proxySubject.request(); //4.通过代理对象调用方法
    }
}
