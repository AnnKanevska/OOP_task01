package equipment;

public class HeadEquipment extends Equipment {
	private String headSize; //s,m,l
	private String color;
	
	public HeadEquipment(double price, double weight, String name,String headSize,String color) {
		super(price, weight, name);
		this.headSize=headSize;
		this.color=color;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Размер "+headSize+". Цвет "+color+".";
	}
}
