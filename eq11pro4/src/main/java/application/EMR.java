/*
 * Fichier produit dans le cadre de lapp 2 - s3.
 * Universite de sherbrooke
 * Genie informatique
 * Par Adam Béliveau et Joaquin Esteban Faundez-Flores
 * BELA1003 - FAUJ3006
 */

package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EMR extends Application {

	private Stage primaryStage;
    private BorderPane rootLayout;
    
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("EMR");
        this.primaryStage.show();
        initRootLayout();

	}
	
	 /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(EMR.class.getResource("/UI.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

	public static void main(String[] args) {
		launch(args);
	}
}
