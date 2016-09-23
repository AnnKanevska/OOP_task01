package motorcyclist;

import java.util.Arrays;
import java.util.Scanner;

import equipment.BodyEquipment;
import equipment.Equipment;
import equipment.HeadEquipment;
import equipment.LimbsEquipment;


public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Equipment [] elements={
				 new BodyEquipment(2978, 2000, "Черепаха",
						 "полиэстер",48),
				  new LimbsEquipment(500, 300, "Перчатки","ладони",
						  "L"),
				 new LimbsEquipment(2000, 1000, "Мотообувь","ноги",
						  "45"),
				 new LimbsEquipment(900, 900, "Наколенники","колени",
						 "L"),
				 new HeadEquipment(1900,900, "Шлем","М",
						 "черный")};
		Motorcyclist b=new Motorcyclist(elements);
		boolean count=true;
		do{
		
		System.out.println("1 - вывести отсортированную амуницию на основе веса.");
		System.out.println("2 - вывести амуницию из диапазона стоимости .");
		System.out.println("else - выход.");
		
		System.out.println ("Выберете один из пунктов меню: ");
		int choice=in.nextInt();
		
		switch (choice){
		
		case 1:{
			Arrays.sort(b.getMas());
			b.printAll();
			break;
		}
		case 2:{
			b.rangePrice();
			break;
		}
		default:{
			System.out.print ("---------------Конец-------------------");
			count=false;
		}
		}
		}while(count);
		
				 
	};
}
