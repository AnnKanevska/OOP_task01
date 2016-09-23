package gift;

import java.util.Arrays;
import java.util.Scanner;

import candy.Candy;

public class Gift {
	private String name;
	private Candy [] mas;
	private double fullWeight;
	
	public Gift(String name,Candy [] mas) {
		this.name=name;
		this.mas=mas;
		for(int i =0; i<mas.length;i++){
			fullWeight+=mas[i].getWeight();
		}
	}
	public void candySugar(){
		Candy.candyList(mas);
	}
	public void sorting(){
		Scanner in = new Scanner(System.in);
		System.out.println("\t Отсортировать список по: \n"
				+ "1-весу в подарке \n1"
				+ "2-содержанию сахара\n"
				+ "3-стоимости \n"
				+ "4-названию \n"
				+ "5-производителю \n"
				+ "6-типу конфеты \n"
				+ "Введите один из пунктов меню");
		int choice=in.nextInt();
		switch(choice){
		case 1:{
			Candy.CandyComparator comp= new Candy.CandyComparator(Candy.CandyComparator.sortWeight);
			Arrays.sort(mas,comp);
			print();
			break;
		}case 2:{
			Candy.CandyComparator comp= new Candy.CandyComparator(Candy.CandyComparator.sortSugarPercentage);
			Arrays.sort(mas,comp);
			print();
			break;
		}case 3:{
			Candy.CandyComparator comp= new Candy.CandyComparator(Candy.CandyComparator.sortCost);
			Arrays.sort(mas,comp);
			print();
			break;
		}case 4:{
			Candy.CandyComparator comp= new Candy.CandyComparator(Candy.CandyComparator.sortName);
			Arrays.sort(mas,comp);
			print();
			break;
		}case 5:{
			Candy.CandyComparator comp= new Candy.CandyComparator(Candy.CandyComparator.sortManufacturer);
			Arrays.sort(mas,comp);
			print();
			break;
		}case 6:{
			Candy.CandyComparator comp= new Candy.CandyComparator(Candy.CandyComparator.sortCandyType);
			Arrays.sort(mas,comp);
			print();
			break;
		}
		}	
	}
	@Override
	public String toString() {
		return "Подарок \""+name+"\". Полный вес подарка "+fullWeight+"г.";
	}
	public void print (){
		System.out.println(toString());
		Candy.print(this.mas);
	}
}
