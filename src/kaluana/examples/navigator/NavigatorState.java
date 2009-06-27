package kaluana.examples.navigator;

import kaluana.impl.adaptation.InternalState;
import android.os.Parcel;

public class NavigatorState extends InternalState {

	private String myInfo ;
	
	public String getMyInfo() {
		return myInfo;
	}

	public void setMyInfo(String myInfo) {
		this.myInfo = myInfo;
	}

	@Override
	public void readFromParcel(Parcel in) {
		this.myInfo = in.readString();
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
		arg0.writeString(myInfo);
	}
	
}
