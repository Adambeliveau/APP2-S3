package states;

import ca.udes.controlleurs.Controller;
import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.scene.shape.Shape;
import ca.udes.model.Polygone;
import ca.udes.model.ShapeFactory;

public class DrawState implements EMRState {
	private ShapeFactory shFact = new ShapeFactory();
	
	@Override
	public Shape drawArrow(double startX, double startY, double endX, double endY, Color couleur) {
		System.out.println("You can't draw an arrow");
		return null;
	}
	@Override
	public Shape drawShape(String shapeString, String titledPane, double xPos, double yPos) {
		Shape polyg = null;
		polyg = shFact.getShape(shapeString, titledPane, xPos, yPos);
		return polyg;
	}
	
}
