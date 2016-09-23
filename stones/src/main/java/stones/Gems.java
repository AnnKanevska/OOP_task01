package stones;

public class Gems extends Stones {
private String origin;//минеральное,органическое
private String texture;//матовый, сверкающий,плотная фактура  шкала Мооса

public Gems(String name, String type, double size, double price,
		int transparency, String color,String origin,String texture) {
	super(name, type, size, price, transparency, color);
	this.origin=origin;
	this.texture=texture;
}

@Override
	public String toString() {
		return super.toString()+" Происхождение "+origin+". Текстура камня "+texture+".";
	}
}
