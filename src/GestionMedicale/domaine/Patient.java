package GestionMedicale.domaine;

/**
 * @author Flaubert
 *
 */
public class Patient {
	
	private String prenom; // propriete prenom
	private String nom; // propriete nom
	private static int age; // propriete age
	private String localisation; // propriete localisation
	private static int telephone; // propriete telephone
	
	public Patient(String prenom, String nom, int age, String localisation, int telephone) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.localisation = localisation;
		this.telephone = telephone;
	}
	public Patient() {
		super();
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public static int getTelephone() {
		return telephone;
	}
	public void setTelephone(int i) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Patient [prenom=" + prenom + ", nom=" + nom + ", age=" + age + ", localisation=" + localisation
				+ ", telephone=" + telephone + "]";
	}
	public int savePatientDao(Patient patient) {
		return 0;
		// TODO Auto-generated method stub
		
	}
	public static void setAge(String next) {
		// TODO Auto-generated method stub
		
	}
	public void setTelephone(String next) {
		// TODO Auto-generated method stub
		
	}
	

}



