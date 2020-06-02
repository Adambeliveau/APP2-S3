package ca.udes.model;

import java.util.List;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Redo extends Command{
	private BorderPane borderPane;
	private ShapeFactory shFact;
	
	Redo(AnchorPane anchorPane, int cpt, int cptRedo, BorderPane borderPane,
			ShapeFactory shFact, List<Double> x, List<Double> y, List<String> id){
		super(anchorPane, cpt, cptRedo, x, y, id);
		this.borderPane = borderPane;
		this.shFact = shFact;
		
		Node newNode = null;
    	Node node = this.borderPane.lookup("#" + id.get(cptRedo));
    	String nodeString = node.toString();
    	System.out.println(nodeString);
    	newNode = this.shFact.getShape(nodeString, x.get(cptRedo), y.get(cptRedo), id.get(cptRedo));
    	anchorPane.getChildren().add(newNode);
    	id.remove(cptRedo);
    	x.remove(cptRedo);
    	y.remove(cptRedo);
    	
		System.out.println("id : "+ id);
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		System.out.println("cpt : "+ cpt);
		System.out.println("cptRedo : "+ cptRedo);
	}
	public AnchorPane getAnchorPane() {return anchorPane;}
}
