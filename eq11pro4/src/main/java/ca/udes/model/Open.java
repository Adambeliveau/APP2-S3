package ca.udes.model;

import java.util.List;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public interface Open {

	public AnchorPane OpenTxtOrXml(int cpt, List<Double> x, List<Double> y,
			List<String> id, BorderPane borderPane, ShapeFactory shFact,
			AnchorPane anchorPane);
}
