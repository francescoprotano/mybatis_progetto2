ISTRUZIONI:

	- usare il file install.sql per generare il database
	
PROBLEMI DA RISOLVERE:

	- Eseguendo la classe Test1, Test2 o Test3 ho questo errore
	
		Exception in thread "main" org.apache.ibatis.binding.BindingException: Type interface it.exolab.mapper.StudenteMapper is not known to the MapperRegistry.
		at org.apache.ibatis.binding.MapperRegistry.getMapper(MapperRegistry.java:47)
		at org.apache.ibatis.session.Configuration.getMapper(Configuration.java:899)
		at org.apache.ibatis.session.defaults.DefaultSqlSession.getMapper(DefaultSqlSession.java:291)
		
		
	
	- Ho sistemato il punto 1, ora se eseguo il Test1 non stampa il nome del corso ma il nome dello studente. Perchè?
	
	- Se eseguo il Test2 non stampa la email dello studente, eppure c'è. Perchè?
	
	- Se eseguo il Test3 non cancella lo studente. Perchè?
	
	
	  