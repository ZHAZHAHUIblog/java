package hui;

public class HeartThread extends Thread{
    @Override
    public void run() {//想要线程做啥，就在RUN方法里面写啥
        Heart heart=new Heart();
        heart.start();

    }
}
