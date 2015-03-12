package br.com.faesi.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtils {
	
	// Atributo que representa a instancia singleton
	private static HibernateUtils singleton;
	
	private Session session;
	
	// Método que retorna a instancia singleton
	public static HibernateUtils getInstance(){
		if (singleton == null){
			singleton = new HibernateUtils();
		}
		
		return singleton;
	}
	
	public HibernateUtils(){
		AnnotationConfiguration configuration = new	AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		this.session = factory.openSession();
	}
	
	public Session getSession() {
		return session;
	}
	
}
