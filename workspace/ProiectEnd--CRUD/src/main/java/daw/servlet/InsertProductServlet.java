package daw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertProductServlet")
public class InsertProductServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Preluare informatie de la noul produs din form
		String productName = request.getParameter("productName");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		double price = Double.parseDouble(request.getParameter("price"));

		response.sendRedirect("success.jsp"); 
}
}