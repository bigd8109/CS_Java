package DesignPattern.Adapter_Pattern;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4() {
        System.out.println("Playing Mp4");
    }

    @Override
    public void playVlc() {
        //do nothing
    }
}
