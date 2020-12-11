package dss.ServicesInstance;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import dss.Object.Pact;
import dss.Object.Student;
import dss.Services.*;
import dss.DAO.PactDAO;
import dss.DAO.StudentDAO;
public class PactInstance extends BaseServe implements PactApplications {


	
	@Override
	public boolean addNewPact(Pact currentPact) throws SQLException{
		// TODO Auto-generated method stub
		PactDAO pactDAO = new PactDAO();
		if(pactDAO.insert(currentPact)) 
			return true;
		else
		return false;
	}

	@Override
	public boolean deletePact(Pact currentPact) throws SQLException{
		// TODO Auto-generated method stub
		
		PactDAO pactDAO = new PactDAO();
		if(pactDAO.delete(currentPact))
			return true;
		else
		return false;
	}

	@Override
	public boolean uploadPact(Pact currentPact) throws SQLException{
		// TODO Auto-generated method stub
		PactDAO pactDAO = new PactDAO();
		if(pactDAO.update(currentPact))
			return true;
		else
		return false;
	}

	@Override
	public Pact checkStuPact(Student currentStudent) throws SQLException{
		// TODO Auto-generated method stub
		Pact result = null;
		PactDAO pactDAO = new PactDAO();
		Enumeration<Pact> e = pactDAO.getAll();
		while (e.hasMoreElements()) {
			Pact pact = (Pact) e.nextElement();
			if(pact.getPSNo().equals(currentStudent.getNubmer())) {
				result = pact;
			}
		}
		return result;
	}

	@Override
	public List<Pact> getAllPacts() throws SQLException{
		// TODO Auto-generated method stub
		ArrayList<Pact> pactSet = new ArrayList<Pact>();
		PactDAO pactDAO = new PactDAO();

		Enumeration<Pact> e = pactDAO.getAll();
		while (e.hasMoreElements()) {
			Pact pact = (Pact) e.nextElement();
			pactSet.add(pact);
		}
		return pactSet;
	}

}
