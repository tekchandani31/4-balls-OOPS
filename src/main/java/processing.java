import processing.core.PApplet;

public class processing extends PApplet {


    public static final int WIDTH = 320;
    public static final int HEIGHT=488;

    int x=0;
    int y=0;
    int z=0;
    int a=0;

    @Override
    public void settings() {
        super.settings();
        size(648,488);
    }

    @Override
    public void setup() {
        plainWhite();
    }

    @Override
    public void draw() {
        ellipse(x, HEIGHT/5,10,10);
        x++;
        ellipse(y, 2*HEIGHT/5,10,10);
        y=y+2;
        ellipse(z, 3*HEIGHT/5,10,10);
        z=z+3;
        ellipse(a, 4*HEIGHT/5,10,10);
        a=a+4;
    }

    private void plainWhite() {
        background(255);
    }

    public static void main(String[] args)
    {
        PApplet.main("processing", args);


    }
}
