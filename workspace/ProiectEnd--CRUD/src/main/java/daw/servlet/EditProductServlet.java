package daw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditProductServlet")
public class EditProductServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		String newProductName = request.getParameter("productName");
		int newQuantity = Integer.parseInt(request.getParameter("quantity"));
		double newPrice = Double.parseDouble(request.getParameter("price"));

		response.sendRedirect("success.jsp"); 
	}
}
