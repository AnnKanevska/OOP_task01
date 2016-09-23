package equipment;

public class Equipment implements Comparable<Equipment> {
private double price;
private double weight;
private String name;

public double getPrice() {
	return price;
}

public Equipment(double price,double weight,String name) {
	this.price=price;
	this.weight=weight;
	this.name=name;
}

public int compareTo(Equipment obj) {
	if(this.weight<obj.weight){return 1;}
	else if(this.weight>obj.weight){return -1;}
	else {return 0;}
}
public static void range(double a, double b,Equipment[]mas ){
	for(int i=0;i<mas.length;i++){
		if(mas[i].price>=a && mas[i].price<=b){
			System.out.println(mas[i].toString());
		}
	}
}


@Override
	public String toString() {
		return name+". Вес "+weight+"г. Цена "+price+". ";
	}
}
