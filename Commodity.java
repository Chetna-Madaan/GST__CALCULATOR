package gst.calculate;

public interface Commodity {

	default double[] calculateGST(int gst,int unitPrice,int units)
	{
		double[] arr = new double[5];
		double gstperunit = (gst*unitPrice)/100;

		double finalGstPrice = (gstperunit+unitPrice)*units;
		 arr[0]= gstperunit;
		 arr[1]=finalGstPrice;
		return arr  ;
		

	}



}
