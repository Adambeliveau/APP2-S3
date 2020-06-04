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

public interface Save {

	public void SaveTxtOrXml(int cpt, int cptDebut, List<Double> x, List<Double> y,
			List<String> id, AnchorPane anchorPane);

}
