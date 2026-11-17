package it.exolab;

import it.exolab.dao.StudenteDAO;
import it.exolab.model.Studente;

public class Test3 {

	public static void main(String[] args) {
		StudenteDAO dao = new StudenteDAO();
		
		
		dao.delete(2L);

	}

}
