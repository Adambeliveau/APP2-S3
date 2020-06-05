package states;

import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.scene.shape.Shape;

public interface EMRState {
	
	public Shape drawArrow(double startX, double startY, double endX, double endY, Color couleur);
	public Shape drawShape(String shapeString, String titledPane, double xPos, double yPos);
	
}
