package solid.ocp.solution;

public class DiscountChildrenBook implements DiscountBook {

	@Override
	public double valueDiscount() {
		return 0.3;
	}

}
