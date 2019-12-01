package gst.calculate;

public class Cosmetics implements Commodity {
	private int gst = 28;
	private int unitPrice;
	private int units;
	public Cosmetics(int units,int unitPrice)
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
