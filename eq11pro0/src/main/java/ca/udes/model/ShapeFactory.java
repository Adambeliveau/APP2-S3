package ca.udes.model;

import javafx.scene.shape.Shape;

public class ShapeFactory {
	
	public Shape getShape(String shapeString, double xPos, double yPos, String id) {
		Shape myShape = null;
		String testi = shapeString;
		String shapeType = getTypeShape(shapeString);
		
		if(shapeType.contentEquals("Polygon")) {
			myShape = new Polygone(testi);
			myShape.setLayoutX(xPos);
         	myShape.setLayoutY(yPos);
         	myShape.setId(id);
		}
		if(shapeType.contentEquals("ImageView")) {
			myShape = new Arrow (xPos, yPos);
			myShape.setId(id);
			myShape.setLayoutX(xPos);
			myShape.setLayoutY(yPos);
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
