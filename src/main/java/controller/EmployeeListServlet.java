package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeHibernateDao;
import model.Employee;
@WebServlet("/list")
public class EmployeeListServlet extends HttpServlet {

	
	private EmployeeHibernateDao employeeDao = new EmployeeHibernateDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			List<Employee> employeeList = employeeDao.findAll();
			req.setAttribute("employeeList", employeeList);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/tabel.jsp");
		requestDispatcher.forward(req, resp);
		
		
		
	}
	
	
	
	
}
