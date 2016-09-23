package music;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Music {
private Date duration;
private String performer;//певец, композитор, руппа
private String performerName;//имя исполнителя или название группы
private String musicStyle;
private String	musicSubstyle;
private String name;

public Date getDuration() {
	return duration;
}
public String getMusicStyle() {
	return musicStyle;
}
public String getMusicSubstyle() {
	return musicSubstyle;
}

public Music(String duration,String performer, String performerName,String musicStyle,String musicSubstyle,String name) {
	try{
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		this.duration=format.parse(duration);}
		catch (Exception e) {
		e.printStackTrace();
		}
	this.performer=performer;
	this.performerName=performerName;
	this.musicStyle=musicStyle;
	this.musicSubstyle=musicSubstyle;
	this.name=name;
	
}

public static void fromRange(String a,String b,Music[]mas){
	int low=0, up=0,du=0;
	
	try {
	    
	    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	    
	   int hour=Integer.parseInt(a.substring(0,a.indexOf(":")));
	   int minutes=Integer.parseInt(a.substring(a.indexOf(":")+1,a.lastIndexOf(":")));
	   int seconds=Integer.parseInt(a.substring(a.lastIndexOf(":")+1));
	   low=hour*3600+minutes*60+seconds;
	  
	     hour=Integer.parseInt(b.substring(0,b.indexOf(":")));
	     minutes=Integer.parseInt(b.substring(b.indexOf(":")+1,b.lastIndexOf(":")));
	     seconds=Integer.parseInt(b.substring(b.lastIndexOf(":")+1));
	   up=hour*3600+minutes*60+seconds;
	   for(int i=0;i<mas.length;i++){
		   String date= format.format(mas[i].duration);
		     hour=Integer.parseInt(date.substring(0,date.indexOf(":")));
		     minutes=Integer.parseInt(date.substring(date.indexOf(":")+1,date.lastIndexOf(":")));
		     seconds=Integer.parseInt(date.substring(date.lastIndexOf(":")+1));
		   du=hour*3600+minutes*60+seconds;
		   if(du>=low && du<=up){
			   System.out.println(mas[i].toString());
		   }
	   }
	   
	} catch (Exception e) {
	    e.printStackTrace();
	}
}

@Override
	public String toString() {
	
		return "\t Произведение \""+ name+"\". Исполнитель "+performer+" "+performerName+". "
				+ "\nСтиль "+musicStyle+" подстиль "+musicSubstyle;
	}

}
