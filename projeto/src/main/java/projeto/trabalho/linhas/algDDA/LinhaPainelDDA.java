package projeto.trabalho.linhas.algDDA;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class LinhaPainelDDA extends JPanel {
    private List<LinhaDDA> circles = new LinkedList<LinhaDDA>();
    public void addCircle(LinhaDDA circle) {
        circles.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (LinhaDDA c :circles) {
            c.draw(g);
        }
    }
}
