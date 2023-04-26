package hui;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.util.Random;

public class Heart extends JFrame{

    public  void start(){
        // 定义横坐标的随机数
        int x=new Random().nextInt(1920);//分辨率宽度
        int speed= new Random().nextInt(20)+1;
        Heart heart = new Heart();
        heart.setSize(400,400);//设置窗口大小
        heart.setUndecorated(true);//去掉窗口边距
        heart.setAlwaysOnTop(true);//让窗口显示在最前面
        heart.setVisible(true);//设置可见性
        Color color=new Color(255,255,255,0);
        heart.setBackground(color);
        //实现爱心下落的原因是横坐标不变，纵坐标发生改变
        int index=0;
        while (true) {
            heart.setLocation(x, index);
            index = index + speed;
            try {
                Thread.sleep(50);//数字代表飘落速度
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(index>900){//数字代表自己电脑的分辨率
                index=-300;
            }
        }
    }
    public void paint(Graphics g){//g是画笔对象
        //使用字节输入流读取图片
        try {
            //定义图片大小的随机数
             int size=new Random().nextInt(100)+50;
            FileInputStream fileInputStream = new FileInputStream("D:\\软件\\IDEA\\java\\image\\公子的心.png");

            BufferedImage image= ImageIO.read(fileInputStream);

            g.drawImage(image,0,0,size,size,null);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}