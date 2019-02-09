package GestionMedicale.dao;

import java.util.List;

import GestionMedicale.domaine.Patient;

public interface IPatientDao {

	int savePatient(Patient patient);
	 public List<Patient> getAllPatientDao();

}
