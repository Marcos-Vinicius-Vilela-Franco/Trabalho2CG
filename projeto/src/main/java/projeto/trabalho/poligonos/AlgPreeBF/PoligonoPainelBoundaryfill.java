package projeto.trabalho.poligonos.AlgPreeBF;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class PoligonoPainelBoundaryfill extends JPanel {
    private List<PoligonoBoundaryfill> circles = new LinkedList<PoligonoBoundaryfill>();
    public void addCircle(PoligonoBoundaryfill circle) {
        circles.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (PoligonoBoundaryfill c :circles) {
            c.draw(g);
        }
    }
}
