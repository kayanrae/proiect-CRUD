package daw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateProductServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Preluare din date
		String productName = request.getParameter("productName");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		double price = Double.parseDouble(request.getParameter("price"));

		// Procesare date

		// Redirect catre o alta pagina
		response.sendRedirect("success.jsp");
	}
}