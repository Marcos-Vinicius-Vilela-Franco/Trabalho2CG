package projeto.trabalho.poligonos.AlgPreeBF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PoligonoClickBoundaryfill extends MouseAdapter {
    private static Color color = Color.red;
    private PoligonoPainelBoundaryfill panel;
    private String diameter;
    public PoligonoClickBoundaryfill(PoligonoPainelBoundaryfill panel) {
        super();
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new PoligonoBoundaryfill(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        PoligonoClickBoundaryfill.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
