package train;

import java.util.Arrays;
import java.util.Scanner;

import railwayСarriage.RailwayСarriage;

public class Train {
	private RailwayСarriage []mas;
	private int allPassengers;
	private int allBaggage;
	
	public Train(RailwayСarriage []mas) {
		this.mas=mas;
		for(int i=0;i<mas.length;i++){
			allPassengers+=mas[i].getOccupiedPlace();
			allBaggage+=mas[i].getNumberLuggageWagon();
		}
	}
	public static void print(RailwayСarriage obj){
		System.out.println(obj.toString());
	}
	public void printAll(){
		System.out.println("Общее число пссажиров "+allPassengers);
		System.out.println("Общее кол-во багажа "+allBaggage);
		for(int i=0;i<mas.length;i++){
			print(mas[i]);
		}
	}
	public void sorting(){
		Arrays.sort(mas);
		printAll();
	}
	public void range(){
		int a,b;
		Scanner cs= new Scanner(System.in);
		System.out.println("Введите нижнюю границ диапазона числа пассажиров");
		a=cs.nextInt();
		System.out.println("Введите верхнюю границ диапазона числа пассажиров");
		b=cs.nextInt();
		for(int i=0;i<mas.length;i++){
			if(mas[i].getNumberOfSeats()>=a && mas[i].getNumberOfSeats()<=b){
				print(mas[i]);
			}
		}
	}
	
}
