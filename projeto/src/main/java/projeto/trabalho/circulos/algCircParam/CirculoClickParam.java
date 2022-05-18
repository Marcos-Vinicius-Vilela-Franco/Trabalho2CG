package projeto.trabalho.circulos.algCircParam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CirculoClickParam extends MouseAdapter {
    private static Color color = Color.red;
    private CirculoPainelParam panel;
    private String diameter;
    public CirculoClickParam(CirculoPainelParam panel) {
        super();
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new CirculoParam(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        CirculoClickParam.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
