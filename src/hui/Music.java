package hui;

import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class Music extends  Thread{
public  void run(){
    FileInputStream file = null;
    try {
        file = new FileInputStream("D:\\软件\\IDEA\\java\\music\\dxj.mp3");
        Player player =new Player(file);
        player.play();

    } catch (Exception e) {
        e.printStackTrace();
    }

}

}
