package projeto.trabalho.poligonos.AlgPreeAGeo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PoligonoClickAGeo extends MouseAdapter {
    private static Color color = Color.red;
    private PoligonoPainelAGeo panel;
    private String diameter;
    public PoligonoClickAGeo(PoligonoPainelAGeo panel) {
        super();
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new PoligonoAGeo(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        PoligonoClickAGeo.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
