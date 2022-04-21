package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc{
	
	
	@Test
	public void initbanco() {
	
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
	//	userposjava.setId(5);
	//	userposjava.setEmail("lacasw@gmail.com");
		//userposjava.setNome("Lucao");
		System.out.println("Antes de salvar");
		//userPosDAO.salvar(userposjava);
		
		userposjava.deletar();
	}
	
}
