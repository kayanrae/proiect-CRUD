<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Product</title>
</head>
<body>

	<h2>Delete Product</h2>

	<form action="DeleteProductServlet" method="post">
		<label for="productId">Product ID:</label> <input type="text"
			id="productId" name="productId" required><br>

		<button type="submit">Delete Product</button>
	</form>

</body>
</html>
