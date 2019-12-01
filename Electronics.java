package gst.calculate;

public class Electronics implements Commodity {
	private int gst = 18;
	private int unitPrice;
	private int units;
	public Electronics(int units,int unitPrice)
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
