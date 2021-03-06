package dss.ServicesInstance;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import dss.DAO.StudentDAO;
import dss.Object.Student;
import dss.Services.*;

public class StudentInstance extends BaseServe implements StudentApplications{

	@Override
	public Student studentLogin(String id, String password) {
		// TODO Auto-generated method stub
		
		Student result = null;
		
		try {
			StudentDAO studentDAO = new StudentDAO();
			Enumeration<Student> e = studentDAO.getAll();
			while (e.hasMoreElements()) {
				Student student = (Student) e.nextElement();
				if(student.getNubmer().equals(id) && student.getPassword().equals(password))
					result = student;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Student changePassword(String id, String uPassword, String newPassword) {
		Student result = null;
		try {
			StudentDAO studentDAO = new StudentDAO();
			Enumeration<Student> e = studentDAO.getAll();
			while (e.hasMoreElements()) {
				Student student = (Student) e.nextElement();
				if(student.getNubmer().equals(id) && student.getPassword().equals(uPassword))
				{	
					student.setPassword(newPassword);
					if(studentDAO.update(student)) {
						result = student;
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<Student> getStudentsInfo() {
		// TODO Auto-generated method stub
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		try {
			StudentDAO studentDAO = new StudentDAO();
			Enumeration<Student> e = studentDAO.getAll();
			while (e.hasMoreElements()) {
				Student student = (Student) e.nextElement();
				
				arrayList.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}

	@Override
	public Student studentRegister(Student currentStudent) {
		// TODO Auto-generated method stub
		
		Student result = null;
		try {
			StudentDAO studentDAO = new StudentDAO();
			if(studentDAO.insert(currentStudent)) {
				result = currentStudent;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	
	@Override
	public boolean updateStudent(Student currentStudent) {
		// TODO Auto-generated method stub
		
		try {
			StudentDAO studentDAO = new StudentDAO();
			if(studentDAO.update(currentStudent)) {
				return true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

}
