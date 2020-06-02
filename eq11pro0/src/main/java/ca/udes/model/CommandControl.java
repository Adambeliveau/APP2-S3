package ca.udes.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class CommandControl {

	private List<String> CommandId = new ArrayList<String>();
	private Command c = null;
	
	public Command getCommand(String CommandId, AnchorPane anchorPane, int cpt,
			BorderPane borderPane, ShapeFactory shFact, List<Double> x,
			List<Double> y, List<String> id) throws IOException{
		this.CommandId.add("Save");
		this.CommandId.add("Open");
		
		if(CommandId.equals(this.CommandId.get(0))) {
			 c = new Save(anchorPane, cpt, x, y, id);
		}
		else if(CommandId.equals(this.CommandId.get(1))) {
			 c = new Open(anchorPane, cpt, borderPane, shFact, x, y, id);
		}
		return c;
	}
	
	public AnchorPane getAnchorPane() {return c.getAnchorPane();}
}
