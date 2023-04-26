package hui;

public class Main {
    public static void main(String[] args) {
        Music music= new Music();
        music.start();
        for(int i=0;i<50;i++){
            HeartThread thread =new HeartThread();
            thread.start();
        }
    }
}
