package flower;

public class WildFlower extends Flowers {
	private String inflorescenceType;
	private String stemType;
	private String florescence;
	public WildFlower(double price, String flowerName,int number, String color,
			String deliveryDate, double stemLength,String inflorescenceType,String stemType,String  florescence) {
		super(price, flowerName, number,color, deliveryDate, stemLength);
		this.inflorescenceType=inflorescenceType;
		this.stemType=stemType;
		this.florescence=florescence;
	}

	@Override
	public String toString() {
		return super.toString()+". Тип соцветия - "+inflorescenceType+" , тип стебля - "+stemType+
				", сезон цветения - "+ florescence+" ("+getNumber()+" шт.)";
	}
}
