package projeto.trabalho.linhas.algAnalitic;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class LinhaPainel extends JPanel {
    private List<Linha> circles = new LinkedList<Linha>();
    public void addCircle(Linha circle) {
        circles.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (Linha c :circles) {
            c.draw(g);
        }
    }
}
