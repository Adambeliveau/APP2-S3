package ca.udes.model;

import javafx.scene.shape.Shape;

public class ShapeParent extends Shape{

	protected String toString;
	
	ShapeParent(String toString){
		this.toString = toString;
	}
	
	public void setToString(String s) {this.toString = s;}
	public String getToString() {return this.toString;}

	public void x(double x) {
		
	}

	public void y(double y) {
		
	}
	
}
