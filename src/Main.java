

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	private static final String URL_TEMPLATE = "jdbc:mysql://localhost/%s?user=%s&password=%s";
	
	private Connection getConnection(String dbName, String username, String password) throws SQLException {
		String url = String.format(URL_TEMPLATE, dbName, username, password);
		return DriverManager.getConnection(url);
	}
		
	public void executar() {		
		try (Connection conn = getConnection("financas", "dsi", "6ehdez")) {

			/*
			 * Tarefa 1
			 * Implemente a inserção de duas novas contas, usando `Statement`s simples.
			 * 
			 * Você vai precisar cadastrar pessoas, caso sua tabela `pessoa` esteja
			 * vazia. Use o seu cliente MySQL para fazer isso.
			 */
						
			// TODO: inserir contas aqui
			
			
			/* 
			 * Tarefa 2
			 * Usando `PreparedStatement`, registre uma sequência de movimentações 
			 * da primeira para a segunda conta. Use os valores contidos no vetor a seguir.
			 * Não é necessário atualizar o saldo. Apenas registre as movimentações.  
			 */
			double[] valores = {50, 1200, -300, 100, -73, -41, 80, 15, -20};
			
			// TODO: registrar movimentações aqui
			
			
		} catch (SQLException e) {
			System.err.println("Problemas com o banco de dados.");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Main().executar();
	}
}
