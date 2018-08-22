package gui.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import gui.GUI;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPasswordField;

public class GUILogin {

	private JFrame frmLogin;
	private JLabel lblUsername;
	private JTextField usernametxt;
	private JLabel lblPassword;
	private JButton OK;
	private JButton btnCancel;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin window = new GUILogin();
					window.frmLogin.setVisible(true);
					window.frmLogin.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUILogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(SystemColor.control);
		frmLogin.getContentPane().setForeground(Color.WHITE);
		frmLogin.setTitle("Login");
		
		frmLogin.setResizable(false);
		frmLogin.setBounds(100, 100, 319, 223);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.getContentPane().add(getLblUsername());
		frmLogin.getContentPane().add(getUsernametxt());
		frmLogin.getContentPane().add(getLblPassword());
		frmLogin.getContentPane().add(getOK());
		frmLogin.getContentPane().add(getBtnCancel());
		frmLogin.getContentPane().add(getPasswordField());
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			lblUsername.setBounds(32, 34, 89, 23);
		}
		return lblUsername;
	}
	private JTextField getUsernametxt() {
		if (usernametxt == null) {
			usernametxt = new JTextField();
			usernametxt.setBounds(145, 34, 113, 23);
			usernametxt.setColumns(10);
		}
		return usernametxt;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			lblPassword.setBounds(32, 77, 89, 23);
		}
		return lblPassword;
	}
	private JButton getOK() {
		if (OK == null) {
			OK = new JButton("Enter");
			OK.setForeground(SystemColor.desktop);
			OK.setFont(new Font("Segoe UI Emoji", Font.BOLD, 14));
			OK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					proveriPodatke(usernametxt.getText(),passwordField.getPassword().toString());
				}

				
			});
			OK.setBounds(32, 147, 89, 23);
		}
		return OK;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnCancel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 14));
			btnCancel.setBounds(169, 147, 89, 23);
		}
		return btnCancel;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(145, 79, 113, 23);
		}
		return passwordField;
	}
	private void proveriPodatke(String username, String pass) {
		
		// TODO Auto-generated method stub
	}
	private void registracija(String username, String pass) {
		// TODO registracija korisnika u bazu
		
	}
	private void prijava(String username, String pass) {
		JOptionPane.showMessageDialog(frmLogin, "Uspesno ste se prijavili");
		GUI glavni = new GUI();
		glavni.pokreni();
		frmLogin.setVisible(false);
		
	}
}
