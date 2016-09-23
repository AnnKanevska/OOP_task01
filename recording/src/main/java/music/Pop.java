package music;

import java.text.SimpleDateFormat;

public class Pop extends Music  {
	
	private String album;
	private boolean backingVocal;
	public Pop(String duration, String performer, String performerName,
			String musicStyle, String musicSubstyle, String name,String album,boolean backingVocal) {
		super(duration, performer, performerName, musicStyle, musicSubstyle, name);
		this.album=album;
		this.backingVocal=backingVocal;
	}
	@Override
	public String toString() {
		String s;
		if(backingVocal){s="Бэк вокал присутствует.";}
		else{s="Бэк вокал отсутсвует.";}
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	    String date= format.format(getDuration());
		return super.toString()+". Длительность "+ date+". "+" Альбом \""+album+"\". "+s;
	}
}
