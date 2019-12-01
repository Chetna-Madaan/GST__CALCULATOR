package gst.calculate;

public class Furniture implements Commodity {
	private int gst = 5;
	private int unitPrice;
	private int units;
	public Furniture(int units,int unitPrice)
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
