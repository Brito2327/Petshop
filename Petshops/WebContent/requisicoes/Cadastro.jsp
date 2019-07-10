<%@page import="bean.Usuario" %>
<%@page import="dao.UsuarioDao" %>
<%@page import="bean.Cliente" %>
<%@page import="dao.ClienteDao" %>
<%@page import="bean.Endereco" %>
<%@page import="dao.EnderecoDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%

String email = request.getParameter("email");
String senha = request.getParameter("senha");
String nome = request.getParameter("nome");
String telefone = request.getParameter("telefone");
String rua = request.getParameter("rua");
String bairro = request.getParameter("bairro");
String numero = request.getParameter("numero");
String cidade = request.getParameter("cidade");
String estado = request.getParameter("estado");
String cep = request.getParameter("cep");



	Usuario usuario = new Usuario(email,senha);
	UsuarioDao dao = new UsuarioDao();
	
	dao.Cadastrar(usuario);
	
	Endereco endereco = new Endereco(rua,bairro,numero,cidade,cep,estado);
	EnderecoDao endAo = new EnderecoDao();
	
	endAo.cadastrar(endereco);
	
	Cliente cliente = new Cliente( nome, email, telefone, usuario.getId(), endereco.getId());
	ClienteDao clidAo =new ClienteDao();
	clidAo.cadastrar(cliente);
	
	int contador = dao.verificarLogin(usuario.getEmail(),usuario.getSenha());
	
	if(contador==0){
		response.sendRedirect("../index.jsp?menssagem=falhalogin");
	}else{
		Usuario ub = new Usuario(email, senha);
		out.print(ub.getEmail());
		session.setAttribute("usuario",ub);
		response.sendRedirect("../index.jsp");
	}
	
	
	
	

%>