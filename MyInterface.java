import java.rmi.Remote;
import java.rmi.RemoteException;
 
// Remote interface — must extend java.rmi.Remote
public interface MyInterface extends Remote {
    // Every remote method must declare RemoteException
    int add(int a, int b) throws RemoteException;
}