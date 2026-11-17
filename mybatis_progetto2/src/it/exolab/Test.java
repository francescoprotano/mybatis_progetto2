package it.exolab;

import it.exolab.dao.CorsoDAO;
import it.exolab.model.Corso;

public class Test {

	public static void main(String[] args) {
		Corso model = new Corso("java","aula1","programmazione");
		CorsoDAO dao = new CorsoDAO();
		dao.insert(model);

	}

}
