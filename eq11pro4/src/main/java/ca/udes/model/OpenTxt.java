/*
 * Fichier produit dans le cadre de lapp 2 - s3.
 * Universite de sherbrooke
 * Genie informatique
 * Par Adam Béliveau et Joaquin Esteban Faundez-Flores
 * BELA1003 - FAUJ3006
 */

package ca.udes.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;

public class OpenTxt implements Open{

	public AnchorPane OpenTxtOrXml(int cpt, List<Double> x, List<Double> y,
			List<String> id, BorderPane borderPane, ShapeFactory shFact,
			AnchorPane anchorPane) {
		FileChooser fileChooser = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files ", "*.txt");
		fileChooser.getExtensionFilters().add(extFilter);
		File file = fileChooser.showOpenDialog(null);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			cpt += Integer.parseInt(in.readLine().substring(4));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		for(int j = 0;j< 3;j++) {
			String temp = null;
			try {
				temp = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			temp = temp.substring(1,temp.length()-1);
			for( int i = 0;i < cpt; i++) {
				if(i < cpt - 1) {
					if(j == 0) {
						x.add(i, Double.parseDouble(temp.substring(0,temp.indexOf(","))));
						temp = temp.replaceFirst(x.get(i).toString() + ",", "");
					}
					if(j == 1) {
						y.add(i, Double.parseDouble(temp.substring(0,temp.indexOf(","))));
						temp = temp.replaceFirst(y.get(i).toString() + ",", "");
					}
					else if(j == 2) {
						id.add(i, temp.substring(0,temp.indexOf(",")));
						temp = temp.replaceFirst(id.get(i).toString() + ",", "");
					}
					
				}
				else if(i < cpt) {
					if(j == 0) {
						x.add(i, Double.parseDouble(temp));
					}
					if(j == 1) {
						y.add(i, Double.parseDouble(temp));
					}
					else if(j == 2) {
						id.add(i, temp);
					}
				}

			}
		}
		for(int i= 0; i < cpt ;i++) {
			Node newNode = null;
			Node node = null;
			if(i > 0) {
				 node = borderPane.lookup("#" + id.get(i).replace(" ", ""));
			}
			else if(i == 0) {
				node = borderPane.lookup("#" + id.get(i));
			}
	    	
	    	String nodeString = node.toString();
	    	newNode = shFact.getShape(nodeString, x.get(i), y.get(i), id.get(i));
	    	anchorPane.getChildren().add(newNode);
		}
		return anchorPane;
	}
}
