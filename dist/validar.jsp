<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	if (session.getAttribute("usuario") == null) {
		request.setAttribute("mensaje", "Debe autenticarse para ingresar al sistema");
		pageContext.forward("index.jsp");
	}
%>