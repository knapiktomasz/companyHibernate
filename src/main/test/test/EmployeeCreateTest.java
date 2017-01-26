package test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import model.Employee;

public class EmployeeCreateTest {

	private Employee classUnderTest;

	@Before
	public void setUp() {

		classUnderTest = new Employee();

	}

	@Test
	public void EmployeeCreateTest ()  {
		String name = "Adam";
		String surname = "Kowalski";
		String sex = "M";
		int deptNo = 1;
		BigDecimal sallary = new BigDecimal("12345.52");
		int age = 27;
		String position = "map";
		int childrenQuantity = 1;
		String pesel = "1234";
		boolean maritalStatus = false;
		classUnderTest = new Employee(name, surname, sex, deptNo, sallary, age, position, childrenQuantity, pesel,
				maritalStatus);

	 assertEquals("Adam",classUnderTest.getName());
	

	}

}
