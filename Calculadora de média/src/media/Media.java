package media;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Media extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtMedia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media frame = new Media();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Media() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Media.class.getResource("/icones/calculadora.png")));
		setResizable(false);
		setTitle("Calculadora da Media");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 73, 55, 14);
		contentPane.add(lblNewLabel);

		txtNota1 = new JTextField();
		txtNota1.setBounds(83, 72, 134, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nota 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(28, 104, 48, 14);
		contentPane.add(lblNewLabel_1);

		txtNota2 = new JTextField();
		txtNota2.setBounds(83, 103, 134, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);

		txtMedia = new JTextField();
		txtMedia.setEditable(false);
		txtMedia.setBounds(83, 134, 134, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);

		JButton btnmedia = new JButton("");
		btnmedia.setToolTipText("Calcular Media");
		btnmedia.setIcon(new ImageIcon(Media.class.getResource("/icones/calculator.png")));
		btnmedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat formatador = new DecimalFormat("#0.0");
				// variaveis
				double nota1, nota2, media;
				// entrada
				nota1 = Double.parseDouble(txtNota1.getText().replace(",", "."));
				nota2 = Double.parseDouble(txtNota2.getText().replace(",", "."));

				media = (nota1 + nota2) / 2;
				// saida
				txtMedia.setText("" + formatador.format(media));
				// estrutura de controle (aprovado ou reprovado)
				if (media < 5) {
					JOptionPane.showMessageDialog(null, "REPROVADO", "Status", JOptionPane.ERROR_MESSAGE);
				} else {

					JOptionPane.showMessageDialog(null, "APROVADO", "Status", JOptionPane.INFORMATION_MESSAGE);
				}
			}

		});
		btnmedia.setBounds(10, 210, 134, 137);
		contentPane.add(btnmedia);

		JButton btnLimpar = new JButton("Limpar campos");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNota1.setText(null);
				txtNota2.setText(null);
				txtMedia.setText(null);
			}
		});
		btnLimpar.setToolTipText("Limpar campos");
		btnLimpar.setIcon(new ImageIcon(Media.class.getResource("/icones/boracha2.png")));
		btnLimpar.setBounds(172, 210, 134, 137);
		contentPane.add(btnLimpar);

		JLabel lblNewLabel_2 = new JLabel("Media");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(28, 129, 36, 17);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sobre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Calculadora da Média mver 1.0\nAutor:  Vinicius Akio " , "Sobre",JOptionPane.DEFAULT_OPTION);
			
			
			
			}
		});
		btnNewButton.setBounds(231, 71, 89, 23);
		contentPane.add(btnNewButton);
	}
}
