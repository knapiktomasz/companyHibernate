package dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import db.HibernateConfig;
import model.Employee;

public class EmployeeHibernateDao {

	public void save(Employee employee) throws SQLException {
		Session session = HibernateConfig.openSession();
		session.save(employee);
		session.close();
	}

	public Employee findById(Integer id) throws SQLException {
		Session session = HibernateConfig.openSession();
		Employee employee = session.get(Employee.class, id);
		session.close();
		return employee;
	}

	public List<Employee> findAll() throws SQLException {
		Session session = HibernateConfig.openSession();
		Query query = session.createQuery("SELECT e FROM Employee e");
		List<Employee> employee = query.getResultList();
		session.close();
		return employee;
	}

	public void update(Employee employee) throws SQLException {
		Session session = HibernateConfig.openSession();
		session.beginTransaction();
		session.update(employee);
		session.getTransaction().commit();
		session.close();

	}

	public void deleteById(Integer id) throws SQLException {
		Session session = HibernateConfig.openSession();
		session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
	}

}
