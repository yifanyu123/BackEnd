import java.rmi.Naming;

/**
 * TODO 类描述
 *
 * @author xcw
 */
public class ClientApplication {

    public static void main(String args[]) {
        String url = "rmi://localhost:8888/";
        try {
            // 在RMI服务注册表中查找名称为server-service的对象，并调用其上的方法
            ServerService service = (ServerService) Naming.lookup(url + "server-service");

            Class stubClass = service.getClass();
            System.out.println(service + " 是 " + stubClass.getName() + " 的实例！");

            // 获得本底存根已实现的接口类型
            Class[] interfaces = stubClass.getInterfaces();
            for (Class c : interfaces) {
                System.out.println("存根类实现了 " + c.getName() + " 接口！");
            }
            System.out.println(service.service());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
