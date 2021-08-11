package Clases;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Ejercicio5 extends JFrame implements MouseListener{
	private JPanel contentPane;
	private JTextArea textArea;
	private JScrollPane scroll;
	
	public void run() {
		try {
			Ejercicio5 frame = new Ejercicio5();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Ejercicio5() {
		setTitle("Ejercicio 5");
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(true);
		contentPane.setLayout(null);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnLimpiar.setBounds(190, 11, 89, 23);
		contentPane.add(btnLimpiar);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 55, 464, 245);
		contentPane.add(textArea);
		textArea.addMouseListener(this);
		textArea.setLineWrap(true);
	    textArea.setEditable(false);
	    textArea.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		textArea.append("Ratón clickado.\n");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		textArea.append("Ratón pulsado.\n");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		textArea.append("Ratón soltado.\n");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		textArea.append("Ratón ha entrado al área.\n");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		textArea.append("Ratón ha salido del área.\n");
	}
}
