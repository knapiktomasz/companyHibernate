package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import dao.EmployeeHibernateDao;
import model.Employee;

public class EmployeeFindByIdTest {
	
	private EmployeeHibernateDao classUnderTest;
	
	@Before
	public void setUp() {
		
		classUnderTest = new EmployeeHibernateDao();
		
	}
	@Test
	public void FindByIdTest() throws SQLException{
		Employee test = classUnderTest.findById(1);
		assertNotNull(test.getPesel());
				
	}

}
