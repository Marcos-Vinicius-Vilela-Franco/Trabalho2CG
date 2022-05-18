package projeto.trabalho.circulos.algCircSem;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class CirculoPainelSem extends JPanel {
    private final List<CirculoSem> circles = new LinkedList<>();
    public void addCircle(CirculoSem circle) {
        circles.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (CirculoSem c :circles) {
            c.draw(g);
        }
    }
}
