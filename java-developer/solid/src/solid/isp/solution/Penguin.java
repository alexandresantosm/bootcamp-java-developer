package solid.isp.solution;

public class Penguin implements Bird{

	@Override
	public void peck() {
		System.out.println("Consegue bicar");		
	}

	@Override
	public void hatchingEggs() {
		System.out.println("Consegue por ovos");
	}

	@Override
	public void fly() {
		System.out.println("Não consegue voar");
	}

}
