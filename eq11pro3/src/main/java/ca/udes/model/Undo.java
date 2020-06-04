/*
 * Fichier produit dans le cadre de lapp 2 - s3.
 * Universite de sherbrooke
 * Genie informatique
 * Par Adam Béliveau et Joaquin Esteban Faundez-Flores
 * BELA1003 - FAUJ3006
 */

package ca.udes.model;

import java.util.List;

import javafx.scene.layout.AnchorPane;

public class Undo extends Command{
	
	Undo(AnchorPane anchorPane, int cpt, int cptRedo,
			List<Double> x, List<Double> y, List<String> id){
		super(anchorPane, cpt, cptRedo, x, y, id);
		
		id.add(anchorPane.getChildren().get(cpt).getId());
    	x.add(anchorPane.getChildren().get(cpt).getLayoutX());
    	y.add(anchorPane.getChildren().get(cpt).getLayoutY());
		anchorPane.getChildren().remove(cpt);
		
		System.out.println("id : "+ id);
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		System.out.println("cpt : "+ cpt);
		System.out.println("cptRedo : "+ cptRedo);
		
	}
	
	public AnchorPane getAnchorPane() {return anchorPane;}
	
	
}
