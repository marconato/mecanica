package br.com.faesi.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.faesi.vo.Atendimento;


	@WebServlet("/AtendimentoController")
	public class AtendimentoController extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	   private br.com.faesi.dao.AtendimentoDao AtendimentoDao; 
	   
	    public AtendimentoController() {
	        super();
	        this.AtendimentoDao = new br.com.faesi.dao.AtendimentoDao();
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("!!!!");
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String marca = request.getParameter("marca");
			String modelo = request.getParameter("modelo");
			String placa = request.getParameter("placa");
			String anomalia = request.getParameter("anomalia");
			
			Atendimento atendimento = new Atendimento();
			
			atendimento.setMarca(marca);
			atendimento.setModelo(modelo);
			atendimento.setPlaca(placa);
			atendimento.setAnomalia(anomalia);
			atendimento.setDataEntrada(Calendar.getInstance().getTime());
			
			boolean result = AtendimentoDao.inserir(atendimento);
			if(result == true){
				response.sendRedirect("servico.jsp");
			}
			else{
				System.out.println("erro tente outra vez");
				
			}
			
			
		}

}



