package com.indracompany;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class App {

	public EntityManager em;
	
	void getServicosup_name(String sup_name) {
		
        String sum = (String) em.createNativeQuery("PR_RETORNA_SERVICO_ASSOC_CLIENTE")
                      .setParameter(1, sup_name)
                      .getSingleResult(); 
        System.out.println("servico: " + sum +"<br/>");
	}
	
	}

