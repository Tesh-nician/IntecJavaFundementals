package Project1;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayerObject; //defines an object of the AdvancedMediaPlayer class

    public MediaAdapter(String audioType){
        //audioType als parameter zal gebruikt
        //worden om te zien of je de eigenschap als een instantie van VlcPlayer of
        //Mp4player moet aanmaken. (hint bekijk mss de String Java API) ???
    }

    @Override
    public void play(String audioType,String fileName) {
        //  hierin maak je een keuze op basis van je
        //argumenten om te zien of je de methode playVlc of playMp4 moet
        //aangeroepen worden. Geef hieraan het argument fileName mee.
        if (audioType.equals("mp4")){AdvancedMediaPlayer.playMp4(fileName);} // solution define advancedMediaPlayerObject as playM4 or playVlc
        // and perhaps  get audioType from MediaApter
        else {AdvancedMediaPlayer.playVlc(fileName);}//this probably be combined with the previous.
    }
}
