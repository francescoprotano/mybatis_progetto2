package it.exolab;

import it.exolab.dao.StudenteDAO;
import it.exolab.model.Studente;

public class Test1 {

	public static void main(String[] args) {
		StudenteDAO dao = new StudenteDAO();
		Studente model = dao.findAndJoinCorso(1L);
		System.out.println("corso seguito "+ model.getCorso().getNome());
		
		

	}

}
