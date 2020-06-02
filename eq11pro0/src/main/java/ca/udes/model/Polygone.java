package ca.udes.model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Polygone extends ShapeParent{

	private List<String> Attributes= new ArrayList<String>();
	private List<Double> Points = new ArrayList<Double>();
	private Polygon p;
	
	Polygone(String toString) {
		super(toString);
		splitToString();
		p = new Polygon(
				Points.get(0),
				Points.get(1),
				Points.get(2),
				Points.get(3),
				Points.get(4),
				Points.get(5),
				Points.get(6),
				Points.get(7)
				);
		System.out.println(Attributes.get(1).substring(Attributes.get(1).indexOf("=") + 1));
		p.setFill(Color.web(Attributes.get(1).substring(Attributes.get(1).indexOf("=") + 1)));
		p.setStroke(Color.web(Attributes.get(2).substring(Attributes.get(2).indexOf("=") + 1)));
	}
	
	public void splitToString() {
		int cpt = 0;
		for(int j = 0;j < 4;j++) {
			if(cpt == 1)
			{
				String temp = this.toString.substring(this.toString.indexOf("[") + 1, this.toString.indexOf("]"));
				String toDelete = temp;
				for( int i = 0;i < 8; i++) {
					if(i != 7) {
						Points.add(i, Double.parseDouble(temp.substring(0,temp.indexOf(","))));
						temp = temp.replaceFirst(Points.get(i).toString() + ",", "");
					}
					else if(i == 7) {
						Points.add(i, Double.parseDouble(temp));
						temp = temp.replaceFirst(Points.get(i).toString(), "");
					}

				}
				this.toString = this.toString.replace(" points=[" + toDelete + "],", "");
			}
			if(j != 3) {
				Attributes.add(this.toString.substring(0, this.getToString().indexOf(",") ));
				this.toString = this.toString.replace(Attributes.get(cpt) + ",", "");
			}
			else if(j == 3) {
				Attributes.add(this.toString.substring(0, this.getToString().indexOf("]") ));
			}
			
			
			cpt++;
		}
	}
	
	public void x(Double x) {p.setLayoutX(x);}
	public void y(Double y) {p.setLayoutY(y);}
}
