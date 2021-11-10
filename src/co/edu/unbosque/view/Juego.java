package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.model.persistance.JugadorFile;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField textTipoDeJUego;
	private JTextField textNombreDeJuego;
	private JugadorFile jf;
	private JButton jbt;
	private static final String JUEGO ="JUEGO";


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
		
		 this.jbt=new JButton("Registrar");
			this.jbt.setFont(new Font("Tahoma", Font.BOLD, 14));
			this.jbt.setBounds(220, 235, 133, 31);
			this.jbt.setActionCommand(JUEGO);
			contentPane.add(this.jbt);
			jf = new JugadorFile();
		ActionListener escuchador=new ActionListener() {

		public void actionPerformed(ActionEvent e) {
				
			String Tipo = textTipoDeJUego.getText();
			String nombre = textNombreDeJuego.getText();
			JOptionPane.showMessageDialog(null,jf.escribirJuego(Tipo, nombre));
		
jf.leerJuego();
			System.out.println(jf.getDatos3()+"");
			for(int i=0; i<jf.getDatos3().length;i++) {
				System.out.println(jf.getDatos3()[i].getNombre()+ "este es el nombre del objeto");
			}
			
		}
		
		
	};
	this.jbt.addActionListener(escuchador);
	
	}
		
		
		
		}
