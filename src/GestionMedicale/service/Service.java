package GestionMedicale.service;

import java.util.List;


import GestionMedicale.dao.IDao;
import GestionMedicale.dao.Dao;
import GestionMedicale.domaine.Medecin;
import GestionMedicale.domaine.Patient;

public class Service implements IService {

		private IDao dao;

		public Service() {
			
			this.dao = new Dao();
		}
		@Override
		public int savePatientService(Patient patient) {
		
			return dao.savePatientDao(patient);
		}

		public List<Patient> getAllPatientService() {
			
			return dao.getAllPatientDao();
		}
	}

