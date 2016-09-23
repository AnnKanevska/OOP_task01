package flower;

public class GardenFlowers extends Flowers{
	private String term;//однолетний, многолетний
	private int  numberFlowersInflorescence;
	private String leafType;
	private boolean aroma;
	private String countrySupplier;

	public GardenFlowers(double price, String flowerName,int number, String color,String deliveryDate,
			double stemLength,String term,int numberFlowersInflorescence,String leafType,
			boolean aroma,String countrySupplier) {
		super(price, flowerName, number,color, deliveryDate, stemLength);
		this.term=term;
		this.numberFlowersInflorescence=numberFlowersInflorescence;	
        this.leafType=leafType;
        this.aroma=aroma;
        this.countrySupplier=countrySupplier;
	}
	@Override
	public String toString() {
		String aromat="отсутсвует";
		if(aroma){aromat="присутсвует";}
		return super.toString()+" цветок "+ term+", количестово цветков в цветоносе - "+numberFlowersInflorescence+
				", тип листа - "+leafType+", аромат "+aromat+". Страна-поставщик - "+countrySupplier+" ("+getNumber()+" шт.)";
	}
    
	

	
}
