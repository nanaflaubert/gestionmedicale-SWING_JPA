package GestionMedicale.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import GestionMedicale.domaine.Patient;

public class Dao implements IDao{
	
	public Dao ()  {
	
	}

  public Dao(String prenom, String nom, int age, String localisation, int telephone) {
	// TODO Auto-generated constructor stub
}

  public int savePatientDao(Patient patient) {
	
	try {

		// Etape 1 : récupération de la connexion
		Connection cn = ConnectionMYSQL.getInstance();

		// Etape 2 : Création d'un objet  statement et preparation de la requette
		

		String sql = "insert into `patient`(`prenom`,`nom`,`age`,`localisation`,`telephone`)" 
				+"values (?,?,?,?,?)";
		
		PreparedStatement ps=  cn.prepareStatement(sql);
		ps.setString(1, patient.getPrenom());
		ps.setString(2, patient.getNom());
		ps.setInt(3, Patient.getAge());
		ps.setString(4, patient.getLocalisation());
		ps.setInt(5, patient.getTelephone());
		
	
		// Etape 3 : exécution requête
		ps.executeUpdate();
		
		
		
		// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
	} catch (SQLException e) {
		e.printStackTrace();
		return 0;
	} 
	

	return 1;
}


public List<Patient> getAllPatientDao() {
	
    //création d'une collection d'eleves
	List<Patient> maListPatient= new ArrayList<Patient>();

	
	try {

		// Etape 1 : récupération de la connexion
		Connection cn = ConnectionMYSQL.getInstance();

		// Etape 2 : préparation requête
		Statement st = cn.createStatement();

		String sql = "SELECT * FROM patient ";

		// Etape 3 : exécution requête
		ResultSet rs = st.executeQuery(sql);

		// Etape 4 :parcours Resultset (optionnel)
		while (rs.next()) {
			//RECUPERATION DES VALEURS D'UNE LIGNE DE LA TABLE POUR INITIALISER DANS UN CONTENEUR Patient
			Patient patient =  new Patient();
			patient.setPrenom(rs.getString("prenom"));
			patient.setNom(rs.getString("nom"));
			patient.setAge(rs.getInt("age"));
			patient.setLocalisation(rs.getString("localisation"));
			patient.setTelephone(rs.getInt("telephone"));
		// Ajout d'un patient dans la list malistPatient
			maListPatient.add(patient); // cette instruction permet d'inserrerl'objet patient dans ma liste patient
			
		}
		
		// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
	} catch (SQLException e) {
		e.printStackTrace();
		
	}
	
	return maListPatient;

     }
}









	
	
	
