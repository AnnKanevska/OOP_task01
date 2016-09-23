package railwayСarriage;

public class ReservedSeat extends RailwayСarriage{
	private int shelvesNumber;
	private String shelvesType;
	private int reservedSeatNumber;
	
	public ReservedSeat(int occupiedPlace,
			int numberLuggageWagon, double price, int levelOfComfort,int shelvesNumber,
			String shelvesType,int ReservedSeatNumber,String name) throws Exception {
		super( occupiedPlace, numberLuggageWagon, price, levelOfComfort,name);
		if(occupiedPlace>(shelvesNumber*ReservedSeatNumber)){throw new Exception("Занятых мест больше чем возможных");}
		this.shelvesNumber=shelvesNumber;
		this.shelvesType=shelvesType;
		this.reservedSeatNumber=ReservedSeatNumber;
		setNumberOfSeats((reservedSeatNumber*shelvesNumber));
	}
	@Override
	public String toString() {
		return super.toString()+" Количество купе открытого типа в одном вагоне "+reservedSeatNumber+
				"Количестов спальных мест в одном вагоне "+shelvesNumber+". Типы полок в вагоне "+shelvesType+".";
	}
}
