package test;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import dao.EmployeeHibernateDao;

public class EmployeeDeleteByIdTest {

	private EmployeeHibernateDao classUnderTest;
	

	@Before
	public void setUp() {
		
		 classUnderTest = mock(EmployeeHibernateDao.class);
		
		 classUnderTest = new EmployeeHibernateDao();
	}

	@Test(expected = Exception.class)
	public void DeleteByIdTest() throws SQLException {
		int id = 11;
		doThrow(new Exception()).doNothing().when(classUnderTest).deleteById(id);
		
		classUnderTest.deleteById(id);

	}

}
