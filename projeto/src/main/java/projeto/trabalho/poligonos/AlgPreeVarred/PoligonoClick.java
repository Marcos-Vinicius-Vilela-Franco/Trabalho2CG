package projeto.trabalho.poligonos.AlgPreeVarred;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PoligonoClick extends MouseAdapter {
    private static Color color = Color.red;
    private PoligonoPainel panel;
    private String diameter;
    public PoligonoClick(PoligonoPainel panel) {
        super();
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new Poligono(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        PoligonoClick.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
