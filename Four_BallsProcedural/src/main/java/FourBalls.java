import processing.core.PApplet;
public class FourBalls extends PApplet
{
    public static final int Width=500;
    public static final int Height=500;
    public static int x1=0,x2=0,x3=0,x4=0;

    public static void main(String []args)
    {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        size(Width,Height);
    }

    @Override
    public void draw() {
        firstBall();
        secondBall();
        thirdBall();
        fourthBall();
    }

    private void firstBall()
    {
        fill(255,0,0);
        ellipse(x1,Height/5,10,10);
        x1++;
    }
    private void secondBall()
    {
        fill(0,255,0);
        ellipse(x2,Height*2/5,10,10);
        x2=x2+2;
    }
    private void thirdBall()
    {
        fill(36,40,36);
        ellipse(x3,Height*3/5,10,10);
        x3=x3+3;
    }
    private void fourthBall()
    {
        fill(33,20,210);
        ellipse(x4,Height*4/5,10,10);
        x4=x4+4;
    }
}
