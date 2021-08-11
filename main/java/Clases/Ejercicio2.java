package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame{
	private JPanel contentPane;
	
	public void run() {
		try {
			Ejercicio3 frame = new Ejercicio3();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Ejercicio2() {
		setTitle("Ejercicio 2");
		setBounds(100, 100, 480, 110);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(true);
		contentPane.setLayout(null);
		
		JLabel btnpulsado = new JLabel("Boton pulsado: ");
		btnpulsado.setHorizontalAlignment(SwingConstants.LEFT);
		btnpulsado.setBounds(10, 29, 191, 14);
		contentPane.add(btnpulsado);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnpulsado.setText("Boton pulsado: " + btn1.getText());
			}
		});
		btn1.setBounds(211, 25, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnpulsado.setText("Boton pulsado: " + btn2.getText());
			}
		});
		btn2.setBounds(341, 25, 89, 23);
		contentPane.add(btn2);
	}
}
