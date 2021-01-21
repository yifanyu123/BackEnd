import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * TODO 类描述
 *
 * @author xcw
 */
public interface ServerService extends Remote {
    User service() throws RemoteException;

}
