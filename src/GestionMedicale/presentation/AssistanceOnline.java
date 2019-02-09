package GestionMedicale.presentation;


import java.util.List;

import GestionMedicale.domaine.Medecin;
import GestionMedicale.domaine.Patient;
import GestionMedicale.service.IService;
import GestionMedicale.service.Service;


public class AssistanceOnline {

	
	public static void main(String[] args) {

		System.out.println("Bienvenue dans votre application de gestion medicale en ligne");
			
			Patient patient = new Patient(" DANY"," ABANDA", 28,"Yde", 656241396);
			Medecin medecin = new Medecin ("jean","pierre","douala","flaubertnana8@gmail.com","dentiste");
	        //APPEL DE LA COUCHE SERVICE
			
			IService service = new Service();
			
			// Enregistrement d'un patient en base de donne
			service.savePatientService(patient);
			
			System.out.println("Patient enregistrer avec succes");
			//Recuperation de la liste des patients en bd
			
			List<Patient> listPatient = service.getAllPatientService();
			
			//AFFICHARGE DE LA LISTE DES Patients
			
			for (Patient patient1 : listPatient) {
				System.out.println(patient1);
			}
			
		}

	}



	
	

	
	

	
	

	
		
	



