<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="AtendimentoController" method="Post">
	
	

<table border="1" width="25%">
	
	<tr> <h1>VEICULO </h1>
	
	<td>MARCA: <input type="text" name="marca" size="50"/><br></td>
	</TR>
	<BR>
	
	<TR>
	<td>MODELO: <input type="text" name="modelo" size="50"/><BR></td>
	</TR>
	
	<TR>
	<td>PLACA: <input type="text" name="placa" size="50"/><BR></td>
	</TR>
	
	<TR>
	<td>ANOMALIA: <input type="text" name="anomalia" size="50"/><BR></td>
	</TR>
	
	
	</table>
		<input type="submit" value="salvar" href="servico.jsp"><p>
		
		<a href= "index.jsp"> VOLTAR PARA MENU</a>
	
	</form>


</body>
</html>