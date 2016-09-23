package gift;

import java.util.Scanner;

import candy.Candy;
import candy.Caramel;
import candy.Chocolate;
import candy.FruitSweets;

public class Main {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Candy [] elements={
			 new Caramel(50, 70, 5, "Барбарис", "Рошен", "Карамельная", "красный", "фантик", "кисло-сладкий"),
			 new Chocolate(150, 20, 15, "Красный мак", "Рошен", "Шоколадная",50,"фундук"),
			 new FruitSweets(100, 50, 18, "Сладкая вишенка", "АВК", "фруктовая","вишня","шоколад"),
			 new Chocolate(70, 30, 19, "Венок дуная", "ХБФ", "Шоколадная", 75, "миндаль"),
			 new FruitSweets(170, 60, 20, "Ананасики", "АВК", "фруктовая", "Ананая", "сахарная присыпка"),
			 new Caramel(250, 80, 6, "Фрути", "ХБФ", "Карамельная", "желтый", "на палочке", "лимонный")
	 };
	Gift b=new Gift("Сладкоежка",elements);
	boolean count=true;
	do{
	System.out.println("1 - вывести конфеты в случайном порядке.");
	System.out.println("2 - отсортировать конфеты в подарке по заданному признаку.");
	System.out.println("3 - найти конфету, входящую в определенный диапазон содержания сахара.");
	System.out.println("else - выход.");
	
	System.out.println ("Выберете один из пунктов меню: ");
	int choice=in.nextInt();
	
	switch (choice){
	case 1:{
		b.print();
		break;
	}
	case 2:{
		b.sorting();
		break;
	}
	case 3:{
		b.candySugar();
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