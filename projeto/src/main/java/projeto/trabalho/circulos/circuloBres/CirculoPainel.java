package projeto.trabalho.circulos.circuloBres;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class CirculoPainel extends JPanel {
    private List<Circulo> circles = new LinkedList<Circulo>();
    public void addCircle(Circulo circle) {
        circles.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (Circulo c :circles) {
            c.draw(g);
        }
    }
}
