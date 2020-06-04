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

public class OpenXml implements Open{

	@Override
	public AnchorPane OpenTxtOrXml(int cpt, List<Double> x, List<Double> y,
			List<String> id, BorderPane borderPane, ShapeFactory shFact,
			AnchorPane anchorPane)  {
		FileChooser fileChooser = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("XML files ", "*.xml");
		fileChooser.getExtensionFilters().add(extFilter);
		File file = fileChooser.showOpenDialog(null);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			cpt += Integer.parseInt(in.readLine().substring(4));
		} catch (IOException e) {
			e.printStackTrace();
		} 
		for(int i = 0; i < cpt ; i++) {
			String temp = null;
			try {
				temp = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			x.add(i, Double.parseDouble(temp.substring(temp.indexOf("=") + 1, temp.indexOf("y") -1)));
			temp = temp.replace(temp.substring(0, temp.indexOf("y") + 1), "");
			y.add(i, Double.parseDouble(temp.substring(1, temp.indexOf("i") - 1)));
			temp = temp.replace(temp.substring(temp.indexOf("=") + 1, temp.indexOf("d") + 1), "");
			id.add(i, temp.substring(2, temp.indexOf("<")));
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
