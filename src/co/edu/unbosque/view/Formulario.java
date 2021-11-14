package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.controller;
import co.edu.unbosque.model.JugadorDTO;
import co.edu.unbosque.model.persistance.JugadorDAO;
import co.edu.unbosque.model.persistance.JugadorFile;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JugadorFile jf; 
	private JButton jbt;
	private controller cont;
	private static final String REGISTRAR ="REGISTRAR";
	private JTextField textField_4;
	private JugadorDTO jugador2;
	private JugadorDAO jugador1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		jf=new JugadorFile();
		jugador1=new JugadorDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 348);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(42, 94, 96, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Edad:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(42, 146, 96, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Puntaje:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(271, 94, 96, 31);
		contentPane.add(lblNewLabel_2);
		
		
		
		textField_3=new JTextField();
		textField_3.setBounds(377, 153, 103, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(141, 102, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 154, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(377, 102, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Genero:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(271, 150, 89, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Registro de Usuario");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(187, 24, 214, 31);
		contentPane.add(lblNewLabel_4);
		
		 this.jbt=new JButton("Registrar");
		this.jbt.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.jbt.setBounds(244, 233, 133, 31);
		this.jbt.setActionCommand(REGISTRAR);
		contentPane.add(this.jbt);
		
		JLabel lblNewLabel_5 = new JLabel("Jugador ID");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(24, 202, 96, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(141, 201, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		ActionListener escuchador=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String genero=textField_3.getText();
				int edad=Integer.parseInt(textField_2.getText());
				String nombre=textField.getText();
				int puntaje=Integer.parseInt(textField_1.getText());
				String id=textField_4.getText();
				if(jugador1.Existe(id)==true) {
					JOptionPane.showMessageDialog(null, "ese id ya existe,intente con otro");
				}else {
				JugadorDTO nuevo_jugador=new JugadorDTO(nombre,puntaje,genero,edad,id);
				jugador1.Agregar_jugador(nuevo_jugador);
				}   
				
				// TODO Auto-generated method stub
				
			}
			
		};
		this.jbt.addActionListener(escuchador);
		
		
	
		
	}

	
	public  String getRegistrar() {
		return REGISTRAR;
	}


	public JTextField getTextField_3() {
		return textField_3;
	}

	public JButton getJbt() {
		System.out.println(jbt);
	
		return this.jbt;
	}


	


	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}
}
