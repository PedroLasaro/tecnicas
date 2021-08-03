package CK235_496640_TRAB_05;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.plaf.DimensionUIResource;
public class Janela extends JFrame {
    private JTextPane texto;
    private Container c;

    public static void main(String[] args) {
        RandomGaussian gauss = new RandomGaussian();
        Janela tela = new Janela("Numeros de Gauss", gauss);
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
        this.setLayout(new BorderLayout());

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
        titulo.setBounds(210, 100, 400, 100);
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
                inserirlinha(gauss.lerlog(Logg));
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
        valores.setBounds(50, 50, 310, 220);

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
        t2.setBounds(450, 50, 255, 20);
        t2.setBorder(BorderFactory.createEtchedBorder());

        // gerar novos valores
        JButton b1 = new JButton("Gerar novos valores");
        b1.setBounds(450, 70, 255, 100);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                File Logg = gauss.criarlog();
                Logg = RandomGaussian.Sorted(Logg);
                inserirlinha(gauss.lerlog(Logg));
            }
        });

        // voltar
        JButton b2 = new JButton("Voltar");
        b2.setBounds(450, 170, 255, 100);
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
}