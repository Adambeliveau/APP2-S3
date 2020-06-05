package ca.udes.model;

import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class ShapeFactory {
	
	public Shape getShape(String shapeString, String titledPane, double xPos, double yPos) {
		Shape myShape = null;
		String longString = shapeString;
		String shapeType = getTypeShape(shapeString);
		
		//premiere forme qui se fait drag and drop
		if(shapeType.contentEquals("Polygon")) {
			myShape = new Polygone(longString);
         	myShape.setLayoutX(xPos);
         	myShape.setLayoutY(yPos);
		}
		//fleche qui se fait drag and drop
		if(shapeType.contentEquals("ImageView")) {
			myShape = new Arrow (0,xPos,0, yPos, Color.BLACK);
		}
		
		 
		return myShape;
	}
	
	public String getTypeShape(String objToString ) {
		String typeOfShape = "";
		typeOfShape = objToString.substring(0, objToString.indexOf("["));
		System.out.println(typeOfShape);
		
		return typeOfShape;
	}
	
	public String getStrokeShape(String shapeString) {
		String myStroke = "";
		myStroke = shapeString.substring(shapeString.indexOf("stroke="), shapeString.indexOf("]"));
		
		return myStroke;
	}
}
