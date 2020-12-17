package solid.lsp.solution;

public class Square implements ICalculatorArea {
	
	private double side;
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}
	
	
}
