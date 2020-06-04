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
import javafx.scene.layout.BorderPane;

public interface Open {

	public AnchorPane OpenTxtOrXml(int cpt, List<Double> x, List<Double> y,
			List<String> id, BorderPane borderPane, ShapeFactory shFact,
			AnchorPane anchorPane);
}
