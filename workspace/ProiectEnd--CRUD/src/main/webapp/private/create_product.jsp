<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Product</title>
</head>
<body>

	<h2>Adaugare Produs Nou.</h2>

	<form action="CreateProductServlet" method="post">
		<label for="productName">Product Name:</label> <input type="text"
			id="productName" name="productName" required><br> <label
			for="quantity">Quantity:</label> <input type="number" id="quantity"
			name="quantity" required><br> <label for="price">Price:</label>
		<input type="text" id="price" name="price" required><br>

		<button type="submit">Create Product</button>
	</form>

</body>
</html>
