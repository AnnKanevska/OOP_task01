package flower;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import bouquet.BouquetElements;

public class Flowers extends BouquetElements   {
	private String flowerName;
	private String color;
	private Date deliveryDate;
	private double stemLength;
	public Flowers(double price,String flowerName,int number,String color,String deliveryDate,double stemLength) {
		super(price,number);
		this.flowerName=flowerName;
		this.color=color;
		try{
			 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
			this.deliveryDate=format.parse(deliveryDate);}
			catch (ParseException e) {
				e.printStackTrace();
				}
		this.stemLength=stemLength;
	}
	
	
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public double getStemLength() {
		return stemLength;
	}
	 public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	   public void setStemLength(double stemLength) {
		this.stemLength = stemLength;
	}
	   
	public void stemRange(double a,double b){
		if(stemLength>a && stemLength<b){
			System.out.println(toString());
		}
	}
	@Override
	public String toString() {
		 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yy");
		return flowerName+" - "+color+" цвет"+", длина стебля "+stemLength+"см, "+super.toString()+". Дата поставки:"+format.format(deliveryDate);
	}

}

