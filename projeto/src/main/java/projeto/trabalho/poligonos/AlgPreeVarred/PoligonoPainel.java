package projeto.trabalho.poligonos.AlgPreeVarred;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class PoligonoPainel extends JPanel {
    private List<Poligono> polygon = new LinkedList<Poligono>();
    public void addCircle(Poligono circle) {
        polygon.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (Poligono c :polygon) {
            c.draw(g);
        }
    }
}
