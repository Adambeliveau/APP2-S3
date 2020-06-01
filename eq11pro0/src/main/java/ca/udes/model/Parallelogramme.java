package ca.udes.model;

public class Parallelogramme extends Shape{
	
	private int Points[];
	Parallelogramme(String attributes){
		this.attributes = attributes;
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
}
