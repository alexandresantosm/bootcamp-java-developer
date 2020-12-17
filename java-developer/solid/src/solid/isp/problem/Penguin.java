package solid.isp.problem;

public class Penguin implements Bird{

	@Override
	public void peck() {
		System.out.println("Consegue bicar");		
	}

	@Override
	public void hatchingEggs() {
		System.out.println("Consegue por ovos");
	}

}
