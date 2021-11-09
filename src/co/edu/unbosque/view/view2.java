package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.controller;

public class view2 extends JFrame{
	private static final long serialVersionUID = 1L;
	private Formulario form;
	
	public view2(controller control) {
		form=new Formulario();
		form.getJbt().addActionListener(control);
		
	}

	public Formulario getForm() {
		return form;
	}

	public void setForm(Formulario form) {
		this.form = form;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
