//MatrixServer.java
package peiying;
import java.rmi.*;
public interface MatrixServer extends Remote{
	public int[][] caculate(Task task) throws RemoteException;
}
