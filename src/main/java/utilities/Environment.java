package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {

	static {
		Properties properties = null;
		String environment = ConfigurationReader.getProperty("environment");
		try {
			FileInputStream input = new FileInputStream(environment + ".properties");
			properties = new Properties();
			properties.load(input);
			input.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		URL = properties.getProperty("url");
//		DB_HOST = properties.getProperty("db_host");
//		DB_USERNAME = properties.getProperty("db_username");


	}


}