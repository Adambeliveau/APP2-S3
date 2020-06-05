package states;
import ca.udes.controlleurs.Controller;
import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.scene.shape.Shape;
import ca.udes.model.Arrow;
import ca.udes.model.ShapeFactory;

public class ArrowState implements EMRState{
	private ShapeFactory shFact = new ShapeFactory();
	
	@Override
	public Shape drawArrow(double startX, double startY, double endX, double endY, Color couleur) {
		Shape arrow = new Arrow (startX, startY, endX, endY, couleur);
		return arrow;
		
	}
	@Override
	public Shape drawShape(String shapeString, String titledPane, double xPos, double yPos) {
		System.out.println("You can't draw a shape");
		return null;
	}
}
