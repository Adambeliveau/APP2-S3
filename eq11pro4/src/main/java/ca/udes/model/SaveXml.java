package ca.udes.model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import javafx.scene.layout.AnchorPane;

public class SaveXml implements Save{

	public void SaveTxtOrXml(int cpt, int cptDebut, List<Double> x, List<Double> y, List<String> id,
			AnchorPane anchorPane) {
		for(int i = cptDebut;i < cpt;i++) {
			id.add(anchorPane.getChildren().get(i).getId());
	    	x.add(anchorPane.getChildren().get(i).getLayoutX());
	    	y.add(anchorPane.getChildren().get(i).getLayoutY());
		}
		PrintWriter out = null; 
		try {
			out = new PrintWriter("Save.XML");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		out.println("cpt=" + cpt);
		for(int i = 0;i < cpt; i++) {
	    	out.println("<Shape> x=" + x.get(i) + " y=" + y.get(i) + " id=" + id.get(i) + "</Shape>");
		}
		out.close();
		
	}

}
