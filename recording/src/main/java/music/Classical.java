package music;

import java.awt.CompositeContext;
import java.text.SimpleDateFormat;

public class Classical extends Music {
	private String	size;
	private String gamma;
	private String collecting;
	private String mainMInstrument;
	
	public Classical(String duration, String performer, String performerName,
			String musicStyle, String musicSubstyle, String name,String	size,String gamma,
			String collecting,String mainMInstrument) {
		super(duration, performer, performerName, musicStyle, musicSubstyle, name);
		this.size=size;
		this.gamma=gamma;
		this.collecting=collecting;
		this.mainMInstrument=mainMInstrument;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	    String date= format.format(getDuration());
		return super.toString()+". Длительность "+ date+". "+" Музыкальный размер "+size+". Гамма "+gamma+"."
				+ " Основной инструмент "+mainMInstrument+". Сборник "+collecting+".";
	}
	
}
