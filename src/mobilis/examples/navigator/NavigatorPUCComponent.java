package mobilis.examples.navigator;

import mobilis.api.ComponentInfo;
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
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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
	
	@Override
	public ComponentInfo getInternalState() {
//		NavigatorState navState = new NavigatorState();
		
		ComponentInfo state = new ComponentInfo();
		state.setMyInfo("i was a navigator");
		return state;
	}
	
	@Override
	public void setInternalState(ComponentInfo state) {
		Log.d(this.getClass().getName(), "component state received");
		Log.d(this.getClass().getName(), state.getMyInfo());
	}
	
}
