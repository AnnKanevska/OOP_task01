package stones;

public class Semipreciou extends Stones{
private String hardness;
private String group;

public Semipreciou(String name, String type, double size, double price,
		int transparency, String color,String hardness,String group) {
	super(name, type, size, price, transparency, color);
	this.hardness=hardness;
	this.group=group;
}

@Override
	public String toString() {
		return super.toString()+" Твердость "+hardness+" Группа "+group+".";
	}
}
