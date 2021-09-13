<%@page import="modelo.ModeloMascota"%>
<%@page import="entidad.Mascota"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="validar.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta lang="es" />
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Veterinaria</title>
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
				<%
				ModeloMascota ma = new ModeloMascota();
				ArrayList<Mascota> mascotas = ma.Listar();
				request.setAttribute("mascotas", mascotas);
				%>
				<table
					class="table is-bordered  is-narrow is-hoverable is-fullwidth">
					<thead>
						<tr>
							<th>idMascota</th>
							<th>tipoMascota</th>
							<th>edadMascota</th>
							<th>nombreMascota</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${mascotas}" var="mascota">
							<tr>
								<td>${mascota.idMascota}</td>
								<td>${mascota.tipoMascota}</td>
								<td>${mascota.edadMascota}</td>
								<td>${mascota.nombreMascota}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="column is-4 is-offset-4 mb-1">
					<h3 class="title has-text-black">Registrar Mascota</h3>
					<form action="mascota" method="post">
						<div class="box">
							<div class="field">
								<div class="control">
									<input name="rutDuenio" class="input" type="text" required
										placeholder="Rut Dueño" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="tipo" class="input" type="text" required
										placeholder="Tipo Mascota" autofocus />
								</div>
							</div>

							<div class="field">
								<div class="control">
									<input name="nombre" class="input" type="text" required
										placeholder="Nombre Mascota" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="edad" class="input" type="number" required
										placeholder="Edad Mascota" autofocus />
								</div>
							</div>
							<button type="submit"
								class="button is-block is-info is-large is-fullwidth">
								Registrar Mascota <i class="fa fa-sign-in" aria-hidden="true"></i>
							</button>
						</div>

						<c:set var="mensaje" value="${requestScope.mensaje}" />
						<c:if test="${not empty mensaje}">
							<div class='notification is-danger mb-1'>
								<h4 class='title is-4'>${mensaje}</h4>
							</div>
						</c:if>

					</form>

				</div>
			</div>
		</div>
	</section>
</body>
</html>
