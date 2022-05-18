package projeto.trabalho.linhas.algDDA;

import java.awt.*;

public class LinhaDDA {
    private int x;
    private int y;
    private int diameter;
    private Color color;
    private int desloc;
    public LinhaDDA(int x, int y, int diameter, Color color) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
        desloc = getX();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        algIncSem(g,diameter);
    }
    public void algIncSem(Graphics g, int raio) {
        int x=this.x, y=this.y;
        double ang=0.0;

        while(ang<Math.PI/4) {
            x = (int) (raio * Math.cos(ang));
            y = (int) (raio * Math.sin(ang));
            //putPixel(g,x,y);
            simetria(g,x,y);
            ang = ang + (double) 1/raio;
        }


    }


    private void simetria(Graphics g, int x, int y) {
        putPixel(g,x,y);
        putPixel(g,x,-y);
        putPixel(g,-x,y);
        putPixel(g,-x,-y);

        putPixel(g,y,x);
        putPixel(g,y,-x);
        putPixel(g,-y,x);
        putPixel(g,-y,-x);

    }
    private void putPixel(Graphics g, int x, int y) {
        g.drawLine(x+getX(),y+getY(), x+getX(), y+getY());
    }
}
