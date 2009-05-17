package mobilis.examples.navigator;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;


public class NavigatorPUCComponent extends mobilis.impl.Component {

	@Override
	public void registerDependencies() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerReceptacles() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerServices() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() throws RemoteException {
		Log.d(this.getClass().getName(), "Navigator PUC started!");
		
		Intent intent = new Intent(contextWrapper, NavigatorPUCActivity.class);
		contextWrapper.startActivity(intent);
	}

	@Override
	public void stop() throws RemoteException {
		Log.d(this.getClass().getName(), "Navigator PUC stopped!");
	}

	@Override
	public String getCategory() throws RemoteException {
		return "mobilis.examples.navigator";
	}
	
}
