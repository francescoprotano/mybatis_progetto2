package it.exolab;

import it.exolab.dao.CorsoDAO;
import it.exolab.dao.StudenteDAO;
import it.exolab.model.Corso;
import it.exolab.model.Studente;

public class Test2 {

	public static void main(String[] args) {
		StudenteDAO dao = new StudenteDAO();
		Studente model = dao.findAndJoinCorso(1L);
		System.out.println("email studente " +model.getEmail());
		
		
		
		

	}

}
