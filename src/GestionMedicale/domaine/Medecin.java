package GestionMedicale.domaine;

/**
 * @author Flaubert
 *
 */
public class Medecin {
	
	private static String prenom; // propriete prenom
	private static String nom; // propriete nom
	private static String localisation; // propriete localisation
	private static String email; // propriete email
	private static String specialite; // propriete specialite
	private int idMedecin;
	public Medecin(String prenom, String nom, String localisation, String email, String specialite) {
		super();
		Medecin.prenom = prenom;
		Medecin.nom = nom;
		Medecin.localisation = localisation;
		Medecin.email = email;
		Medecin.specialite = specialite;
	}

	public Medecin(String string, String string2, String string3, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public Medecin(String string) {
		// TODO Auto-generated constructor stub
	}

	

	public Medecin() {
		// TODO Auto-generated constructor stub
	}

	public static String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		Medecin.prenom = prenom;
	}

	public static String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Medecin.nom = nom;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		Medecin.localisation = localisation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Medecin.email = email;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		Medecin.specialite = specialite;
	}

	public  String toString() {
		return "Medecin [prenom=" + prenom + ", nom=" + nom + ", localisation=" + localisation
				+ ", email=" + email + ", specialite=" + specialite + "]";
	}

	public static void occupeEtIndisponible(Medecin medecim) {
		// TODO Auto-generated method stub
		
	}


}
