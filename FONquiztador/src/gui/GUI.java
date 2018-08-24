package gui;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

public class GUI extends JFrame{

	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public GUI() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				GUIKontroler.ugasiApp();
			}
		});
	}


}
