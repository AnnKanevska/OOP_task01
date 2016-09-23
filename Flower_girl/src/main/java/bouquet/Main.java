package bouquet;

import java.util.Scanner;

import accessories.Accessories;
import flower.Flowers;
import flower.GardenFlowers;
import flower.WildFlower;

public class Main {


public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	BouquetElements [] elements={
			 new Accessories(12.50,1, "белый", "оберточная бумага"),
			 new WildFlower(5.50, "Скабиоза", 5, "нежно-голубой", "12.09.2016", 40, "головка", "восходящий", "лето"),
			 new WildFlower(3, "Кермек", 6, "синий", "31.08.2016", 20,"сложный колос", "восходящий", "весна"),
			 new GardenFlowers( 13, "Гортензия", 4, "белый","10.09.2016", 50, "многолетний", 50, "овальный смелокзубчатым краем", false, "Украина"),
			 new Accessories(3.50,2, "зеленый", "лента"),
			 new GardenFlowers( 23, "Гербера", 7, "нежно-розовый","16.09.2016", 25, "многолетний", 1, "резной", true, "Польша") 
	 };
	Bouquet b=new Bouquet("Холодная сказка",elements);
	boolean count=true;
	do{
	System.out.println("1 - вывести составляющие букета в случайном порядке.");
	System.out.println("2 - отсортировать цветы в букете по свежести.");
	System.out.println("3 - найти цветок в букете, соответсвующий заданному диапазону длин стеблей.");
	System.out.println("else - выход.");
	
	System.out.println ("Выберете один из пунктов меню: ");
	int choice=in.nextInt();
	
	switch (choice){
	case 1:{
		b.printBouquet();
		break;
	}
	case 2:{
		b.sortBouquet();
		break;
	}
	case 3:{
		double a1, a2;
		System.out.print ("Введите диапазон длин стебля цветка: от ");
		a1=in.nextDouble();
		System.out.print ("до ");
		a2=in.nextDouble();
		b.rangeOf(a1,a2);
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