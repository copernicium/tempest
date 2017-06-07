package main.java.control;

import main.java.desktopUI.DesktopApplication;
import javafx.application.Application;

/**
 * Runs the Desktop Application
 *
 * @author Logan Traffas
 */
public class Main {
	/**
	 * Runs the Desktop UI with arguments
	 * @param args the arguments used to launch the Application
	 */
	private void runApp(String[] args){
		Application.launch(DesktopApplication.class,args);
	}

	/**
	 * Launches Tempest
	 * @param args the arguments to launch Tempest with
	 */
	public static void main(String[] args){
		Main main = new Main();
		main.runApp(args);
	}
}
