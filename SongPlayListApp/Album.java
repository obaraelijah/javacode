package SongPlayListApp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist )
    {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album()
    {

    }

    public Song findSong(String title)
    {
        for(Song checkedSong : songs)
        {
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }

    public boolean addSong(String title, double duration)
    {
        if(findSong(title) == null)
        {
            songs.add(new Song(title, duration));
            System.out.println(title + "successfully added to the list");
        } else {
            System.out.println("Song with name " + title + "already exists");
        }
        return false;
        
    }

    public boolean addToPLayList(int trackNumber, LinkedList<Song> PlayList)
    {
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have song with tracknumber" + trackNumber);
        return false;
    
    }

    public boolean addToPLayList(String title, LinkedList<Song> Playlist){
        for(Song checkedSong : this.songs){
            if (checkedSong.getTitle().equals(title)){
                Playlist.add(checkedSong);
                return true;
            }
        }
        System.out.println(title + "there is no search song in album");
        return false;
    }

}