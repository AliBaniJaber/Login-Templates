package Login2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

public class Login2Controller implements Initializable {

    @FXML
    private MediaView mediaView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Media media=new Media("http://94.130.11.106/dl/s10/v6ImQhrLbTRoiFpzw3l8_A,1533924438/yt:ugTaLEBu6g8-8/A%20short%20Meditation%20of%20Nature%20Sounds-Relaxing%20Birdsong-Calming%20Sound%20of%20Water%20Relaxation.mp4");
        MediaPlayer player=new MediaPlayer(media);
        mediaView.setMediaPlayer(player);
        player.setVolume(0);
        player.play();

    }
}
