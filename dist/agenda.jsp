<%@page import="modelo.ModeloAgenda"%>
<%@page import="entidad.Agenda"%>
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
				ModeloAgenda ma = new ModeloAgenda();
				ArrayList<Agenda> citas = ma.Listar();
				request.setAttribute("citas", citas);
				%>
				<table
					class="table is-bordered  is-narrow is-hoverable is-fullwidth">
					<thead>
						<tr>
							<th>id</th>
							<th>idMascota</th>
							<th>rutDuenio</th>
							<th>nombreMascota</th>
							<th>hora</th>
							<th>fecha</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${citas}" var="cita">
							<tr>
								<td>${cita.id}</td>
								<td>${cita.idMascota}</td>
								<td>${cita.rutDuenio}</td>
								<td>${cita.nombreMascota}</td>
								<td>${cita.hora}</td>
								<td>${cita.fecha}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="column is-4 is-offset-4 mb-1">
					<h3 class="title has-text-black">Agendar Cita</h3>
					<form action="agenda" method="post">
						<div class="box">
							<div class="field">
								<div class="control">
									<input name="idMascota" class="input" type="text" required
										placeholder="Id Mascota" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="rutDuenio" class="input" type="text" required
										placeholder="Rut Dueño" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="nombreMascota" class="input" type="text" required
										placeholder="Nombre Mascota" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="hora" class="input" type="time" required
										placeholder="Hora" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="fecha" class="input" type="date" required
										placeholder="Fecha" autofocus />
								</div>
							</div>
							<button type="submit"
								class="button is-block is-info  is-fullwidth">
								Agendar Cita <i class="fa fa-sign-in" aria-hidden="true"></i>
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