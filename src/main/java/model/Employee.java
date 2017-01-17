package model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true)
	private int id;

	@Column(name = "name", nullable = false, length = 255)
	private String name;
	@Column(name = "surname", nullable = false, length = 255)
	private String surname;
	@Column(name = "sex", nullable = false, length = 45)
	private String sex;
	@Column(name = "dept_no", nullable = false)
	private int deptNo;
	@Column(name = "sallary", nullable = false)
	private BigDecimal sallary;
	@Column(name = "age", nullable = false)
	private int age;
	@Column(name = "position", nullable = false)
	private String position;
	@Column(name = "children_quantity", nullable = false)
	private int childrenQuantity;
	@Column(name = "pesel", nullable = false, unique = true)
	private String pesel;
	@Column(name = "marital_status", nullable = false)
	private boolean maritalStatus; // true= ¿onaty, false = kawaler


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Employee() {

	}

	public Employee(String name, String surname, String sex, int deptNo, BigDecimal sallary, int age, String position,
			int childrenQuantity, String pesel, boolean maritalStatus) {
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.deptNo = deptNo;
		this.sallary = sallary;
		this.age = age;
		this.position = position;
		this.childrenQuantity = childrenQuantity;
		this.pesel = pesel;
		this.maritalStatus = maritalStatus;
	}

	public Employee(int id, String name, String surname, String sex, int deptNo, BigDecimal sallary, int age,
			String position, int childrenQuantity, String pesel, boolean maritalStatus) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.deptNo = deptNo;
		this.sallary = sallary;
		this.age = age;
		this.position = position;
		this.childrenQuantity = childrenQuantity;
		this.pesel = pesel;
		this.maritalStatus = maritalStatus;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public BigDecimal getSallary() {
		return sallary;
	}

	public void setSallary(BigDecimal sallary) {
		this.sallary = sallary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getChildrenQuantity() {
		return childrenQuantity;
	}

	public void setChildrenQuantity(int childrenQuantity) {
		this.childrenQuantity = childrenQuantity;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

}
