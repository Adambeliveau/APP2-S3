package ca.udes.model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Parallelogramme extends Shape{
	
	private int[] Points;
	Color red = Color.rgb(255,0,0);
	Parallelogramme(String Type) {
		super(Type);
		this.AttributesParser();
	}
	public void AttributesParser() {
		int cpt = 0;
	
		while(attributes.length() > 0) {
			this.attributesParsed[cpt] = this.attributes.substring(this.attributes.indexOf(",")
					, this.attributes.indexOf(","));
			this.attributes.replace(this.attributesParsed[cpt], "");
			if(cpt == 6) {
				String temp;
				String tempPoint[];
				temp = this.attributesParsed[6].substring(this.attributesParsed[6].indexOf("["),
						this.attributesParsed[6].indexOf("]"));
				tempPoint = temp.split(",");
				for(int i = 0;i < 8;i++) {
					Points[i] = Integer.parseInt(tempPoint[i]);
				}
			}
			cpt++;
		}
		System.out.println(this.attributesParsed);
	}	
	public Polygon setArgs() {
		Polygon p = new Polygon(
					Points[0],
					Points[1],
					Points[2],
					Points[3],
					Points[4],
					Points[5],
					Points[6],
					Points[7]
				);
		p.setFill(Color.web(this.attributesParsed[1].substring(4)));
		p.setStroke(Color.web(this.attributesParsed[2].substring(7)));
		return p;
	}
}
