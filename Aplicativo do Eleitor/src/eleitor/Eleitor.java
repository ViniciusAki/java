package eleitor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eleitor extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdade;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleitor frame = new Eleitor();
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
	public Eleitor() {
		setResizable(false);
		setTitle("Apricativo do Eleitor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Idade");
		lblNewLabel.setBounds(41, 43, 48, 14);
		contentPane.add(lblNewLabel);

		txtIdade = new JTextField();
		txtIdade.setBounds(81, 40, 109, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// invocado o método verificar
				verificar();

			}
		});
		btnVerificar.setBounds(43, 90, 89, 23);
		contentPane.add(btnVerificar);

		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblResultado.setBounds(66, 171, 191, 60);
		contentPane.add(lblResultado);
	} // final do construtor

	// Método para verificar a obrigatoriedade do voto
	void verificar() {
		int idade;
		// entrada
		idade = Integer.parseInt(txtIdade.getText());
		// processamento + saída

		// apoio ao entendimento da lógica
		 System.out.println(idade);
		if (idade < 16) {
			lblResultado.setText("Proibido votar");
		}  else if (idade >= 18 && idade <= 70){
			lblResultado.setText("Voto obrigatório");
		} else if (idade == 16 || idade == 17 || idade > 70 ) {
			lblResultado.setText("Voto facultativo");
		}
	}
}
