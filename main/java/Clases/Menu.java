package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Menu extends JFrame{
	private JPanel contentPane;
	
	public void run() {
		try {
			Menu frame = new Menu();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Menu() {
		setTitle("Ejercicios Maven");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(true);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 814, 249);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_8 = new JButton("Ej. 1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	Ejercicio1 ej1 = new Ejercicio1();
		    	ej1.run();
			}
		});
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("Ej. 2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio2 ej2 = new Ejercicio2();
		    	ej2.run();
			}
		});
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("Ej. 3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio3 ej3 = new Ejercicio3();
		    	ej3.run();
			}
		});
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("Ej. 4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio4 ej4 = new Ejercicio4();
		    	ej4.run();
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("Ej. 5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio5 ej5 = new Ejercicio5();
		    	ej5.run();
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Ej. 6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio6 ej6 = new Ejercicio6();
		    	ej6.run();
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Ej. 7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio7 ej7 = new Ejercicio7();
		    	ej7.run();
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Ej. 8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio8 ej8 = new Ejercicio8();
		    	ej8.run();
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Ej. 9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio9 ej9 = new Ejercicio9();
		    	ej9.run();
			}
		});
		panel.add(btnNewButton);
	}
}
