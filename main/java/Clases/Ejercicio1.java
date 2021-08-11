package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ejercicio1 extends JFrame{
	private JPanel contentPane;
	
	public void run() {
		try {
			Ejercicio1 frame = new Ejercicio1();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Ejercicio1() {
		setTitle("Ejercicio 1");
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(true);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ejercicio 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 125, 154, 14);
		contentPane.add(lblNewLabel);
	}
}
