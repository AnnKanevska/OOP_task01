package train;

import java.util.Arrays;
import java.util.Scanner;

import railwayСarriage.CB;
import railwayСarriage.Compartment;
import railwayСarriage.Luxury;
import railwayСarriage.RailwayСarriage;
import railwayСarriage.ReservedSeat;
import railwayСarriage.Sedentary;


public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		RailwayСarriage [] elements={
				   new CB(20,750, 2,3,20,"2-нижних, 1-верхнее",9,"СВ-вагон"),
				  new Luxury(5,6,1200, 1,5,true,2,"нижние","Вагон-люкс"),
				 new Compartment(25,30, 350, 3,10,false,"купейный с четырехместными купе ",4,"2-верхних, 2-нижних","Купе"),
				 new ReservedSeat(50,50,150 , 5,6,"2- нижних, 2- верхних, 2- боковых",10,"Плацкарт"),
				 new Sedentary(64, 50, 50, 120, 6,"Сидячий вагон",2),
				 new Compartment(26,29, 300, 4,9,true,"Купейный с купе-буфетом ",4,"2-верхних, 2-нижних","Купе")};
				 Train b=new Train(elements);
		boolean count=true;
		do{
		
		System.out.println("1 - вывести состав поезда на основе уровня комфортности.");
		System.out.println("2 - вагоны с заданным диапазоном параметров числа пассажирова.");
		System.out.println("else - выход.");
		
		System.out.println ("Выберете один из пунктов меню: ");
		int choice=in.nextInt();
		
		switch (choice){
		
		case 1:{
			b.sorting();
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
