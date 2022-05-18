package projeto.trabalho.circulos.circuloBres;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import projeto.trabalho.circulos.algCircParam.CirculoPainelParam;

public class CirculoClick extends MouseAdapter {
    private static Color color = Color.red;
    private CirculoPainel panel;
    private String diameter;
    public CirculoClick(CirculoPainel panel) {
        super();
        this.panel = panel;
    }

    public CirculoClick(CirculoPainelParam panel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        diameter = JOptionPane.showInputDialog(null,"Digite o raio");
        if (diameter == null){
            return;
        }else {
            panel.addCircle(new Circulo(e.getX(), e.getY(), Integer.parseInt(diameter), color));
        }
    }

    public static void setColor(Color color) {
        CirculoClick.color = color;
    }

    public static Color getColor() {
        return color;
    }
}
