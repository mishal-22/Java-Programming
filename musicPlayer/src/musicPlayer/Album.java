package musicPlayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
private String name;
private String artist;
private ArrayList<Song> songs;
public Album(String name, String artist, ArrayList<Song> songs) {
	
	this.name = name;
	this.artist = artist;
	this.songs = new ArrayList<Song>();
}
public Song findSong(String title) {
	for(Song checkSong:songs) {
		if(checkSong.getTitle().equals(title)) {
			return checkSong;
		}
		
	}
	return null;
}

public boolean addSong(String title,double duration) {
	if(findSong(title==null)) {
		songs.add(new Song(title, duration));
		System.out.println(title+"Successfully added");
		return true;
	}
	else {
		System.out.println("Song with name "+title+" already added");
	return false;
	}
}
public boolean addPlayList(int trackNumber,LinkedList<Song> PlayList){
	int index=trackNumber-1;
	if(index>0 && index.songs.size()) {
		
	}
	

}
	
}


