package CK235_496640_TRAB_05;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

    private JTextPane texto;
    private Container c;

    public static void main(String[] args) {
        RandomGaussian gauss = new RandomGaussian();
        Janela tela = new Janela("Numeros de Gauss",gauss);
        File Log = gauss.criarlog();
        Log = RandomGaussian.Sorted(Log);
        tela.inserirlinha(gauss.lerlog(Log));
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

        // botão
        JButton start_button = new JButton("Gerar Números");
        start_button.setBounds(295, 360, 200, 30);
        start_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                troca(ev, tela_inicial, tela_valores);
            }
        });
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

        // area dos valores
        JPanel valores = new JPanel();
        valores.setLayout(new BorderLayout());
        valores.setBorder(BorderFactory.createLineBorder(Color.gray));
        valores.setBounds(50, 50, 310, 220);

        // label dos valores
        JLabel t1 = new JLabel("Valores:");
        t1.setBorder(BorderFactory.createEtchedBorder());

        // texto não editável com os valores
        texto = new JTextPane();
        texto.setBorder(BorderFactory.createEtchedBorder());
        texto.setEditable(false);

        valores.add(t1,BorderLayout.NORTH);
        valores.add(texto,BorderLayout.CENTER);

        // area do botões

        // label dos botões
        JLabel t2 = new JLabel("Opções:");
        t2.setBounds(550, 50, 155, 20);
        t2.setBorder(BorderFactory.createEtchedBorder());

        // botões
        JButton b1 = new JButton("Regerar valores");
        JButton b2 = new JButton("Voltar");
        b1.setBounds(550, 70, 155, 100);
        b2.setBounds(550, 170, 155, 100);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                File Log = gauss.criarlog();
                Log = RandomGaussian.Sorted(Log);
                inserirlinha(gauss.lerlog(Log));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                troca(ev, tela_valores, tela_inicial);
            }
        });

        // adição dos componentes na tela das funcionalidades
        tela_valores.add(valores);
        tela_valores.add(t2);
        tela_valores.add(b1);
        tela_valores.add(b2);

        c.add(tela_inicial);
    }

    public void mostrar() {
        this.setVisible(true);
    }

    public void troca(ActionEvent ev, JPanel atual, JPanel prox) {
        c.remove(atual);
        c.add(prox);
        c.repaint();
    }

    public void inserirlinha(String linha) {
        texto.setText(linha);
    }
}