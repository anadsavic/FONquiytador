package gui;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;

import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JComponent;
import javax.swing.JOptionPane;


import gui.login.GUILogin;

public class GUIKontroler {
	
	public static GUI glavni;
	public static GUILogin pocetni;
	/*
	public static Socket communicationSocket = null;
	public static BufferedReader serverInput = null;
	public static PrintStream serverOutput = null;
	public static InputStream fileInput = null;
	*/
	public static void main(String[] args) {
		/*try {
			communicationSocket = new Socket("localhost", 9001);
			serverInput = new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
			serverOutput = new PrintStream(communicationSocket.getOutputStream());
			fileInput = communicationSocket.getInputStream();
			String mess = serverInput.readLine();
			if (mess.equals("\\connectionok")) {
				greska("Uspesna konekcija sa serverom!");
			} else {
				greska("Doslo je do greske u konekciji sa serverom!");
			}
		} catch (UnknownHostException e1) {
			greska("UNKNOWN HOST");
			System.exit(0);
		} catch (IOException e1) {
			greska("SERVER IS DOWN");
			System.exit(0);
		}*/

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pocetni = new GUILogin();
					pocetni.setVisible(true);
					pocetni.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(java.awt.event.WindowEvent e) {
							GUIKontroler.ugasiApp();
						}
					});

				} catch (Exception e) {
					greska("Doslo je do greske prilikom otvaranja programa.");
					
				}
			}
		});
		

	}
	public static void proveriPodatke(String username, String pass) {
		prijava(username,pass);
		// TODO Auto-generated method stub
	}
	public static void registracija(String username, String pass) {
		// TODO registracija korisnika u bazu
		
	}
	public static void prijava(String username, String pass) {
		JOptionPane.showMessageDialog(pocetni, "Uspesno ste se prijavili");
		glavni = new GUI();		
		glavni.setVisible(true);		
		
	}
	public static void greska(String message) {
		JOptionPane.showConfirmDialog(glavni, message, "Obavestenje", JOptionPane.OK_CANCEL_OPTION);

	}
	public static void ugasiApp() {
		int odg = JOptionPane.showConfirmDialog(glavni, "Da li zelite da izadjete", "Izlaz", JOptionPane.YES_NO_OPTION);

		if (odg == JOptionPane.YES_OPTION) {
			System.exit(0);//treba obrisati kada se uspostavi konekcija
			/*try {
				serverOutput.println("-1");
				communicationSocket.close();
				System.exit(0);
			} catch (IOException e) {
				greska("Doslo je do greske sa serverom");
				System.exit(0);
			}
*/
		}
	}
}
