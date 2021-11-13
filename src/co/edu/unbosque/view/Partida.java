package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.model.persistance.JugadorFile;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class Partida extends JFrame {
    
	private JugadorFile jf;
	private JPanel contentPane;
	private JTextField textJugador1;
	private JTextField txtJugador2;
	private JTextField textTipoDePartida;
	private JTextField txtPuntaje1;
	private JTextField txtPuntaje2;
	private JButton jbt;
	
	private static final String REGISTRAR ="REGISTRAR";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Partida frame = new Partida();
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
	public Partida() {
		

		jf=new JugadorFile();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de partida ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(89, 37, 116, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jugador 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(34, 88, 73, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Jugador 2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(34, 137, 73, 13);
		contentPane.add(lblNewLabel_2);
		
		textJugador1 = new JTextField();
		textJugador1.setBounds(117, 94, 96, 19);
		contentPane.add(textJugador1);
		textJugador1.setColumns(10);
		
		txtJugador2 = new JTextField();
		txtJugador2.setBounds(117, 136, 96, 19);
		contentPane.add(txtJugador2);
		txtJugador2.setColumns(10);
		
		textTipoDePartida = new JTextField();
		textTipoDePartida.setBounds(212, 36, 96, 19);
		contentPane.add(textTipoDePartida);
		textTipoDePartida.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Puntaje 1");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(247, 95, 73, 13);
		contentPane.add(lblNewLabel_3);
		
		txtPuntaje1 = new JTextField();
		txtPuntaje1.setBounds(330, 94, 96, 19);
		contentPane.add(txtPuntaje1);
		txtPuntaje1.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Puntaje 2");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(247, 136, 73, 13);
		contentPane.add(lblNewLabel_3_1);
		
		txtPuntaje2 = new JTextField();
		txtPuntaje2.setBounds(330, 133, 96, 19);
		contentPane.add(txtPuntaje2);
		txtPuntaje2.setColumns(10);
		
		 this.jbt=new JButton("Registrar");
			this.jbt.setFont(new Font("Tahoma", Font.BOLD, 14));
			this.jbt.setBounds(167, 193, 125, 34);
			this.jbt.setActionCommand(REGISTRAR);
			contentPane.add(this.jbt);
			ActionListener escuchador=new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
			
				
					
					String jugador1=textJugador1.getText();
					String jugador2=txtJugador2.getText();
				
				double  puntaje= Double.parseDouble(txtPuntaje1.getText());
				double puntaje2=Double.parseDouble(txtPuntaje2.getText());
				String Tipopartida=textTipoDePartida.getText();
			
		
				System.out.println(jf+"este es el objecto jf");
				jf.leerpartida();
				System.out.println(jf.getDatos2()+"");
				
					
		
					
			
				}	
			};
			this.jbt.addActionListener(escuchador);
			
			
		
			
			}

		
			
}
	
			

	



