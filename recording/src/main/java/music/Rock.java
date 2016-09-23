package music;

import java.text.SimpleDateFormat;

public class Rock extends Music{
	
	private String album;
	private boolean screaming;
	
	public Rock(String duration, String performer, String performerName,
			String musicStyle, String musicSubstyle, String name,String album,boolean screaming) {
		super(duration, performer, performerName, musicStyle, musicSubstyle, name);
		this.album=album;
		this.screaming=screaming;
	}
	
	@Override
	public String toString() {
		String s;
		if(screaming){s="Скриминг присутствует";}
		else{s="Без скриминга";}
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	    String date= format.format(getDuration());
		return super.toString()+". Длительность "+ date+". Альбом \""+album+"\". "+s;
	}
}
