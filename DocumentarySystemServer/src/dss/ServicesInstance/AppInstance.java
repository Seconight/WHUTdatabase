package dss.ServicesInstance;

import java.sql.SQLException;

import dss.DAO.ApplicaitonDAO;
import dss.Object.Application;
import dss.Services.*;

public class AppInstance extends BaseServe implements AppApplications{

	@Override
	public boolean applyForDor(Application application) throws SQLException{
		// TODO Auto-generated method stub
		ApplicaitonDAO appDAO = new ApplicaitonDAO();
		if(appDAO.insert(application))
			return true;
		else
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
		Application result = null;
		ApplicaitonDAO appDAO = new ApplicaitonDAO();
		try {
			result = appDAO.search(number);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean deleteApplication(Application application) {
		// TODO Auto-generated method stub
		
		ApplicaitonDAO appDAO = new ApplicaitonDAO();
		try {
			if(appDAO.delete(application))
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
