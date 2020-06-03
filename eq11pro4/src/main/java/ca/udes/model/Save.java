package ca.udes.model;

import java.util.List;

import javafx.scene.layout.AnchorPane;

public interface Save {

	public void SaveTxtOrXml(int cpt, int cptDebut, List<Double> x, List<Double> y,
			List<String> id, AnchorPane anchorPane);

}
