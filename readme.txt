	************************************
*****  	Description de l'application:   	*****
	************************************

GestionMedicale est une application qui permet de selon l'option choisit:
	-Enregistrer: ceci permet � un patient de s'enregistrer
	
	


	************************************
*****  	     Pr�-requis avant execution		*****
	************************************
Installer un jdk ou au moins un jre sur son ordinateur.
Pour l'installation merci de suivre les �tapes suivantes:

	-Rendez-vous sur la partie Java du site d�Oracle : http://www.oracle.com/technetwork/java
	-Dans la zone de droite �software downloads�, cliquez sur le lien �Java SE� (pour Java Standard Edition)
	-Cliquez sur l�ic�ne �Java� pour t�l�charger le JDK
	-Accepter la licence
	-De pr�f�rence choisir la version la plus r�cente (derni�re sur la liste)
		-si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
		-si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe'
		-la version 32 bit fonctionne sur un Syst�me Windows 32 bit ou 64 bit.
	-Cliquez sur le bouton �Enregistrer le fichier�. Le t�l�chargement commence
	-Double cliquez sur le fichier t�l�charg�. L�assistant d�installation du JDK se lance
	-Cliquez sur le bouton �Next� des fen�tres qui vont s'afficher
	-Au moment d�installer un environnement d�ex�cution ind�pendant du JDK, l�assistant vous consulte. Acceptez les options par d�faut et cliquez sur Next
	-Ainsi m�me si vous supprimez par la suite le r�pertoire d�installation du JDK (qui contient aussi une JRE), vous pourrez tout de m�me ex�cuter des programmes Java sur votre ordinateur
	-Vous arrivez � l��cran de fin d�installation, qui vous pr�cise que l�installation s�est bien d�roul�e 
	-Cliquez sur Close: L�installation du JDK est termin�e. 

T�l�charger et installer une base de donn�es Mysql
D�marre les services de mysql et lancer phpMyAdmin.
Pour lancer phpMyAdmin vous pouvez aussi saisir directe sur votre navigateur l'url suivant: http://localhost/phpmyadmin/
	Dans Mysql, cr�er la base donn�es "gestionmedicale" et importer la table "patient" en suivant les inctructions suivantes:
	-sur l'onglet "Base de Donn�es" dans le champ "Cr�er une base de donn�es" saisir "formation" 
	 puis cliquer sur cr�er (Bravo! vous avez cr�er la base donn�es "gestionmedicale")
	-sur l'onglet "importer", cliquer "choisir un fichier" puis placer vous dans le dossier 'Livraison3'
	 et choisir le fichier 'patient.sql' puis cliquer sur le bouton "Ex�cuter" en bas de page.

Dans le dossier 'Livraison3' copier le jar "mysql-connector-java-5.1.28-bin" 
puis collez le dans le dossier lib/ext pr�sent dans le dossier d'installation du JRE.

	************************************
*****  		Version du jdk utilis�		  	*****
	************************************
java version "1.8.0_73"
Java(TM) SE Runtime Environment (build 1.8.0_73-b02)
Java HotSpot(TM) 64-Bit Server VM (build 25.73-b02, mixed mode)



	************************************
*****  	Documentation:			  	*****
	************************************

Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier 'Livraison3\doc'.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

1) 	A l'aide de votre interpretteur de commande (cmd.exe),
	placer vous dans le dossier o� vous avez t�l�charg�
	le fichier compress� "GestionMedicale.jar"
	('cd [chemin]/[dossier cible]').

2)	Assurer vous que les services Mysql et Apache de phpMyAdmin sont d�marr�s.

3)	Entrer la commande 'java -jar GestionMedicale.jar'.