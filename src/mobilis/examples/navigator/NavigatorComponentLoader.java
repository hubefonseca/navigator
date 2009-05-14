package mobilis.examples.navigator;

import mobilis.api.control.ILocalLoader;
import mobilis.impl.control.LocalLoader;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class NavigatorComponentLoader extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return mComponentManager;
	}

	private final ILocalLoader.Stub mComponentManager = new LocalLoader(new NavigatorComponent());
	
}
