package music;

import java.text.SimpleDateFormat;

public class Jazz extends Music {
	//private String	musicSubstyle;// бибоп
	private String album;
	private  final String rhythm="свинг";// свинг
	
	public Jazz(String duration, String performer, String performerName,
			String musicStyle, String musicSubstyle, String name,String album) {
		super(duration, performer, performerName, musicStyle, musicSubstyle, name);
		this.album=album;
	}
	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	    String date= format.format(getDuration());
		return super.toString()+". Длительность "+ date+". "+" Альбом \""+album+"\". Ритм "+rhythm;
	}
}
