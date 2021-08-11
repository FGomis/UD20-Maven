package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ejercicio8 extends JFrame{
	private JPanel contentPane;
	private JTextField textCantidad;
	private JTextField textResultado;
	private JButton btnConvertir;
	private JButton btnCambiar;
	private boolean conversion = true;
	private static DecimalFormat df = new DecimalFormat("#.##");
	private JButton btnBorrar;
	
	public void run() {
		try {
			Ejercicio8 frame = new Ejercicio8();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Ejercicio8() {
		setTitle("Ejercicio 8");
		setBounds(100, 100, 470, 133);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(10, 11, 127, 14);
		contentPane.add(lblNewLabel);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(147, 8, 86, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setBounds(334, 8, 86, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Conversión");
		lblNewLabel_1.setBounds(265, 11, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		btnConvertir = new JButton("Euros a ptas");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertir();
			}
		});
		btnConvertir.setBounds(10, 53, 116, 23);
		contentPane.add(btnConvertir);
		
		btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiar();
			}
		});
		btnCambiar.setBounds(167, 53, 116, 23);
		contentPane.add(btnCambiar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		btnBorrar.setBounds(328, 53, 116, 23);
		contentPane.add(btnBorrar);
	}
	
	public void cambiar() {
		if(btnConvertir.getText().equals("Euros a ptas")) {
			btnConvertir.setText("Ptas a euros");
			conversion = false;
		} else {
			btnConvertir.setText("Euros a ptas");
			conversion = true;
		}
	}
	
	public void convertir() {
		double resultado = 0;
		double cantidad = 0;
		try {
			cantidad = Double.parseDouble(textCantidad.getText());
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
			borrar();
		}
		
		if(conversion) {
			resultado = cantidad * 166.386;
		} else {
			resultado = cantidad * 0.0060;
		}
		textResultado.setText(String.valueOf(resultado));
	}
	
	public void borrar() {
		textCantidad.setText("");
		textResultado.setText("");
	}
}