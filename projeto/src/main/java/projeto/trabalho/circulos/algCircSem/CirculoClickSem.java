package projeto.trabalho.circulos.algCircSem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CirculoClickSem extends MouseAdapter {
    private static Color color = Color.red;
    private final CirculoPainelSem panel;
    private String diameter;
    public CirculoClickSem(CirculoPainelSem panel) {
        super();
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new CirculoSem(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        CirculoClickSem.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
