package railwayСarriage;

public class Sedentary extends RailwayСarriage{

private int wagonClass;//1,2

public Sedentary(int numberOfSeats, int occupiedPlace,
		int numberLuggageWagon, double price, int levelOfComfort,
		String name,int wagonClass) {
	super( occupiedPlace, numberLuggageWagon, price, levelOfComfort,
			name);	
	setNumberOfSeats(numberOfSeats);
	
}
@Override
	public String toString() {
		return super.toString()+". Класс вагона "+wagonClass+".";
	}
}
