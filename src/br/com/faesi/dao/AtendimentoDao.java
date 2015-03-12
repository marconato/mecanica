package br.com.faesi.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.faesi.util.HibernateUtils;
import br.com.faesi.vo.Atendimento;


public class AtendimentoDao {
		
		private Session session;
		
		public AtendimentoDao(){
			this.session = HibernateUtils.getInstance().getSession();
		}
		
		public boolean inserir(Atendimento atendimento){
			Transaction tx = this.session.beginTransaction();
			
			try {
				// Salva o aplicativo no banco de dados
				this.session.save(atendimento);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
				return false;
			}		
			
			return true;
		}
		
		public boolean removerPorId(Long id){
			Transaction tx = this.session.beginTransaction();
			
			try {
				// Carrega um atendimento através do id 
				Atendimento atendimento = (Atendimento) this.session.load(Atendimento.class, id);
				// Remove o atendimento
				this.session.delete(atendimento);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
				return false;
			}
			
			return true;
		}

		
		public boolean atualizar(Atendimento atendimento){
			Transaction tx = this.session.beginTransaction();
			
			try {
				// Atualiza o atendimento
				this.session.update(atendimento);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
				return false;
			}
			
			return true;
		}
		
		public List<Atendimento> listarTodos(){
			// Lista os registros da tabela aplicativo
			Query query = this.session.createQuery("from Atendimento");
			return query.list();
		}

}