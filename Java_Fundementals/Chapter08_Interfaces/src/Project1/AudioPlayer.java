package Project1;

public class AudioPlayer implements MediaPlayer {


    MediaAdapter mediaAdapterObject;

    @Override  /*Implementeer de methode play hier zodanig dat je op basis van je argumenten
                (String audioType, String Filename) ofwel een sysout doet in het geval de
                String audioType gelijk is aan mp3 of gebruik de eigenschap mediaAdapter
                om de play methode aan te roepen (in het geval van mp4 of vlc) */
    public void play(String audioType, String fileName) {

//change to if then, because unable to create multiple copies of mediaadapterobject

            if (audioType == "mp3") {
                System.out.println("Playing " + fileName + "as an mp3");
            }
            else if (audioType == "mp4" || audioType == "vlc") {
                MediaAdapter mediaAdapterObject = new MediaAdapter(audioType);
                mediaAdapterObject.play(audioType, fileName);
            }
            else {
                System.out.println("Sorry, the file type is not compatible with AudioPlayer.");
            }

        }

}
