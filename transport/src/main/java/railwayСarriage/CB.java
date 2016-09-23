package railwayСarriage;

public class CB extends RailwayСarriage {
	private int shelvesNumber;
	private String shelvesType;
	private int CBNumber;
	
	public CB( int occupiedPlace, int numberLuggageWagon,
			double price, int levelOfComfort,int shelvesNumber,String shelvesType,int CBNumber,String name) throws Exception {
		super(occupiedPlace, numberLuggageWagon, price, levelOfComfort,name);
		if(occupiedPlace>(shelvesNumber*CBNumber)){throw new Exception("Занятых мест больше чем возможных");}
		this.shelvesNumber=shelvesNumber;
		this.shelvesType=shelvesType;
		this.CBNumber=CBNumber;
		setNumberOfSeats((CBNumber*shelvesNumber));
	}
	
	@Override
	public String toString() {
		return super.toString()+" Количество купе открытого типа в одном вагоне "+CBNumber+
				"Количестов спальных мест в одном вагоне "+shelvesNumber+". Типы полок в вагоне "+shelvesType+". ";
	}
}
