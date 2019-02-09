package GestionMedicale.service;

import java.util.List;

import GestionMedicale.dao.IPatientDao;
import GestionMedicale.dao.PatientDao;
import GestionMedicale.domaine.Patient;

public class ServicePatient {
	public class Service implements IServicePatient {
		

		private PatientDao patientDao;
		public void ServicePatient() {
			
			this.patientDao = new PatientDao();
		}
		public int saveServicePatient(Patient patient) {
		
			return patient.savePatientDao(patient);
		}

		public List<Patient> getAllPatient() {
			
			return null;
		}
		public void orientéPatient(Object patientDao) {
			// TODO Auto-generated method stub
			
		}

	}

	public static List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return getAllPatient();
	}
}
