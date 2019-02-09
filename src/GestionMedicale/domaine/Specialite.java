package GestionMedicale.domaine;

public class Specialite {
	private String cardiologie;
	private String optamologie;
	private String dentaire;
	private String chirugie;
	private String generalite;
	private String rhumathologie;
	
	public Specialite(String cardiologie, String optamologie, String dentaire, String chirugie, String generalite,
			String rhumathologie) {
		super();
		this.cardiologie = cardiologie;
		this.optamologie = optamologie;
		this.dentaire = dentaire;
		this.chirugie = chirugie;
		this.generalite = generalite;
		this.rhumathologie = rhumathologie;
	}

	public Specialite() {
		// TODO Auto-generated constructor stub
	}

	public Specialite(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getCardiologie() {
		return cardiologie;
	}

	public void setCardiologie(String cardiologie) {
		this.cardiologie = cardiologie;
	}

	public String getOptamologie() {
		return optamologie;
	}

	public void setOptamologie(String optamologie) {
		this.optamologie = optamologie;
	}

	public String getDentaire() {
		return dentaire;
	}

	public void setDentaire(String dentaire) {
		this.dentaire = dentaire;
	}

	public String getChirugie() {
		return chirugie;
	}

	public void setChirugie(String chirugie) {
		this.chirugie = chirugie;
	}

	public String getGeneralite() {
		return generalite;
	}

	public void setGeneralite(String generalite) {
		this.generalite = generalite;
	}

	public String getRhumathologie() {
		return rhumathologie;
	}

	public void setRhumathologie(String rhumathologie) {
		this.rhumathologie = rhumathologie;
	}
				}