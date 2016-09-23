package bouquet;


import java.util.Arrays;

import accessories.Accessories;
import flower.Flowers;
import flower.GardenFlowers;
import flower.WildFlower;

public class Bouquet {
	private String name;
	private double fullCost;
	private BouquetElements [] mas;
	
	public Bouquet(String name,BouquetElements [] mas) {
		this.name=name;
		this.mas=mas;
		fullCost=BouquetElements.fullСost(mas);
	}
	
	//
	public void printBouquet(){
		System.out.println(toString()); 
		
	}
	public void sortBouquet(){
		 Arrays.sort(mas);
		System.out.println(toString()); 
		
	}
	
	public void rangeOf(double a,double b){
		for(int i=0; i<mas.length;i++){
			 if(mas[i] instanceof Flowers){
				 ((Flowers)mas[i]).stemRange(a,b);
			 }
			 }
	}
	@Override
	public String toString() {
		String bouquet="";
		 for(int i=0; i<mas.length;i++){
			 if(mas[i] instanceof Flowers){
				 if(mas[i] instanceof GardenFlowers){
				 bouquet+=(((GardenFlowers)mas[i]).toString()); 
				 bouquet+="\n";
				 } 
				 if(mas[i] instanceof WildFlower){
					 bouquet+=(((WildFlower)mas[i]).toString()); 
					 bouquet+="\n";
					 } 	 
			 }
			 if(mas[i] instanceof Accessories){
				 bouquet+=((Accessories)mas[i]).toString();
				 bouquet+="\n";
				 }
			 }
		return "\t Букет \""+name+"\".\nПолная стоимость букета: "+fullCost+" грн."+"\n"+bouquet;
	}
	
	
}
