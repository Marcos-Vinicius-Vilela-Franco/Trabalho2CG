package projeto.trabalho;
import projeto.trabalho.circulos.algCircSem.CirculoClickSem;
import projeto.trabalho.circulos.algCircSem.CirculoPainelSem;
import projeto.trabalho.circulos.algCircParam.CirculoClickParam;
import projeto.trabalho.circulos.algCircParam.CirculoPainelParam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import projeto.trabalho.circulos.circuloBres.CirculoClick;
import projeto.trabalho.circulos.circuloBres.CirculoPainel;

public class Aplicacao extends JFrame {

    public Aplicacao() {
        JFrame window = new JFrame();
        window.setTitle("Trabalho 02");
        window.setSize(600, 600);
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        
        JMenuBar menuBar = new JMenuBar();
        
        window.setJMenuBar(menuBar);
        
        JMenu primitivas = new JMenu("Primitivas");
        JMenu cores = new JMenu("Cores");
        menuBar.add(primitivas);
        menuBar.add(cores);
        
        
        JMenu linhas = new JMenu("Linhas");
        JMenuItem analitico = new JMenuItem("Analítico");
        JMenuItem dda = new JMenuItem("DDA");
        JMenuItem bresenham = new JMenuItem("Bresenham");
        linhas.add(analitico);
        linhas.add(dda);
        linhas.add(bresenham);

        JMenu poligonos = new JMenu("Poligonos");
        JMenuItem varredura = new JMenuItem("Varredura");
        JMenuItem boundaryfill = new JMenuItem("BoundaryFill");
        JMenuItem analisegeometriva = new JMenuItem("Análise Geométrica");
        poligonos.add(varredura);
        poligonos.add(boundaryfill);
        poligonos.add(analisegeometriva);

        JMenu circulos = new JMenu("Circulos");
        JMenuItem parametrica = new JMenuItem("Paramétrica");
        JMenuItem incrementalcomsimertia = new JMenuItem("Incremental com Simetria");
        JMenuItem bresenhamCirculo = new JMenuItem("bresenham");
        circulos.add(parametrica);
        circulos.add(incrementalcomsimertia);
        circulos.add(bresenhamCirculo);
        bresenhamCirculo.addActionListener((ActionEvent actionEvent) -> {
            CirculoPainel panel = new CirculoPainel();
            window.setContentPane(panel);
            panel.addMouseListener(new CirculoClick(panel));
            panel.updateUI();
        });
        incrementalcomsimertia.addActionListener((ActionEvent actionEvent) -> {
            CirculoPainelSem panel = new CirculoPainelSem();
            window.setContentPane(panel);
            panel.addMouseListener(new CirculoClickSem(panel));
            panel.updateUI();
        });
        parametrica.addActionListener((ActionEvent actionEvent) -> {
            CirculoPainelParam panel = new CirculoPainelParam();
            window.setContentPane(panel);
            panel.addMouseListener(new CirculoClick(panel));
            panel.updateUI();
        });

        JMenuItem color_red = new JMenuItem("Vermelho");
        JMenuItem color_green = new JMenuItem("Verde");
        JMenuItem color_blue = new JMenuItem("Azul");

        primitivas.add(linhas);
        primitivas.add(poligonos);
        primitivas.add(circulos);

        cores.add(color_red);
        cores.add(color_blue);
        cores.add(color_green);

        color_red.addActionListener((ActionEvent actionEvent) -> {
            CirculoClick.setColor(Color.red);
            CirculoClickSem.setColor(Color.red);
            CirculoClickSem.setColor(Color.red);
        });
        color_blue.addActionListener((ActionEvent actionEvent) -> {
            CirculoClick.setColor(Color.blue);
            CirculoClickSem.setColor(Color.blue);
            CirculoClick.setColor(Color.red);
        });
        color_green.addActionListener((ActionEvent actionEvent) -> {
            CirculoClick.setColor(Color.green);
            CirculoClickSem.setColor(Color.green);
            CirculoClick.setColor(Color.green);
        });

    }
}