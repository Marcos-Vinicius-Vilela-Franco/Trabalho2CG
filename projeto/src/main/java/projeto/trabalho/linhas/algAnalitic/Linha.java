package projeto.trabalho.linhas.algAnalitic;

import java.awt.*;

public class Linha {
    private int x;
    private int y;
    private int diameter;
    private Color color;
    private int desloc;
    public Linha(int x, int y, int diameter, Color color) {
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
        algBres(g,diameter);
    }
    public void algBres(Graphics g, int raio) {
        int x=0, y=raio, u=1, v=2 *raio-1, e=0;

        while(x<=y) {
            simetria(g,x,y);
            x++;
            e = e + u;
            u = u + 2;
            if (v<(2*e)) {y--; e=e-v; v=v-2;}
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
        g.drawLine(x+getX(), y+getY(), x+getX(), y+getY());
    }
}
