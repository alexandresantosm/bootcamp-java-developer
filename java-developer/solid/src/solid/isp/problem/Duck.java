package solid.isp.problem;

import solid.isp.solution.FlyBird;

public class Duck implements Bird, FlyBird{

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
		System.out.println("Consegue voar");		
	}
	
}
