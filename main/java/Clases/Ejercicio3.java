package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame{
	private JPanel contentPane;
	private int boton1 = 0;
	private int boton2 = 0;
	
	public void run() {
		try {
			Ejercicio3 frame = new Ejercicio3();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Ejercicio3() {
		setTitle("Ejercicio 3");
		setBounds(100, 100, 380, 163);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(true);
		contentPane.setLayout(null);
		
		JLabel btnpulsado = new JLabel("Boton 1: veces Boton2: veces ");
		btnpulsado.setHorizontalAlignment(SwingConstants.LEFT);
		btnpulsado.setBounds(94, 11, 191, 14);
		contentPane.add(btnpulsado);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton1++;
				btnpulsado.setText("Boton 1: " + boton1 + " veces Boton 2: " + boton2 + " veces");
			}
		});
		btn1.setBounds(92, 90, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton2++;
				btnpulsado.setText("Boton 1: " + boton1 + " veces Boton 2: " + boton2 + " veces");
			}
		});
		btn2.setBounds(219, 90, 89, 23);
		contentPane.add(btn2);
	}
}
