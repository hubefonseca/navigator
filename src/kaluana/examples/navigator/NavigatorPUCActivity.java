package kaluana.examples.navigator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class NavigatorPUCActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i(this.getClass().getName(), "Puc Activity loaded");
		
		setContentView(R.layout.puc);
	}

}
