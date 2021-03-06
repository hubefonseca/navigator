package kaluana.examples.navigator;

import kaluana.api.control.ILocalLoader;
import kaluana.impl.control.LocalLoader;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class NavigatorComponentLoader extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		return mComponentManager;
	}

	private final ILocalLoader.Stub mComponentManager = new LocalLoader(new NavigatorComponent(), this);
	
}
