package DesignPattern.Adapter_Pattern;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playMp4() {
        //do nothing
    }

    @Override
    public void playVlc() {
        System.out.println("Playing Mp4");
    }
}
