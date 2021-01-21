import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * TODO 类描述
 *
 * @author xcw
 */
public class ServerServiceImpl extends UnicastRemoteObject implements ServerService {

    private String name;

    public ServerServiceImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
        this.name="001";
    }

    @Override
    public User service() {
        User user = new User();
        user.setName("xcw");
        user.setAge(21);
        System.out.println("Server Service Starts:");
        return user;
    }
}
