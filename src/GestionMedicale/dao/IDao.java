package GestionMedicale.dao;

import java.util.List;

import GestionMedicale.domaine.Patient;

public interface IDao {

	public int savePatientDao(Patient patient);
    public List<Patient> getAllPatientDao();
}
