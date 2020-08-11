package DesignPattern.Adapter_Pattern;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
        else if (type.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String type) {
        if (type.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4();
        }
        else if (type.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc();
        }

    }
}
