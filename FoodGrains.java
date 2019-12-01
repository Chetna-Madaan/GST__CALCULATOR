package gst.calculate;

public class FoodGrains implements Commodity {

	private int gst = 0;
	private int unitPrice;
	private int units;
	public FoodGrains(int units,int unitPrice)
	{
		
		this.unitPrice=unitPrice;
		this.units=units;
	}
	public int getGst() {
		return gst;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
}
