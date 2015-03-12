package br.com.faesi.teste;

import br.com.faesi.dao.AtendimentoDao;
import br.com.faesi.vo.Atendimento;


public class InserirAtendimento {

	
	public static void main(String[] args) {
		AtendimentoDao dao = new AtendimentoDao();
		
		Atendimento atendimento = new Atendimento();
		atendimento.setMarca("toyota");
		atendimento.setModelo("corolla");
		atendimento.setPlaca("aaa-1111");
		atendimento.setAnomalia("defeito no freio");
	
		if (dao.inserir(atendimento)){
			System.out.println("Atendimento ok");
		}else{
			System.out.println(" nao foi possivel executar o atendimento");
		}

	}


}
