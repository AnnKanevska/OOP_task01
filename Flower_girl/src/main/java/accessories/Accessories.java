package accessories;

import bouquet.BouquetElements;



public class Accessories extends BouquetElements {
	private String color;
	private String name;

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	 public void setColor(String color) {
		this.color = color;
	}
	 public void setName(String name) {
		this.name = name;
	}
	public Accessories(double price,int number, String color, String name) {
		super(price,number);
		this.color=color;
		this.name=name;
	}

	@Override
		public String toString() {
			
			return name+" - "+color+" цвет"+", "+super.toString()+" ("+getNumber()+" шт.)";
		}
	}

