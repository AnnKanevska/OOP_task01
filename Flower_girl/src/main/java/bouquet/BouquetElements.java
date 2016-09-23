package bouquet;

import flower.Flowers;
//для создания букета/ массива,совмещающего как цветы, так и аксесуары
public class BouquetElements implements Comparable<BouquetElements>{
	
	private double price;
	private int number;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		}
	public BouquetElements(double price, int number) {
		this.price=price;
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public int compareTo(BouquetElements obj) {
		if (!(this instanceof Flowers)){return 1;}
		else if (!(obj instanceof Flowers)){return -1;}
		else{
			return ((Flowers)this).getDeliveryDate().compareTo(((Flowers)obj).getDeliveryDate());
		}
	}
	public static double fullСost(BouquetElements [] mas){
		double fullCost=0;
		for(int i=0; i<mas.length;i++){
			fullCost+=(mas[i].price*mas[i].number);
		}
		return fullCost;
	}
	@Override
	public String toString() {
		return " цена за штуку: "+this.price+" грн";
	}
	
} 

