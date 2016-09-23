package motorcyclist;

import java.util.Scanner;

import equipment.Equipment;

public class Motorcyclist {
private double fullprice;
private Equipment []mas;

public Equipment[] getMas() {
	return mas;
}

public Motorcyclist(Equipment []mas) {
	this.mas=mas;
	for(int i=0;i<mas.length;i++){
		fullprice+=mas[i].getPrice();
	}
}

public  void rangePrice(){
	double a,b;
	Scanner sc=new Scanner(System.in);
	System.out.print("Введите нижнюю границу диапазона стоимости:");
	a=sc.nextDouble();
	System.out.print("Введите верхнюю границу диапазона стоимости:");
	b=sc.nextDouble();
	Equipment.range(a, b, mas);
}

public void print(Equipment obj){
	System.out.println(obj.toString());
}
public void printAll(){
	System.out.println("Полная стоимость"+ fullprice);
	for(int i=0;i<mas.length;i++){
		print(mas[i]);	
	}
}
}
