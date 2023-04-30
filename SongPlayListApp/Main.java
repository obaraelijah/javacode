package SongPlayListApp;

import java.util.ArrayList;

public class Main {
    
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args){
        
        
        Album album = new Album("Take care","Drake");

        album.addSong("Gods plan", 5.9);
        album.addSong("Highway to hell",3.5);
        album.addSong("Kyrptomaniac",5.0);
        albums.add(album);

        album = new Album("Marshall 2","Eminem");

        album.addSong("Rap god",4.5);
        album.addSong("Not Afraid",3.5);
        album.addSong("Lose yourself",4.5);
        albums.add(album);

    }
}
