package necklace;

import java.util.Scanner;

import stones.Stones;

public class Necklace {
private Stones []mas;
private double fullPrice;
private double fullWeight;

public Necklace(Stones []mas) {
	this.mas=mas;
	for(int i=0;i<mas.length;i++){
		fullPrice+=mas[i].getPrice();
		fullWeight+=mas[i].getSize();
	}
}
public void print(Stones obj){
	System.out.println(obj.toString());
}
public void printAll(){
	for(int i=0;i<mas.length;i++){
		print(mas[i]);
	}
	System.out.println("Полная стоимость ожерелья "+fullPrice+" грн.");
	System.out.println("Вес ожерелья "+fullWeight+" карат.");
}
public Stones[] getMas() {
	return mas;
}
public void range(){
	 int a,b;
	 System.out.println("1-IF (прозрачный)\n"
	 		+ "2-WS1 (прозрачный)\n"
	 		+ "3-WS2 (прозрачный)\n"
	 		+ "4-VS1 (полупрозрачный)\n"
	 		+ "5-VS2 (полупрозрачный)\n"
	 		+ "6-SI1 (полупрозрачный)\n"
	 		+ "7-SI2 (полупрозрачный)\n"
	 		+ "8-SI3 (полупрозрачный)\n"
	 		+ "9-I1 (непрозрачный)\n"
	 		+ "10-I2 (непрозрачный)\n"
	 		+ "11-I3 (непрозрачный)\n");
	 System.out.print("Введите цифру соответствующую нижней границе диапазона :");
	 Scanner sc = new Scanner(System.in); 
	 a=sc.nextInt();
	 System.out.print("Введите цифру соответствующую верхней границе диапазона :");
	 b=sc.nextInt();
		Stones.rangeTransparency(a,b,mas);
	
}
}
