package GestionMedicale.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
		// Information d'acc�s � la base de donn�es
		private static String url = "jdbc:mysql://localhost/bdpatient";
		private static String user = "root";
		private static String password = "nadi1889";

		private static Connection connection;

		/**
		 * m�thode qui permet d'�tablir la connexion � la base de donn�es
		 * 
		 * @return connection
		 */
		public static Connection getConnectionDB() {
			if (connection == null) {

				try {
					// r�cup�ration de la connexion
					connection = DriverManager.getConnection(url, user, password);
					System.out.println("Connection Etabli");
				} catch (SQLException e) {
					System.out.println("Erreur execution Mysql!");
				} finally {

				}
			}

			return connection;
		}

		public static Connection getInstance() {
			// TODO Auto-generated method stub
			return null;
		}
	}


