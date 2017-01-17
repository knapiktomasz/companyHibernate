package controller;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeHibernateDao;
import model.Employee;

@WebServlet("/employee-edit")
public class EmployeeEditServlet extends HttpServlet{

	private EmployeeHibernateDao employeeDao = new EmployeeHibernateDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		try {
			Employee employee = employeeDao.findById(id);
			req.setAttribute("employeeForm", employee);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/form.jsp");
			requestDispatcher.forward(req, resp);
		} catch (SQLException e) {
			resp.sendRedirect(req.getContextPath() + "/list");
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String sex = req.getParameter("sex");
		int deptNo = Integer.parseInt(req.getParameter("deptNo"));
		BigDecimal sallary = new BigDecimal(req.getParameter("sallary"));
		int age = Integer.parseInt(req.getParameter("age"));
		String position = req.getParameter("position");
		int childrenQuantity = Integer.parseInt(req.getParameter("childrenQuantity"));
		String pesel = req.getParameter("pesel");
		
		boolean maritalStatus = req.getParameter("maritalStatus").equals("true");

		Employee employee = new Employee(id, name, surname, sex, deptNo, sallary, age, position, childrenQuantity, pesel,
				maritalStatus);
		
		try {
			employeeDao.update(employee);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		resp.sendRedirect(req.getContextPath() + "/list");
	}

}
