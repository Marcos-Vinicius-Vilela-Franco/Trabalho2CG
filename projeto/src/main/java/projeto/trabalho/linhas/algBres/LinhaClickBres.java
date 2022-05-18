package projeto.trabalho.linhas.algBres;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LinhaClickBres extends MouseAdapter {
    private static Color color = Color.red;
    private LinhaPainelBres panel;
    private String diameter;
    public LinhaClickBres(LinhaPainelBres panel) {
        super();
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new LinhaBres(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        LinhaClickBres.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
