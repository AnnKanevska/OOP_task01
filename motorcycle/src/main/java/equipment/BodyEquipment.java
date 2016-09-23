package equipment;

public class BodyEquipment extends Equipment {
	private String material;
	private int bodySize;//35-64
	
	public BodyEquipment(double price, double weight, String name,String material,int bodySize) {
		super(price, weight, name);
		this.material=material;
		this.bodySize=bodySize;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Размер "+bodySize+". Материал "+material+".";
	}
}
