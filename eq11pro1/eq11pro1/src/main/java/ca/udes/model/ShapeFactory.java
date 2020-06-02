package ca.udes.model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class ShapeFactory {
	
	public Shape getShape(String shapeString, String titledPane, double xPos, double yPos) {
		Shape myShape = null;
		String testi = shapeString;
		String shapeType = getTypeShape(shapeString);
		
		if(shapeType.contentEquals("Polygon")) {
			myShape = new Polygone(testi);
			//myShape.setFill(Color.web("0x87ceebff"));	//a changer pour un substring dans testi
         //	myShape.setStroke(Color.web("0x0000ffff"));// a changer pour un substring dans testi
         	myShape.setLayoutX(xPos);
         	myShape.setLayoutY(yPos);
		}
		if(shapeType.contentEquals("ImageView")) {
			myShape = new Arrow (xPos, yPos);
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
		//caliss de marde ce que jai ecrit la
		myStroke = shapeString.substring(shapeString.indexOf("stroke="), shapeString.indexOf("]"));
		System.out.println("yoyoyoy"+myStroke);
		
		return myStroke;
	}
}
