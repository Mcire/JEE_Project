<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<form method="POST" action="login">
			<pre>
				<div>
					Username: <input type="username" name="username" />
				</div>
				<div>
					Password: <input type="password" name="password" />
				</div>				
				<input type="submit" name="valide" value="Valider" />
			</pre>
		</form>
	</body>
</html>