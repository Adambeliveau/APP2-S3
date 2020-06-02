package ca.udes.model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class CommandControl {

	private List<String> CommandId = new ArrayList<String>();
	private Command c = null;
	
	public Command getCommand(String CommandId, AnchorPane anchorPane, int cpt, int cptRedo,
			BorderPane borderPane, ShapeFactory shFact, List<Double> x,
			List<Double> y, List<String> id){
		this.CommandId.add("Undo");
		this.CommandId.add("Redo");
		
		if(CommandId.equals(this.CommandId.get(0))) {
			 c = new Undo(anchorPane, cpt, cptRedo, x, y, id);
		}
		else if(CommandId.equals(this.CommandId.get(1))) {
			 c = new Redo(anchorPane, cpt, cptRedo, borderPane, shFact, x, y, id);
		}
		return c;
	}
	public AnchorPane getAnchorPane() { return c.getAnchorPane();}
}
