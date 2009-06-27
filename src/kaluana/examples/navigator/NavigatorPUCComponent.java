package kaluana.examples.navigator;

import kaluana.api.annotations.Component;
import kaluana.impl.adaptation.InternalState;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;

@Component(category="kaluana.examples.navigator")
public class NavigatorPUCComponent extends kaluana.impl.Component {

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
	public InternalState getInternalState() {
//		NavigatorState navState = new NavigatorState();
		
		InternalState state = new InternalState();
		state.setMyInfo("i was a navigator");
		return state;
	}
	
	@Override
	public void setInternalState(InternalState state) {
		Log.d(this.getClass().getName(), "component state received");
		Log.d(this.getClass().getName(), state.getMyInfo());
	}
	
}
