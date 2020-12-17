package solid.dip.solution;

public class MySqlConnection implements DbConnection {

	@Override
	public void connection() {
		System.out.println("Conexão com MySqlServer");
	}

}
