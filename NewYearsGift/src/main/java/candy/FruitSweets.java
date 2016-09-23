package candy;

public class FruitSweets extends Candy{
	private String fruit;
	private String decoration;
	public FruitSweets(double weight, int sugarPercentage, double cost,
			String name, String manufacturer, String candyType,String fruit,String decoration) {
		super(weight, sugarPercentage, cost, name, manufacturer, candyType);
		this.fruit=fruit;
		this.decoration=decoration;
	} 
@Override
public String toString() {
	return super.toString()+ "Основной ингредиент "+fruit+". Украшения: "+decoration+".Вес конфет в подарке"+getWeight()+" г.";
}
	

}
