package ca.udes.model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import javafx.scene.layout.AnchorPane;

public class SaveTxt implements Save{

	public void SaveTxtOrXml(int cpt, int cptDebut, List<Double> x, List<Double> y, List<String> id, AnchorPane anchorPane) {
		for(int i = cptDebut;i < cpt;i++) {
			id.add(anchorPane.getChildren().get(i).getId());
	    	x.add(anchorPane.getChildren().get(i).getLayoutX());
	    	y.add(anchorPane.getChildren().get(i).getLayoutY());
		}
		PrintWriter out = null;
		try {
			out = new PrintWriter("Save.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	out.println("cpt=" + cpt + '\n' + x.toString()+'\n'+y.toString()+'\n'+id.toString()+'\n');
    	out.close();
	}

}
