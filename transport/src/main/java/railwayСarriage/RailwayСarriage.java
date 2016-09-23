package railwayСarriage;

public class RailwayСarriage implements Comparable<RailwayСarriage>{
private int numberOfSeats;//общее кол-во мест во всем вагоне
private int occupiedPlace;// не должно быть больше общего кол-ва
private int numberLuggageWagon;//общее число багажа в вагоне
private double price;//стоимость 1го места в вагоне
private int levelOfComfort;
private String name;
public RailwayСarriage(int occupiedPlace,int numberLuggageWagon,
		double price,int levelOfComfort,String name) {
	
	this.occupiedPlace=occupiedPlace;
	this.numberLuggageWagon=numberLuggageWagon;
	this.price=price;
	this.levelOfComfort=levelOfComfort;
	this.name=name;
}
public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}
public int getNumberLuggageWagon() {
	return numberLuggageWagon;
}
public int getOccupiedPlace() {
	return occupiedPlace;
}
public int getNumberOfSeats() {
	return numberOfSeats;
}
@Override
	public String toString() {
		return name+" уровень комфортности "+levelOfComfort+". Кол-во мест в вагоне "+numberOfSeats+
				". Кол-во занятых мест "+occupiedPlace+". Общее число багажа в вагоне "+numberLuggageWagon+
				". Стоимость 1-го билета "+price+". ";
	}

public int compareTo(RailwayСarriage obj) {
	return this.levelOfComfort-obj.levelOfComfort;
}

}
