package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ejercicio6 extends JFrame{
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textPeso;
	private JTextField textIMC;
	private static DecimalFormat df = new DecimalFormat("#.##");
	
	public void run() {
		try {
			Ejercicio6 frame = new Ejercicio6();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Ejercicio6() {
		setTitle("Ejercicio 6");
		setBounds(100, 100, 470, 133);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(10, 11, 88, 14);
		contentPane.add(lblNewLabel);
		
		textAltura = new JTextField();
		textAltura.setBounds(108, 8, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textPeso = new JTextField();
		textPeso.setBounds(334, 8, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso (kg)");
		lblNewLabel_1.setBounds(265, 11, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		textIMC = new JTextField();
		textIMC.setEditable(false);
		textIMC.setBounds(334, 54, 86, 20);
		contentPane.add(textIMC);
		textIMC.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(265, 57, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnIMC = new JButton("Calcular IMC");
		btnIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double altura = Double.parseDouble(textAltura.getText());
				double peso = Double.parseDouble(textPeso.getText());
				double imc = peso / (Math.pow(altura, 2));
				textIMC.setText(String.valueOf(df.format(imc)));
			}
		});
		btnIMC.setBounds(78, 53, 116, 23);
		contentPane.add(btnIMC);
	}
}