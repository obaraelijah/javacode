package SongPlayListApp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Iterator;



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

        LinkedList<Song> playList = new LinkedList<>();

        albums.get(0).addToPlayList("Gods plan",playList_1);
        albums.get(0).addToPlayList("Highway to hell",playList_1);
        albums.get(1).addToPlayList("Rap god",playList_1);
        albums.get(1).addToPlayList("Lose yourself",playList_1);

        play(playList_1)

    }

    private static void play(LinkedList<Song> playlist){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("This playlist have no song");
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        

    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of all songs \n"+
                "5 - print all available options\n"+
                "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-----------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
    }



}
