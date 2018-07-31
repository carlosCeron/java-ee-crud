<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

	<div class="container">
	
		<h1>Editar Usuario</h1>
		<hr>
		<form method="POST" action="new" style="margin:100px 200px;">
			<div class="form-group">
				<label>Nombre:</label>
				<input  type="text" name="nombre" class="form-control"  value='${usuario.nombre}'/>
			</div>
			<div class="form-group">
				<label>correo:</label>
				<input  type="text" name="correo" class="form-control" value='${usuario.correo}'/>
			</div>
			<div class="form-group">
				<label>celular:</label>
				<input  type="text" name="movil" class="form-control" value='${usuario.movil}'/>
			</div>
			<div>
				<button type="submit" class="btn btn-default">Enviar</button>
				<button type="submit" class="btn btn-danger">Cancelar</button>
			</div>
		</form>
	</div>

	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>