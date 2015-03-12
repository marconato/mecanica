<%@page import="br.com.faesi.vo.Atendimento"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:useBean id="dao" class="br.com.faesi.dao.AtendimentoDao"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<table border="1"  width="75%">
		<tr><H1 ALIGN="LEFTH"> AUTO MECÂNICA ZERO BALA </H1>
			<td width="10%">MARCA</td>
			<td width="15%">MODELO</td>
			<td width="10%">PLACA</td>
			<td width="25%">ANOMALIA</td>
			<td width="5%">AGUARDANDO</td>
			<td width="5%">EM SERVIÇO</td>
			<td width="5%">CONCLUIDO</td>		
		</tr>

	<% List<Atendimento> atendimento = dao.listarTodos();
	
	for(int i=0; i< atendimento.size(); i++){

	%>
			<tr>
				<td><%=atendimento.get(i).getMarca() %> </td>
				<td><%=atendimento.get(i).getModelo() %> </td>
				<td><%=atendimento.get(i).getPlaca() %> </td>
				<td><%=atendimento.get(i).getAnomalia() %> </td>
				<td><%=atendimento.get(i).getDataEntrada() %> </td>
				<td><%=atendimento.get(i).getDataServico() %> </td>
				<td><%=atendimento.get(i).getDataConclusao() %> </td>
			</tr>

		<% 
		} 
		%>		

</form>

</table>

		<BR><a href="novoVeiculo.jsp"> ENTRADA DE NOVO VEICULO</a>

</body>
</html>