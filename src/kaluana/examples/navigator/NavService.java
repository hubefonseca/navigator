package kaluana.examples.navigator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class NavService extends Service {
	
	@Override
	public IBinder onBind(Intent intent) {
		return mNavImpl;
	}
	
	private final INavService.Stub mNavImpl = new INavService.Stub() {

		@Override
		public void nav() throws RemoteException {
			Log.i(this.getClass().getName(), "nav!");
		}
		
    };

}
