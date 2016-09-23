package candy;

public class Chocolate extends Candy{
	private int cocoaPercentage;
	private String stuffing;
	
	public Chocolate(double weight, int sugarPercentage, double cost,
			String name, String manufacturer, String candyType,int cocoaPercentage,String stuffing) {
		super(weight, sugarPercentage, cost, name, manufacturer, candyType);
		this.cocoaPercentage=cocoaPercentage;
		this.stuffing=stuffing;
	}
@Override
public String toString() {
	return super.toString()+" Процент какао "+cocoaPercentage+"%, "+stuffing+
			" начинка. Вес конфет в подарке"+getWeight()+" г.";
}
}
