package br.com.form;

import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPrincipal{
	public static void main(String[] args) throws IOException {
		JFrame j = new JFrame("Upload de Arquivos");
		TelaPrincipal tp = new TelaPrincipal(j);
		tp.criaTela();
	}
	private JFrame frame = new JFrame();

	public TelaPrincipal(JFrame frame) {
		this.frame = frame;
	}

	public void criaTela(){
		JPanel panel = new JPanel();
		JButton button= new JButton();
		JTextField field = new JTextField();
		
		frame.setVisible(true);;
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400, 100);
		frame.setVisible(true);
		
		panel = criaPanel(frame.getWidth(), frame.getHeight());
		button = criaButtonUpload(500, 100);
		field = criaTextField(500, 100);
		panel.add(field);
		panel.add(button);
		frame.add(panel);
	}
	public JPanel criaPanel(int w, int h){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setSize(w, h);
		panel.setVisible(true);
		return panel;
	}
	
	public JButton criaButtonUpload(int x, int y){
		JButton button = new JButton("Upload");
		button.setLocation(x, y);
		return button;
	}
	
	public JTextField criaTextField(int x, int y){
		JTextField field = new JTextField();
		field.setLocation(x, y);
		field.setSize(100, 10);
		return field;
		
	}
}
