package ca.udes.model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import javafx.scene.layout.AnchorPane;

public class Save extends Command{
	
	

	Save(AnchorPane anchorPane, int cpt, List<Double> x, List<Double> y, List<String> id) throws FileNotFoundException{
		super(anchorPane, cpt, x, y, id);
		
		for(int i = 0;i < cpt;i++) {
			id.add(anchorPane.getChildren().get(i).getId());
	    	x.add(anchorPane.getChildren().get(i).getLayoutX());
	    	y.add(anchorPane.getChildren().get(i).getLayoutY());
		}
		PrintWriter out = new PrintWriter("Save.txt");
    	out.println("cpt=" + cpt + '\n' + x.toString()+'\n'+y.toString()+'\n'+id.toString()+'\n');
    	out.close();
		
		System.out.println("id : "+ id);
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		System.out.println("cpt : "+ cpt);
		
	}	
}
