package IMC;

import java.awt.EventQueue;
import java.awt.Font;
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

public class IMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtpeso;
	private JTextField txtaltura;
	private JTextField txtimc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC frame = new IMC();
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
	public IMC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpeso = new JTextField();
		txtpeso.setBounds(94, 43, 128, 20);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(36, 44, 48, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(36, 83, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		txtaltura = new JTextField();
		txtaltura.setBounds(94, 82, 128, 20);
		contentPane.add(txtaltura);
		txtaltura.setColumns(10);
		
		txtimc = new JTextField();
		txtimc.setBounds(94, 123, 128, 20);
		contentPane.add(txtimc);
		txtimc.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(36, 124, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btncalcular = new JButton("");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat formatador = new DecimalFormat("#0.0");
				// variaveis
				double peso, altura, imc;
				// entrada
				  peso =  Double.parseDouble(txtpeso.getText().replace(",", "."));
				    altura = Double.parseDouble(txtaltura.getText().replace(",", "."));
				    imc = peso / (altura * altura);
			
				 // saida
				    txtimc.setText("" + imc);
				    
				    
				   
				    if (imc < 16.99) {
						JOptionPane.showMessageDialog(null, "muito baixo do peso", "Status", JOptionPane.INFORMATION_MESSAGE);
					} else if ( imc >= 16.99 && imc < 18.5 ){

						JOptionPane.showMessageDialog(null, "Abaixo do peso", "Status", JOptionPane.INFORMATION_MESSAGE);
					
					} else if ( imc >= 25 && imc < 29.99 ){

						JOptionPane.showMessageDialog(null, "Peso normal ", "Status", JOptionPane.INFORMATION_MESSAGE);
					
					} else if ( imc >= 30 && imc < 34.99 ){

						JOptionPane.showMessageDialog(null, "Acima do peso", "Status", JOptionPane.INFORMATION_MESSAGE);
					
					
					} else if ( imc >= 40 ){

						JOptionPane.showMessageDialog(null, "Acima do peso", "Status", JOptionPane.INFORMATION_MESSAGE);
					
					
					
					}
				}
			
		
		
			
			
		});
		btncalcular.setBounds(79, 212, 128, 106);
		contentPane.add(btncalcular);
	}

}
