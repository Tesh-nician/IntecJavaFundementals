package Project1;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //not implemented

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing vlc file. Name: "+fileName);

    }
}
