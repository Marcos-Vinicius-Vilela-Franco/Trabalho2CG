package projeto.trabalho.linhas.algDDA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LinhaClickDDA extends MouseAdapter {
    private static Color color = Color.red;
    private LinhaPainelDDA panel;
    private String diameter;
    public LinhaClickDDA(LinhaPainelDDA panel) {
        super();
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new LinhaDDA(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        LinhaClickDDA.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
