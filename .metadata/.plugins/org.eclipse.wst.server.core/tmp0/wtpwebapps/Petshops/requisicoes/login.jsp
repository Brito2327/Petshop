<%@page import="bean.Usuario" %>
<%@page import="dao.UsuarioDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <%
	
	//Obter e-mail e senha
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	
	//validar login
	UsuarioDao u = new UsuarioDao();
	int contador = u.verificarLogin(email, senha);
	
	
	//condicional
	if(contador==0){
		response.sendRedirect("../index.jsp");
	}else{
		Usuario ub = new Usuario(email, senha);
		out.print(ub.getEmail());
		session.setAttribute("usuario",ub);
		response.sendRedirect("../index.jsp");
	}
	
	
	
	
	%>