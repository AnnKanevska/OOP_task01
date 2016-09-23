package candy;

public class Caramel extends Candy{
	private String color;
	private String packing;
	private String taste;
	
	public Caramel(double weight, int sugarPercentage, double cost,
			String name, String manufacturer, String candyType,String color,
			String packing,String taste) {
		super(weight, sugarPercentage, cost, name, manufacturer, candyType);
		this.color=color;
		this.packing=packing;
		this.taste=taste;
		}
	@Override
	public String toString() {
		return super.toString()+" Вкус "+taste+", цвет "+color+", упаковка "+packing+
				". Вес конфет в подарке"+getWeight()+" г.";
	}

}
