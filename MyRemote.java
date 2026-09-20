import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 
// Remote object — extends UnicastRemoteObject to be exported for RMI calls
public class MyRemote extends UnicastRemoteObject implements MyInterface {
 
    public MyRemote() throws RemoteException {
        super();
    }
 
    public int add(int a, int b) {
        return a + b;
    }
}
 