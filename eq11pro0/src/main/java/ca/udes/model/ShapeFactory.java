package ca.udes.model;

public class ShapeFactory {
	
	
	public ShapeParent getShape(String shape,String toString) {
		ShapeParent s = null;
		if(shape.equals("Polygon"))
		{
			s = new Polygone(toString);
		}
		
		return s;
		
	}

	
}
