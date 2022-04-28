package CK235_496640_TRAB_05;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.TreeSet;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.plaf.DimensionUIResource;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Janela extends JFrame {
    private JTextPane texto;
    private Container c;

    public static void main(String[] args) {
        RandomGaussian gauss = new RandomGaussian();
        Janela tela = new Janela("Números de Gauss", gauss);
        tela.mostrar();
    }

    public Janela(String str, RandomGaussian gauss) {
        super(str); // Método construtor da superclasse Jframe("String");

        // Atributos
        Dimension max_tam = new DimensionUIResource(800, 600);

        // Janela
        this.setSize(max_tam); // Tamanho da janela
        this.setLocationByPlatform(rootPaneCheckingEnabled); // Localização
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Operação de fechar a jane

        // Container superior
        c = getContentPane();
        c.setSize(max_tam);

        // #Layout

        // 1 - tela de abertura
        JPanel tela_inicial = new JPanel();
        tela_inicial.setLayout(null);
        tela_inicial.setSize(max_tam);

        // 2 - tela com as funções
        JPanel tela_valores = new JPanel();
        tela_valores.setLayout(null);
        tela_valores.setSize(max_tam);

        // #Componentes

        // 1 - tela de abertura

        // titulo
        JLabel titulo = new JLabel("Gerador de número de Gauss");
        titulo.setBounds(220, 110, 400, 100);
        titulo.setFont(new Font("Arial", Font.PLAIN, 25));

        // botões

        // iniciar
        JButton start_button = new JButton("Gerar Números");
        start_button.setBounds(295, 360, 200, 30);
        start_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                troca(tela_inicial, tela_valores);
                File Logg = gauss.criarlog();
                Logg = RandomGaussian.Sorted(Logg);
                TreeSet<Double> conjunto = Sort.conjunto;
                inserirlinha(gauss.lerlog(Logg));
                criarGrafico(conjunto, gauss, tela_valores);
            }
        });

        // sair
        JButton exit_button = new JButton("Sair");
        exit_button.setBounds(295, 390, 200, 30);
        exit_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.exit(getDefaultCloseOperation());
            }
        });

        // adição dos componentes na tela de abertura
        tela_inicial.add(titulo);
        tela_inicial.add(start_button);
        tela_inicial.add(exit_button);

        // 2 - tela das funcionalidades

        // |area dos valores|

        // painel
        JPanel valores = new JPanel();
        valores.setLayout(new BorderLayout());
        valores.setBounds(50, 50, 200, 200);

        // label
        JLabel t1 = new JLabel("Valores:");
        t1.setBorder(BorderFactory.createEtchedBorder());

        // texto não editável
        texto = new JTextPane();
        texto.setBorder(BorderFactory.createEtchedBorder());
        texto.setEditable(false);

        // |area dos botões|

        // label
        JLabel t2 = new JLabel("Opções:");
        t2.setBounds(450, 50, 205, 20);
        t2.setBorder(BorderFactory.createEtchedBorder());

        // gerar novos valores
        JButton b1 = new JButton("Gerar novos valores");
        b1.setBounds(450, 70, 205, 60);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                File Logg = gauss.criarlog();
                Logg = RandomGaussian.Sorted(Logg);
                TreeSet<Double> conjunto = Sort.conjunto;
                inserirlinha(gauss.lerlog(Logg));
                criarGrafico(conjunto, gauss, tela_valores);
            }
        });

        // voltar
        JButton b2 = new JButton("Voltar");
        b2.setBounds(450, 130, 205, 60);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                troca(tela_valores, tela_inicial);
            }
        });

        // adição dos componentes na tela de funcionalidade

        // do painel maior
        tela_valores.add(valores);

        // do painel de valores
        valores.add(t1, BorderLayout.NORTH);
        valores.add(texto, BorderLayout.CENTER);

        // os botões
        tela_valores.add(t2);
        tela_valores.add(b1);
        tela_valores.add(b2);

        c.add(tela_inicial);
    }

    public void mostrar() {
        this.setVisible(true);
    }

    public void troca(JPanel atual, JPanel prox) {
        c.remove(atual);
        c.add(prox);
        c.repaint();
    }

    public void inserirlinha(String linha) {
        texto.setText(linha);
    }

    public double pdf(double x, Double mean, double variance){
        double base = 1/Math.sqrt(2*Math.PI*variance);
        double pow = -(Math.pow((x-mean), 2)/2*variance);
        return Math.pow(base, pow);}

    public void criarGrafico(TreeSet<Double> conjunto,RandomGaussian gauss,JPanel tela){
            Double mean = RandomGaussian.MEAN;
            Double variance = RandomGaussian.VARIANCE;
            TreeSet<Double> dados = new TreeSet<>();
            for (Double d : conjunto) {
                d = pdf(d,mean,variance);
                System.out.println(d);
                dados.add(d);
            }
            DefaultCategoryDataset linha = new DefaultCategoryDataset();
            for (double d : dados) {
                linha.setValue(d, " ", " ");
            }

            JFreeChart grafico = ChartFactory.createLineChart("pdf", mean.toString(), variance.toString(), linha);
            ChartPanel painel = new ChartPanel(grafico);
            painel.setBounds(50,300,400,200);
            tela.add(painel);
        }


}