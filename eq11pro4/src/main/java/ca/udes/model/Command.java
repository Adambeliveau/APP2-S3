package ca.udes.model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.AnchorPane;

public class Command {
	protected List<Double> x = new ArrayList<Double>();
	protected List<Double> y = new ArrayList<Double>();    
	protected List<String> id = new ArrayList<String>();
	protected AnchorPane anchorPane = new AnchorPane();
	protected int cpt;

	public Command(AnchorPane anchorPane, int cpt,  List<Double> x, List<Double> y, List<String> id){
		this.anchorPane = anchorPane;
		this.cpt = cpt;
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public AnchorPane getAnchorPane() {return anchorPane;}
}
