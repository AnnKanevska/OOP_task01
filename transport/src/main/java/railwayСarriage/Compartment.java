package railwayСarriage;

public class Compartment extends RailwayСarriage{//КУПЕ
	private int compartmentNumber;// кол-во купе в вагоне
	private boolean conditioner;
	private String compartmentType;
	private int shelvesNumber;
	private String shelvesType;

public Compartment( int occupiedPlace,
		int numberLuggageWagon, double price, int levelOfComfort,int compartmentNumber,boolean conditioner,
		String compartmentType,int shelvesNumber,String shelvesType,String name) throws Exception {
	
	super( occupiedPlace, numberLuggageWagon, price, levelOfComfort,name);
	if(occupiedPlace>(shelvesNumber*compartmentNumber)){throw new Exception("Занятых мест больше чем возможных");}
	this.compartmentNumber=compartmentNumber;
	this.conditioner=conditioner;
	this.compartmentType=compartmentType;
	this.shelvesNumber=shelvesNumber;
	this.shelvesType=shelvesType;
	setNumberOfSeats((compartmentNumber*shelvesNumber));
}
@Override
	public String toString() {
	 String string;
	 if(conditioner){string="присутсвует";}
	 else{string="отсутсвует";}
		return super.toString()+" Количество купе открытого типа в одном вагоне "+compartmentNumber+
				"Количестов спальных мест в одном вагоне "+shelvesNumber+". Типы полок в вагоне "+shelvesType+". "
				+ "Кондиционер "+string+". Тип купе "+compartmentType+".";
	}
}
