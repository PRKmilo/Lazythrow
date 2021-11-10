package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField textTipoDeJUego;
	private JTextField textNombreDeJuego;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de juego");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 167, 135, 21);
		contentPane.add(lblNewLabel);
		
		textTipoDeJUego = new JTextField();
		textTipoDeJUego.setBounds(131, 169, 150, 21);
		contentPane.add(textTipoDeJUego);
		textTipoDeJUego.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del juego");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(0, 97, 129, 13);
		contentPane.add(lblNewLabel_1);
		
		textNombreDeJuego = new JTextField();
		textNombreDeJuego.setBounds(131, 95, 150, 21);
		contentPane.add(textNombreDeJuego);
		textNombreDeJuego.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Juego");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(131, 10, 178, 51);
		contentPane.add(lblNewLabel_2);
		
		JButton btnRegistrarJUego = new JButton("Registrar");
		btnRegistrarJUego.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrarJUego.setBounds(299, 125, 109, 39);
		contentPane.add(btnRegistrarJUego);
	}
}
