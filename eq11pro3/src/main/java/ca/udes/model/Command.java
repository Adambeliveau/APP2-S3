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
	protected int cptRedo;

	public Command(AnchorPane anchorPane, int cpt, int cptRedo,
			List<Double> x, List<Double> y, List<String> id){
		this.anchorPane = anchorPane;
		this.cpt = cpt;
		this.cptRedo = cptRedo;
		this.x = x;
		this.y = y;
		this.id = id;
	}
	 
	public AnchorPane getAnchorPane() {
		return anchorPane;};
	public List<Double> getX(){return x;}
	public List<Double> getY(){return y;}
	public List<String> getid(){return id;}
}
