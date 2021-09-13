<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="validar.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta lang="es" />
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Control de acceso</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css?family=Questrial&display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://unpkg.com/bulma@0.9.0/css/bulma.min.css" />
<link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<body>
	<section class="hero is-info is-bold is-fullheight">
		
		<div class="hero-body">
			<div class="container has-text-centered">
				<div class="column is-4 is-offset-4 mb-1">
					<h3 class="title ">Menu Principal</h3>
					<h3 class="subtitle">Bienvenido ${sessionScope.usuario.nombreUsuario}</h3>
					<a href="mascota.jsp" class="button is-block is-success">Control de
						Mascotas</a> 
					<a href="duenio.jsp" class="button is-block is-success">Control de
						Dueños</a>
					<a href="agenda.jsp" class="button is-block is-success">Control de
						Agendas</a>
					<jsp:include page="cabecera.jsp" />
				</div>
			</div>
		</div>
	</section>
</body>
</html>
