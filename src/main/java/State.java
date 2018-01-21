
public class State {

	private String stateName;
	private Double taxValue;
	
	public State(String stateName, Double taxValue) {
		this.stateName = stateName;
		this.taxValue = taxValue;
	}
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Double getTaxValue() {
		return taxValue;
	}
	public void setTaxValue(Double taxValue) {
		this.taxValue = taxValue;
	}
}
