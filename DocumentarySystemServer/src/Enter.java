
import dss.Object.*;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;

import dss.DAO.*;

public class Enter {
	public static void main(String[] args) throws SQLException {
		StudentDAO dao = new StudentDAO();
		dao.flush();
		//
		Enumeration<Student> e = dao.studentTable.elements();
		while(e.hasMoreElements()) {
			Student current = e.nextElement();
			System.out.println("this is "+current.getName());
			System.out.println(current.getSroom());
			Student addNew = new Student("201800010002",20,"Õı”Ó","CS",1,"321",null);
			boolean oo = dao.insert(addNew);
			if(oo) System.out.println("insert success");
		}
	}
}
