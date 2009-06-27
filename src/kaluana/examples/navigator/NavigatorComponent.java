package kaluana.examples.navigator;

import kaluana.api.annotations.Component;
import kaluana.api.annotations.Receptacle;
import kaluana.api.annotations.Service;
import kaluana.context.location.ISemanticLocationService;
import kaluana.impl.adaptation.InternalState;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;

@Component(category="kaluana.examples.navigator")
public class NavigatorComponent extends kaluana.impl.Component {

	@Receptacle
	ISemanticLocationService semanticLocation;
	
	@Service
	INavService navService;
 
	@Override
	public void start() throws RemoteException {
		Log.i(this.getClass().getName(), "Navigator component started!");
		
		try {
			Intent intent = new Intent(contextWrapper, NavigatorActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			contextWrapper.startActivity(intent);
			
			Log.i(this.getClass().getName(), "Semantic location: " + semanticLocation.getSemanticLocation());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() throws RemoteException {
		Log.i(this.getClass().getName(), "Navigator component stopped!");
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
	
	public void setSemanticLocation(ISemanticLocationService semanticLocation) {
		this.semanticLocation = semanticLocation;
	}

}
