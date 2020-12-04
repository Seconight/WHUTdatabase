package dss.ServicesInstance;

import dss.Object.Application;
import dss.Services.*;

public class AppInstance extends BaseServe implements AppApplications{

	@Override
	public boolean applyForDor(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applyForExit(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applyForChange(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Application searchApplication(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteApplication(Application application) {
		// TODO Auto-generated method stub
		return false;
	}

}
