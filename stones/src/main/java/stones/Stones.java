package stones;

public class Stones  implements Comparable<Stones>{
private String name;
private String type;
private double size;
private double price;
private int transparency;
private String color;


public Stones(String name,String type,double size,double price,int transparency,String color) {
	this.name=name;
	this.type=type;
	this.size=size;
	this.price=price;
	this.transparency=transparency;
	this.color=color;
}

public double getSize() {
	return size;
}
public double getPrice() {
	return price;
}

public String stringTransparency(){
	switch(transparency){
	case 1:{return "IF (прозрачный)";}
	case 2:{return "WS1 (прозрачный)";}
	case 3:{return "WS2 (прозрачный)";}
	
	case 4:{return "VS1 (полупрозрачный)";}
	case 5:{return "VS2 (полупрозрачный)";}
	case 6:{return "SI1 (полупрозрачный)";}
	case 7:{return "SI2 (полупрозрачный)";}
	case 8:{return "SI3 (полупрозрачный)";}
	
	case 9:{return "I1 (непрозрачный)";}
	case 10:{return "I2 (непрозрачный)";}
	case 11:{return "I3 (непрозрачный)";}
	default :{return "ошибка";}
	}
}

@Override
	public String toString() {
		return name+" - "+type+". Размер "+size+" карата."+" Стоимость "+price+" грн. "
				+ "Прозрачность "+stringTransparency()+". Цвет - "+color+". ";
	}
public int compareTo(Stones obj) {
	if(this.price>obj.price){return 1;}
	else if(this.price<obj.price){return -1;}
	else{return 0;}
}


public static void rangeTransparency(int a,int b,Stones []mas){
	for(int i=0;i<mas.length;i++){
		if(mas[i].transparency>=a && mas[i].transparency<=b){
			System.out.println(mas[i].toString());
		}
	}
}

}
