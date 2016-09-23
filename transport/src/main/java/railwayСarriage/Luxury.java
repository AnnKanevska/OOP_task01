package railwayСarriage;

public class Luxury extends RailwayСarriage{
private int luxuryNumber;
private boolean TV_DVD;
private int shelvesNumber;
private String shelvesType;//только нижние, верхние и нижние

public Luxury( int occupiedPlace, int numberLuggageWagon,
		double price, int levelOfComfort,int luxuryNumber,boolean TV_DVD,
		int shelvesNumber,String shelvesType,String name) throws Exception {
	super( occupiedPlace, numberLuggageWagon, price, levelOfComfort,name);
	if(occupiedPlace>(shelvesNumber*luxuryNumber)){throw new Exception("Занятых мест больше чем возможных");}
	this.luxuryNumber=luxuryNumber;
	this.TV_DVD=TV_DVD;
	this.shelvesNumber=shelvesNumber;
	this.shelvesType=shelvesType;
	setNumberOfSeats((luxuryNumber*shelvesNumber));
}
 @Override
	public String toString() {
	 String string;
	 if(TV_DVD){string="присутсвует";}
	 else{string="отсутсвует";}
		return super.toString()+" Количество купе открытого типа в одном вагоне "+luxuryNumber+
				"Количестов спальных мест в одном вагоне "+shelvesNumber+". Типы полок в вагоне "+shelvesType+". "
						+ "TV/DVD"+string+". ";
	}

}
