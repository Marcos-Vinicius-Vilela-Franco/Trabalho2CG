package projeto.trabalho.linhas.algAnalitic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LinhaClick extends MouseAdapter {
    private static Color color = Color.red;
    private LinhaPainel panel;
    private String diameter;
    public LinhaClick(LinhaPainel panel) {
        super();
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new Linha(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        LinhaClick.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
