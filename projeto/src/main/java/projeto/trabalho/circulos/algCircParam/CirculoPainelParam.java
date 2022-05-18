package projeto.trabalho.circulos.algCircParam;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class CirculoPainelParam extends JPanel {
    private List<CirculoParam> circles = new LinkedList<CirculoParam>();
    public void addCircle(CirculoParam circle) {
        circles.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (CirculoParam c :circles) {
            c.draw(g);
        }
    }
}
