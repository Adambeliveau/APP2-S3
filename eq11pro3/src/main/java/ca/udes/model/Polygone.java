/*
 * Fichier produit dans le cadre de lapp 2 - s3.
 * Universite de sherbrooke
 * Genie informatique
 * Par Adam Béliveau et Joaquin Esteban Faundez-Flores
 * BELA1003 - FAUJ3006
 */

package ca.udes.model;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Polygone extends Polygon{

	private List<String> Attributes= new ArrayList<String>();
	private List<Double> Points = new ArrayList<Double>();
	private String toString = "";
	
	Polygone(String toString) {
		
		this.toString = toString;
		
		splitToString();
		
		this.getPoints().addAll(Points);
		System.out.println(Attributes.get(1).substring(Attributes.get(1).indexOf("=") + 1));
		this.setFill(Color.web(Attributes.get(1).substring(Attributes.get(1).indexOf("=") + 1)));
		this.setStroke(Color.web(Attributes.get(2).substring(Attributes.get(2).indexOf("=") + 1)));
		
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
				Attributes.add(this.toString.substring(0, this.toString.indexOf(",") ));
				this.toString = this.toString.replace(Attributes.get(cpt) + ",", "");
			}
			else if(j == 3) {
				Attributes.add(this.toString.substring(0, this.toString.indexOf("]") ));
			}
			
			
			cpt++;
		}
	}
	
	public void x(Double x) {this.setLayoutX(x);}
	public void y(Double y) {this.setLayoutY(y);}
}
