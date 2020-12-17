package solid.dip.solution;

public class OracleConnection implements DbConnection {

	@Override
	public void connection() {
		System.out.println("Conexão com Oracle");
	}

}
