package necklace;

import java.util.Arrays;
import java.util.Scanner;

import stones.Gems;
import stones.Semipreciou;
import stones.Stones;



public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stones [] elements={
				 new Gems("Алмаз", "драгоценный", 0.75, 147300,
							3, "дымчато-коричневый","минеральное","сверкающая"),
				  new Gems("Аметист", "драгоценный", 33, 330,
							6, "фиолетовый","минеральное","сверкающая"),
				 new Semipreciou("Азурит", "полудрагоценный", 20, 950,
							10, "зеленый","средняя ","Обрабатываемые в холодном состоянии"),
				 new Semipreciou("Фибролит", "полудрагоценный", 15, 1300,
							8, "желтый","вязкая","применяющиеся в естественном виде"),
				 new Gems("Тааффеит", "драгоценный", 0.5, 23000,
							9, "красный","минеральное","матовая"),
				 new Semipreciou("Яшма", "полудрагоценный", 9, 700,
							11, "желтый","твердый","стекловатые")};
		Necklace b=new Necklace(elements);
		boolean count=true;
		do{
		
		System.out.println("1 - вывести отсортированные камни на основе их ценности.");
		System.out.println("2 - вывести камни из диапазона прозрачности .");
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
			b.range();
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
