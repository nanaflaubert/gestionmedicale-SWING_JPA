package GestionMedicale.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import GestionMedicale.domaine.Patient;
import GestionMedicale.service.Service;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EregistrerPatient extends JFrame {

	private JPanel contentPane;
	private JTextField PrenomTextField;
	private JTextField NomTextField;
	private JTextField AgeTextField;
	private JTextField LocalisationTextField;
	private JTextField TelephoneTextField;
	private JButton btnOk;


	/**
	 * Create the frame.
	 */
	public EregistrerPatient() {
		setTitle("EnregistrerPatient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Prenom :");
		lblNom.setBounds(10, 11, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblNom_1 = new JLabel("Nom :");
		lblNom_1.setBounds(10, 44, 46, 14);
		contentPane.add(lblNom_1);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setBounds(10, 81, 46, 14);
		contentPane.add(lblAge);
		
		JLabel lblNewLabel = new JLabel("Localisation :");
		lblNewLabel.setBounds(10, 125, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTelephone = new JLabel("Telephone :");
		lblTelephone.setBounds(10, 168, 71, 14);
		contentPane.add(lblTelephone);
		
		PrenomTextField = new JTextField();
		PrenomTextField.setBounds(101, 8, 323, 20);
		contentPane.add(PrenomTextField);
		PrenomTextField.setColumns(10);
		
		NomTextField = new JTextField();
		NomTextField.setBounds(101, 41, 323, 20);
		contentPane.add(NomTextField);
		NomTextField.setColumns(10);
		
		AgeTextField = new JTextField();
		AgeTextField.setBounds(101, 78, 323, 20);
		contentPane.add(AgeTextField);
		AgeTextField.setColumns(10);
		
		LocalisationTextField = new JTextField();
		LocalisationTextField.setBounds(101, 122, 323, 20);
		contentPane.add(LocalisationTextField);
		LocalisationTextField.setColumns(10);
		
		TelephoneTextField = new JTextField();
		TelephoneTextField.setBounds(101, 165, 323, 20);
		contentPane.add(TelephoneTextField);
		TelephoneTextField.setColumns(10);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                 // Recuperation des valeurs sqiqies dans le formulaires 
				
				//declarations des variables
				
				String prenom, nom; int age;
				String localisation; int telephone;
				//affichage des valeurs saisies dans le formulaires
				prenom = PrenomTextField.getText();
				nom = NomTextField.getText();
				age = Integer.parseInt(AgeTextField.getText());
				localisation = LocalisationTextField.getText();
				telephone = Integer.parseInt(TelephoneTextField.getText());
				
				//creation d'un objet patient
				Patient patient = new Patient();
				patient.setPrenom(prenom);
				patient.setNom(nom);
				patient.setAge(age);
				patient.setLocalisation(localisation);
				patient.setTelephone(telephone);
				
				//appel de la methode savePatientService de la couche Service
				Service service = new Service();
				int etat;
				etat = service.savePatientService(patient);
				if(etat == 1) {
				
					//Vidage des zones textes
					PrenomTextField.setText("");
					NomTextField.setText("");
					AgeTextField.setText("");
					LocalisationTextField.setText("");
					TelephoneTextField.setText("");
					
					JOptionPane.showMessageDialog(null, "Le patient " + patient.getNom() + patient.getPrenom() +
							      " a ete enregistre avec SUCCES dans la base de donnees");
						
				}else {
					JOptionPane.showMessageDialog(null, "Une ERREUR C'est produit" + "pendant l'enregistrement" );
							
				}	
			}
		});
		btnOk.setBounds(335, 228, 89, 23);
		contentPane.add(btnOk);
		
}
}

