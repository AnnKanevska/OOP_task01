package candy;

import java.util.Comparator;
import java.util.Scanner;

public class Candy {
	private double weight;
	private int sugarPercentage;
	private double cost;
	private String name;
	private String manufacturer;
	private String candyType;
	
	public Candy(double weight,int sugarPercentage, double cost,
			String name, String manufacturer, String candyType) {
		this.weight=weight;
		this.sugarPercentage=sugarPercentage;
		this.cost=cost;
		this.name=name;
		this.manufacturer=manufacturer;
		this.candyType=candyType;
	}
	public double getWeight() {
		return weight;
	}
	//из диапазона содержания сахара
	public static void candyList(Candy[] mas){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите диапазон содержания сахара в конфете (в %). \n От ");
		int p1=in.nextInt();
		System.out.println("До ");
		int p2=in.nextInt();
		for(int i =0; i< mas.length;i++)
		{
			if(mas[i].sugarPercentage>=p1 && mas[i].sugarPercentage<=p2){
				printElem(mas[i]);
			}
		}
	}
	public static void printElem(Candy elem){
			System.out.println(elem.toString());
	}
	public static void print(Candy[]mas){
		for(int i =0; i< mas.length;i++)
		{
			printElem(mas[i]);
		}
	}
	@Override
	public String toString() {
		return candyType+" конфета \""+name+"\". Производитель: \""+manufacturer+"\", цена за 100г."+
				cost+"грн. Содержание сахара: "+sugarPercentage+"%.";
	}
	
public static class CandyComparator implements Comparator<Candy>{
   private int sorting;
   public static final int sortWeight=1;
   public static final int sortSugarPercentage=2;
   public static final int sortCost=3;
   public static final int sortName=4;
   public static final int sortManufacturer=5;
   public static final int sortCandyType=6;
   
   public CandyComparator(int sorting) {
	this.sorting=sorting;
}
	public int compare(Candy c1, Candy c2) {
	switch(sorting){
	case 1:{
		if(c1.weight>c2.weight){
			return 1;
		}else if(c1.weight<c2.weight){
			return -1;
		}else{
			return 0;
		}
	}
	case 2:{
		return c1.sugarPercentage-c2.sugarPercentage;
	}
	case 3:{
		if(c1.cost>c2.cost){
			return 1;
		}else if(c1.cost<c2.cost){
			return -1;
		}else{
			return 0;
		}
	}
	case 4:{
		return c1.name.compareTo(c2.name);
	}
	case 5:{
		return c1.manufacturer.compareTo(c2.manufacturer);
	}
	case 6:{
		return c1.candyType.compareTo(c2.candyType);
	}default:{
		return 0;
	}
	}
	}
	
}
}
