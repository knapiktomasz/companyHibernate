package controller;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeHibernateDao;

@WebServlet("/employee-delete")
public class EmployeeDeleteServlet extends HttpServlet{
	
	private EmployeeHibernateDao employeeDao = new EmployeeHibernateDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 int id = Integer.parseInt(req.getParameter("id"));
		
		try {
			employeeDao.deleteById(id);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		resp.sendRedirect(req.getContextPath() +"/list");
		
	}
	
	

}
