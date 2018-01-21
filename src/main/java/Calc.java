public class Calc {
	
	public static Double calculate(State state, Double price) {
		return price / (1 + (state.getTaxValue() / 100));
	}
}
