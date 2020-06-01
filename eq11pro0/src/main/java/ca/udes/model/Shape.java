package ca.udes.model;

import javafx.scene.shape.*;

public class Shape {

	protected String attributes;
	protected String attributesParsed[];
	
	Shape(String Type){
		Shape s;
		if(Type.substring(0, Type.indexOf("[")).equals("Polygon")) {
			s = new Parallelogramme(Type);
		}
	}
}
