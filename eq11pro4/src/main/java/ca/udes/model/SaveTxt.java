/*
 * Fichier produit dans le cadre de lapp 2 - s3.
 * Universite de sherbrooke
 * Genie informatique
 * Par Adam Béliveau et Joaquin Esteban Faundez-Flores
 * BELA1003 - FAUJ3006
 */

package ca.udes.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

public class SaveTxt implements Save{

	public void SaveTxtOrXml(int cpt, int cptDebut, List<Double> x, List<Double> y, List<String> id, AnchorPane anchorPane) {
		FileChooser fileChooser = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files ", "*.txt");
		fileChooser.getExtensionFilters().add(extFilter);
		File file = fileChooser.showSaveDialog(null);
		
		for(int i = cptDebut;i < cpt;i++) {
			id.add(anchorPane.getChildren().get(i).getId());
	    	x.add(anchorPane.getChildren().get(i).getLayoutX());
	    	y.add(anchorPane.getChildren().get(i).getLayoutY());
		}
		PrintWriter out = null;
		try {
			out = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	out.println("cpt=" + cpt + '\n' + x.toString()+'\n'+y.toString()+'\n'+id.toString()+'\n');
    	out.close();
	}

}
