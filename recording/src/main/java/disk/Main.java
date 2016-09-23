package disk;
import java.util.Scanner;

import music.Classical;
import music.Jazz;
import music.Music;
import music.Pop;
import music.Rock;


public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Music [] elements={
				 new Classical("00:13:28", "композитор", "И. С. Бах",
							"классическая музыка", "токката и фуга", "Токката и фуга ре минор","4 четверти","ре минор",
							"Neue Bach-Ausgabe","орган"),
				  new Rock("00:04:18", "группа", "\"Merzhin\"",
							"рок","фолк рок", "La rue calumet","Pieds nus sur la braise",false),
				 new Jazz("00:05:07", "композитор", "Скотт Джо́плин",
							"джаз", "регтайм", "The entertainer","Фавориты соревнований"),
				 new Classical("1:40:24","композитор", "Н. А. Римский-Корсаков",
						 "классическая музыка", " симфоническая сюита", "Шехеразада","4 четверти","до мажор",
						 "соч. 35","оркестр"),
				 new Pop("00:04:15", "певица","ZAZ","поп", "фольклорный", "Je veux","Paris",false),
				 new Rock("00:03:45",  "певец", "СержТанкян",
						 "рок", "альтернативный рок", "Empty Walls","Elect the Dead",false)};
		Disk b=new Disk(elements);
		boolean count=true;
		do{
		System.out.println("1 - вывести плейлист в случайном порядке.");
		System.out.println("2 - вывести отсортированный по стилям плейлист.");
		System.out.println("3 - вывести каждый трек из заданного диапазона длительности.");
		System.out.println("else - выход.");
		
		System.out.println ("Выберете один из пунктов меню: ");
		int choice=in.nextInt();
		
		switch (choice){
		case 1:{
			b.printAll();
			break;
		}
		case 2:{
			b.sorting();
			
			break;
		}
		case 3:{
			Scanner inp = new Scanner(System.in);
			System.out.println("Введите нижнюю границу длительлности в формате hh:mm:ss");
			String low=inp.next();
			System.out.println("Введите верхнюю границу длительности в формате hh:mm:ss");
			String up=inp.next();
			b.range(low,up);
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
