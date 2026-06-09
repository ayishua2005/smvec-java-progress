interface MediaPlayer {
    void play();
    void pause();
}

class AudioPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Audio is playing.");
    }

    public void pause() {
        System.out.println("Audio paused.");
    }
}

class VideoPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Video is playing.");
    }

    public void pause() {
        System.out.println("Video paused.");
    }
}

class PodcastPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Podcast is playing.");
    }

    public void pause() {
        System.out.println("Podcast paused.");
    }
}

public class Problem7 {
    public static void main(String[] args) {
        MediaPlayer player;

        player = new AudioPlayer();
        player.play();
        player.pause();

        player = new VideoPlayer();
        player.play();
        player.pause();

        player = new PodcastPlayer();
        player.play();
        player.pause();
    }
}