package projeto.trabalho.poligonos.AlgPreeAGeo;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class PoligonoPainelAGeo extends JPanel {
    private List<PoligonoAGeo> polygon = new LinkedList<PoligonoAGeo>();
    public void addCircle(PoligonoAGeo circle) {
        polygon.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (PoligonoAGeo c :polygon) {
            c.draw(g);
        }
    }
}
