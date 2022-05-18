package projeto.trabalho.linhas.algBres;

import java.awt.*;

public class LinhaBres {
    private int x;
    private int y;
    private int diameter;
    private Color color;
    private int desloc;
    public LinhaBres(int x, int y, int diameter, Color color) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
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
        algParam(g,diameter);
    }
    public void algParam(Graphics g, int raio) {
        int x, y;
        for (int ang=0; ang<360; ang++) {
            x = (int) (raio * Math.cos(Math.PI*ang/180));
            y = (int) (raio * Math.sin(Math.PI*ang/180));
            putPixel(g,x,y);
        }
    }

    private void putPixel(Graphics g, int x, int y) {
        g.drawLine(x+getX(), y+getY(), x+getX(), y+getY());
    }
}
