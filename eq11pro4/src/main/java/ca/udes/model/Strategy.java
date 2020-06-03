package ca.udes.model;

import java.util.List;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Strategy {

	private Open o;
	private Save s;
	private List<Double> x;
	private List<Double> y;
	private List<String> id;
	private int cpt;
	private int cptDebut;
	private BorderPane borderPane;
	private AnchorPane anchorPane;
	private ShapeFactory shFact;
	
	public Strategy(int cpt, int cptDebut, List<Double> x, List<Double> y, List<String> id, BorderPane borderPane, ShapeFactory shFact, AnchorPane anchorPane){
		this.x = x;
		this.y = y;
		this.id = id;
		this.cpt = cpt;
		this.cptDebut = cptDebut;
		this.borderPane = borderPane;
		this.anchorPane = anchorPane;
		this.shFact = shFact;
	}
	
	public AnchorPane OpenExecute() {
		this.anchorPane = o.OpenTxtOrXml(cpt, x, y, id, borderPane, shFact, anchorPane);
		return this.anchorPane;
	}
	
	public void SaveExecute() {
		s.SaveTxtOrXml(cpt, cptDebut, x, y, id, anchorPane);
	}
	
	public void SetOpenType(Open o) {this.o = o;}
	public void SetSaveType(Save s) {this.s = s;}
	
}
