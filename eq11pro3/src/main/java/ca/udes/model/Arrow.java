package ca.udes.model;

import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;


public class Arrow extends Path{
    private static final double defaultArrowHeadSize = 10.0;
    
    public Arrow( double endX, double endY){
        super();
        strokeProperty().bind(fillProperty());
        setFill(Color.BLACK);
    
        double arrowHeadSize = defaultArrowHeadSize;
        
        //Line
        getElements().add(new MoveTo(0, 0));
        getElements().add(new LineTo(40, 0));
        
        //ArrowHead
        double angle = Math.atan2((0), (40)) - Math.PI / 2.0;
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        //point1
        double x1 = (- 1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + 40;
        double y1 = (- 1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize;
        //point2
        double x2 = (1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + 40;
        double y2 = (1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize;
        
        getElements().add(new LineTo(x1, y1));
        getElements().add(new LineTo(x2, y2));
        getElements().add(new LineTo(40, 0));
    }

}