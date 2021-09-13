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
    <title>Veterinaria</title>
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Questrial&display=swap"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://unpkg.com/bulma@0.9.0/css/bulma.min.css"
    />
    <link rel="stylesheet" type="text/css" href="css/login.css" />
  </head>
  <body>
	    <section class="hero is-info is-bold is-fullheight">
		<div class="hero-body">
			<div class="container has-text-centered">
				<div class="column is-4 is-offset-4 mb-1">
					<h3 class="title has-text-black">Registrar Dueño</h3>
					<hr class="login-hr" />
					<form action="duenio" method="post">
						<div class="box">
							<div class="field">
								<div class="control">
									<input name="rut" class="input" type="text"
										required placeholder="RUT" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="nombre" class="input" type="text"
										required placeholder="Nombre" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="apellido" class="input" type="text"
										required placeholder="Apellido" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="direccion" class="input" type="text"
										required placeholder="Direccion" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="correo" class="input" type="email"
										required placeholder="Correo electronico" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="telefono" class="input" type="text"
										required placeholder="Telefono" autofocus />
								</div>
							</div>
							<div class="field">
								<div class="control">
									<input name="nombreMascota" class="input" type="text"
										required placeholder="Nombre de mascota" autofocus />
								</div>
							</div>
							<button type="submit"
								class="button is-block is-info  is-fullwidth">
								Registrar Dueño <i class="fa fa-sign-in" aria-hidden="true"></i>
							</button>
						</div>
						
							<c:set var="mensaje" value="${requestScope.mensaje}" />
							<c:if test="${not empty mensaje}">
								<div class='notification is-danger mb-1'>
							    	<h4 class='title is-4'> ${mensaje}</h4> 
								</div>
							</c:if>
					
					</form>
				</div>
			</div>
		</div>
	</section>
	</body>
</html>