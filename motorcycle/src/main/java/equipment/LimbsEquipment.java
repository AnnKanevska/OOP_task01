package equipment;

public class LimbsEquipment extends Equipment{
private String partArmOrLeg;
private String size; //s,m,l
public LimbsEquipment(double price, double weight, String name,String partArmOrLeg,String size) {
	super(price, weight, name);
	this.partArmOrLeg=partArmOrLeg;
	this.size=size;
}

@Override
	public String toString() {
		return super.toString()+"Размер "+size+". Часть тела "+partArmOrLeg+".";
	}
}
