package GestionMedicale.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class AssistanceMedicale {

	private JFrame frmOnline;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssistanceMedicale window = new AssistanceMedicale();
					window.frmOnline.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AssistanceMedicale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOnline = new JFrame();
		frmOnline.setBackground(Color.YELLOW);
		frmOnline.setForeground(Color.YELLOW);
		frmOnline.getContentPane().setForeground(Color.ORANGE);
		frmOnline.getContentPane().setFont(new Font("Arial Narrow", Font.PLAIN, 18));
		frmOnline.setTitle("Welcome");
		frmOnline.setBounds(100, 100, 450, 300);
		frmOnline.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmOnline.getContentPane().setLayout(null);
		
		JLabel lblBienvenueAuService = new JLabel("Bienvenue au service d'Assistance Medicale en ligne");
		lblBienvenueAuService.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
		lblBienvenueAuService.setBounds(70, 99, 354, 14);
		frmOnline.getContentPane().add(lblBienvenueAuService);
		
		JMenuBar menuBar = new JMenuBar();
		frmOnline.setJMenuBar(menuBar);
		
		JMenu mnPatient = new JMenu("Patient");
		menuBar.add(mnPatient);
		
		JMenuItem mntmEnregistrerpatient = new JMenuItem("EnregistrerPatient");
		mntmEnregistrerpatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EregistrerPatient frame = new EregistrerPatient();
				frame.setVisible(true);
			}
		});
		mnPatient.add(mntmEnregistrerpatient);
		
		JMenuItem mntmListerpatient = new JMenuItem("ListerPatient");
		mnPatient.add(mntmListerpatient);
		
		JMenuItem mntmModifier_1 = new JMenuItem("Modifier");
		mnPatient.add(mntmModifier_1);
		
		JMenu mnMedecin = new JMenu("Medecin");
		menuBar.add(mnMedecin);
		
		JMenuItem mntmEnregistrermedecin = new JMenuItem("EnregistrerMedecin");
		mntmEnregistrermedecin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EnregistrerMedecin frame = new EnregistrerMedecin();
				frame.setVisible(true);
				
			}
		});
		mnMedecin.add(mntmEnregistrermedecin);
		
		JMenuItem mntmListermedecin = new JMenuItem("ListerMedecin");
		mnMedecin.add(mntmListermedecin);
		
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnMedecin.add(mntmModifier);
		
		JMenu mnRecherche = new JMenu("Recherche");
		menuBar.add(mnRecherche);
		
		JMenuItem mntmPatient = new JMenuItem("Patient");
		mnRecherche.add(mntmPatient);
		
		JMenuItem mntmMedecin = new JMenuItem("Medecin");
		mnRecherche.add(mntmMedecin);
		
		JMenu mnNewMenu = new JMenu("Parametres");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNotifications = new JMenuItem("Notifications");
		mnNewMenu.add(mntmNotifications);
		
		JMenuItem mntmAide = new JMenuItem("Aide");
		mnNewMenu.add(mntmAide);
		
		JMenu mnNotifications = new JMenu("Message");
		menuBar.add(mnNotifications);
	}
}
