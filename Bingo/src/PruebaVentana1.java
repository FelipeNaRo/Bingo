import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class PruebaVentana1 extends JFrame {

	private JPanel contentPane;
	private JTextField bolaNum;
	private JTextField numero;


	
	public PruebaVentana1(int n,int b) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bolaNum = new JTextField();
		bolaNum.setBounds(10, 48, 86, 20);
		contentPane.add(bolaNum);
		bolaNum.setColumns(10);
		
		
		JLabel lblBolaN = new JLabel("Bola n\u00BA:");
		lblBolaN.setBounds(10, 23, 46, 14);
		contentPane.add(lblBolaN);
		
		numero = new JTextField();
		numero.setText(""+b);
		numero.setBounds(10, 114, 86, 20);
		contentPane.add(numero);
		numero.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(10, 89, 65, 14);
		contentPane.add(lblNumero);
	}
	public void ponTexto(int n, int b){
		bolaNum.setText(""+n);
		numero.setText(""+b);
	}
}
