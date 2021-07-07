package presentation.startup;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import presentation.doctor.DoctorMenuOutput;

public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) throws SQLException {
		/* Used for Testing. Refer this while making connections in all features. */
//		System.gc();
		DatabaseConnection dbConnObject = new DatabaseConnection();
//		Connection conn = dbConnObject.loadDatabaseConnection();
		String email;
		DatabaseConnection.conn = new DatabaseConnection().loadDatabaseConnection();
		try {
			if(DatabaseConnection.conn.isValid(1000)) {
				LOGGER.log(Level.INFO, "Connection Successful!");
			}
		} catch (SQLException e) {
			LOGGER.log(Level.INFO, e.toString());
		}
		/*
        Take user input for login or signup
         */

        /*
        Load the appropriate user logged in
         */

        /*
        For doctor medicine prescription
         */
        DoctorMenuOutput.prescribeMedication();
	}
}
