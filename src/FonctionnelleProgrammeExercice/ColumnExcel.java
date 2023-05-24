package FonctionnelleProgrammeExercice;

public class ColumnExcel {
	String valueString;
	Boolean statusBoolean;
	
	
	public ColumnExcel(String valueString, Boolean statusBoolean) {
		super();
		this.valueString = valueString;
		this.statusBoolean = statusBoolean;
	}
	public String getValueString() {
		return valueString;
	}
	public void setValueString(String valueString) {
		this.valueString = valueString;
	}
	public Boolean getStatusBoolean() {
		return statusBoolean;
	}
	public void setStatusBoolean(Boolean statusBoolean) {
		this.statusBoolean = statusBoolean;
	}
	@Override
	public String toString() {
		return "ColumnExcel"
				+ " [valueString=" + valueString + ", statusBoolean=" + statusBoolean + "]";
	}
	
	

}
