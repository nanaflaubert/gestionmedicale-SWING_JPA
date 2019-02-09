package GestionMedicale.service;

import java.util.List;


import GestionMedicale.domaine.Patient;

/**
 * @author Flaubert
 *
 */
public interface IService {

		public int savePatientService(Patient patient);
	    public List<Patient> getAllPatientService();
	}

	