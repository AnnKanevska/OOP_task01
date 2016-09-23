package disk;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import music.Music;
import music.Pop;

public class Disk {
private String fullTime;
private Music[]mas;

public Disk(Music []mas) {
	this.mas=mas;
	setFullTime();
}

public void range(String a,String b){
	Music.fromRange(a,b,mas);
}

public void setFullTime(){
	int fulldata=0;
	for(int i=0;i<mas.length;i++){

		try {
		    
		    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		    String date= format.format(mas[i].getDuration());
		    int hour=Integer.parseInt(date.substring(0,date.indexOf(":")));
		    int minutes=Integer.parseInt(date.substring(date.indexOf(":")+1,date.lastIndexOf(":")));
		    int seconds=Integer.parseInt(date.substring(date.lastIndexOf(":")+1));
		    fulldata=fulldata+hour*3600+minutes*60+seconds;
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	  fullTime=(int)(fulldata/3600)+":"+(int)((fulldata%3600)/60)+":"+fulldata%60;

}
 

public void sorting(){
	Arrays.sort(mas,new Comparator<Music>() {
        public int compare(Music m1, Music m2) {
            return m1.getMusicStyle().compareTo(m2.getMusicStyle());}});
	Arrays.sort(mas,new Comparator<Music>() {
        public int compare(Music m1, Music m2) {
            return m1.getMusicSubstyle().compareTo(m2.getMusicSubstyle());}});
	
	printAll();
}
public void printAll(){
	System.out.println("Содержание:");
	for(int i=0;i<mas.length;i++){
		print(mas[i]);
	}
	System.out.println("Полная длительность "+fullTime);
}
public void print(Music obj){
	System.out.println(obj.toString());
}
}
