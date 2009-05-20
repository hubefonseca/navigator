package mobilis.examples.navigator;

import mobilis.context.location.ISemanticLocationService;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;


public class NavigatorComponent extends mobilis.impl.Component {

	@Override
	public void registerDependencies() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerReceptacles() throws RemoteException {
		registerReceptacle("semanticLocation", ISemanticLocationService.class.getName());
	}

	@Override
	public void registerServices() throws RemoteException {
		registerService("navService", INavService.class.getName());
	}
 
	@Override
	public void start() throws RemoteException {
		Log.i(this.getClass().getName(), "Navigator component started!");
		
		try {
			Intent intent = new Intent(contextWrapper, NavigatorActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			contextWrapper.startActivity(intent);
			
			IBinder service = getBoundService("semanticLocation");
			ISemanticLocationService semanticLocationProvider = ISemanticLocationService.Stub.asInterface(service);
			
			Log.i(this.getClass().getName(), "Semantic location: " + semanticLocationProvider.getSemanticLocation());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() throws RemoteException {
		Log.i(this.getClass().getName(), "Navigator component stopped!");
	}

	@Override
	public String getCategory() throws RemoteException {
		return "mobilis.examples.navigator";
	}

}
