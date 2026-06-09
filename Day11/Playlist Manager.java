import java.util.LinkedList;

public class PlaylistManager {

    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");

        System.out.println("Playlist:");
        System.out.println(playlist);

        playlist.add("Song D");
        playlist.remove("Song B");

        System.out.println("Updated Playlist:");
        System.out.println(playlist);

        System.out.println("Now Playing: " + playlist.getFirst());
        System.out.println("Next Song: " + playlist.get(1));
    }
}