package projeto.trabalho.linhas.algBres;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class LinhaPainelBres extends JPanel {
    private List<LinhaBres> circles = new LinkedList<LinhaBres>();
    public void addCircle(LinhaBres circle) {
        circles.add(circle);
        this.repaint();
    }
    @Override
    public void paint(Graphics g) {
        for (LinhaBres c :circles) {
            c.draw(g);
        }
    }
}
