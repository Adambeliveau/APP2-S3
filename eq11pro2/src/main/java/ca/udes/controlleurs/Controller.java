package ca.udes.controlleurs;


import java.util.ArrayList;
import java.util.List;
import ca.udes.model.Arrow;
import ca.udes.model.ShapeFactory;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import states.EMRState;
import states.ArrowState;
import states.DrawState;

public class Controller {

    @FXML
    private MenuButton MenuArrow;

    @FXML
    private TitledPane EnergyBasedTab;

    @FXML
    private Rectangle EstimatorMonoConv;

    @FXML
    private Menu Edit;

    @FXML
    private TitledPane InversionbasedTab;

    @FXML
    private Label ModesL;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ImageView ArrowImg;

    @FXML
    private Circle MultiConv;

    @FXML
    private Polygon AccumulatorInv;

    @FXML
    private Ellipse EnergySource;

    @FXML
    private Button Expandbtn;

    @FXML
    private Button Addbtn;

    @FXML
    private Label AlignementL;

    @FXML
    private Button TopAlignbtn;

    @FXML
    private Circle MultiConvBot;

    @FXML
    private Path MultiConvMid;

    @FXML
    private Rectangle MonoConv;

    @FXML
    private Rectangle EstimatorLineAccumulator;

    @FXML
    private MenuItem DashedArrowbtn;

    @FXML
    private Circle EstimatorMultiConv;

    @FXML
    private Button Picturebtn;

    @FXML
    private Rectangle MonoCoupTop;

    @FXML
    private Rectangle EstimatorAccumulator;

    @FXML
    private Ellipse EstimatorEnergySource;

    @FXML
    private Menu File;

    @FXML
    private Label InversionL;

    @FXML
    private Polygon CouplingInvTop;

    @FXML
    private Rectangle Accumulator;

    @FXML
    private Rectangle MonoCoupBot;

    @FXML
    private BorderPane BorderPane;

    @FXML
    private Rectangle MonoCoupMid;

    @FXML
    private Menu Help;

    @FXML
    private TitledPane EstimatorTab;

    @FXML
    private MenuItem DoubleArrowbtn;

    @FXML
    private Polygon ConversionInv;

    @FXML
    private Button Drawbtn;

    @FXML
    private Path EstimatorMultiConvMid;

    @FXML
    private MenuItem SimpleArrowbtn;

    @FXML
    private Circle EstimatorMultiConvBot;

    @FXML
    private Circle EstimatorMultiCoupTop;

    @FXML
    private Rectangle EstimatorMonoCoupBot;

    @FXML
    private Rectangle EstimatorMonoCoupMid;

    @FXML
    private Tab EditorTab;

    @FXML
    private Button Erasebtn;

    @FXML
    private Label StatusBarL;

    @FXML
    private TitledPane StrategybasedTab;

    @FXML
    private Tab SimulatorTab;

    @FXML
    private Button FullScreenbtn;

    @FXML
    private Button Infobtn;

    @FXML
    private Label OptionL;

    @FXML
    private Button LeftAlignbtn;

    @FXML
    private MenuBar Menubar;

    @FXML
    private Circle MultiCoupTop;

    @FXML
    private Polygon CouplingInvBot;

    @FXML
    private Accordion Accordion;

    @FXML
    private Polygon CouplingInvMid;

    @FXML
    private Rectangle LineAccumulator;

    @FXML
    private Polygon Strategy;

    @FXML
    private Rectangle EstimatorMonoCoupTop;

    @FXML
    private Button Inversionbtn;
    
    @FXML
    private int isDraw;
    
    @FXML
    private MenuItem Undo;
    
    @FXML
    private MenuItem Redo;
    
    private ShapeFactory shFact = new ShapeFactory();
    
    private List<Double> x = new ArrayList<Double>();
    
    private List<Double> y = new ArrayList<Double>();
 
    private ArrayList<Shape> selectedShapes = new ArrayList<>();
    
    private int cptRedo = 0;
    
    private int cpt = 0;
    
    private String idCopiedObj = "";
    
    double firstClickX= 0;
    double firstClickY = 0;
    double lastClickX = 0;
    double lastClickY = 0;
    
    private EMRState arrowState = new ArrowState();
    private EMRState drawState = new DrawState();
    private EMRState current;
    
    
    private void getArrowPos(Shape shape1, Shape shape2) {
    	firstClickX = shape1.getBoundsInParent().getCenterX();
    	firstClickY = shape1.getBoundsInParent().getCenterY();
    	lastClickX = shape2.getBoundsInParent().getCenterX();
    	lastClickY = shape2.getBoundsInParent().getCenterY();
    }
    
    private void setState(EMRState status) {
    	current = status;
    }

    private void copyClipboard(MouseEvent event, Node n) {
    	System.out.println("Drag detected!");
    	
    	idCopiedObj = n.getId();
    	
    	Dragboard dragboard = n.startDragAndDrop(TransferMode.ANY); 
    	ClipboardContent clipboardContent = new ClipboardContent(); 
    	clipboardContent.putString("Item copied to clipboard"); 
    	dragboard.setContent(clipboardContent);
    	
    	System.out.println(dragboard.getContentTypes());
    	event.consume(); 
    }
    
    public void onShapeSelected(MouseEvent e) {
        Shape shape = (Shape) e.getSource();
        shape.setStyle("-fx-effect: dropshadow(three-pass-box, red, 2, 2, 0, 0);");
        if (!selectedShapes.contains(shape)) {
            selectedShapes.add(shape);
            System.out.println("Shape Selected:" + shape);
        } else {
            shape.setStyle("-fx-effect: null");
            selectedShapes.remove(shape);
        }
    }
    
    
    @FXML
    void UndoAction(ActionEvent event) {
    	
    	if(cpt > 0) {
    		x.add(anchorPane.getChildren().get(--cpt).getLayoutX());
        	y.add(anchorPane.getChildren().get(cpt).getLayoutY());
    		anchorPane.getChildren().remove(cpt);
    		cptRedo++;
    	}
    	System.out.println(cptRedo);
    	System.out.println(cpt);
    }
    
    @FXML
    void RedoAction(ActionEvent event) {
    	if(cptRedo > 0 ) {
    		ObservableList<Double> polygonePoints = ConversionInv.getPoints();
        	Polygon newPoly = new Polygon(polygonePoints.get(0).doubleValue(),
        			polygonePoints.get(1).doubleValue(),
        			polygonePoints.get(2).doubleValue(),
        			polygonePoints.get(3).doubleValue(),
        			polygonePoints.get(4).doubleValue(),
        			polygonePoints.get(5).doubleValue(),
        			polygonePoints.get(6).doubleValue(),
        			polygonePoints.get(7).doubleValue()
        			);
        	newPoly.setFill(ConversionInv.getFill());
        	newPoly.setStroke(ConversionInv.getStroke());
        	newPoly.setLayoutX(x.get(--cptRedo));
        	newPoly.setLayoutY(y.get(cptRedo));
        	anchorPane.getChildren().add(newPoly);
        	cpt++;
    	}
    	System.out.println(cptRedo);
    	System.out.println(cpt);
    }

    @FXML
    void addAction(ActionEvent event) {
    	this.StatusBarL.setText("add");
    	setState(drawState);
    }

    @FXML
    void fullScreenAction(ActionEvent event) {
    	this.StatusBarL.setText("FullScreen");
    }
    
    @FXML
    void drawAction(ActionEvent event) {
    	setState(drawState);
    	this.StatusBarL.setText("Drawing state chosen");
    }

    @FXML
    void expandAction(ActionEvent event) {
    	this.StatusBarL.setText("Expand pictogram");
    }

    @FXML
    void eraseAction(ActionEvent event) {
    	this.StatusBarL.setText("Erase");
    }

    @FXML
    void infoAction(ActionEvent event) {
    	this.StatusBarL.setText("Info");
    }

    @FXML
    void PictureAction(ActionEvent event) {
    	this.StatusBarL.setText("Insert picture");
    }

    @FXML
    void menuArrowAction(ActionEvent event) {
    	this.StatusBarL.setText("Select an arrow type");
    }

    @FXML
    void simpleArrowAction(ActionEvent event) {
    	Color arrowColor = Color.BLACK;
    	Shape newArrow = null;
    	this.StatusBarL.setText("Simple Arrow Selected");
    	this.ArrowImg.setImage(new Image(Controller.class.getResourceAsStream("/images/next (1).png")));

    	setState(arrowState);
    	this.StatusBarL.setText("Arrow state chosen");
    	
    	if(selectedShapes.get(0) != null && selectedShapes.get(1) != null && selectedShapes.size() == 2) {
    		getArrowPos(selectedShapes.get(0), selectedShapes.get(1));
    	}
    	else {
    		StatusBarL.setText("Please select 2 shapes to connect");
    	}
    	newArrow = current.drawArrow(firstClickX, firstClickY, lastClickX, lastClickY, arrowColor);
    	anchorPane.getChildren().add(newArrow);
    	event.consume();
    }

    @FXML
    void doubleArrowAction(ActionEvent event) {
    	setState(arrowState);
    	this.StatusBarL.setText("Arrow state chosen");
    	Color arrowColor = Color.RED;
    	Shape newArrow = null;
    	//this.StatusBarL.setText("Double Arrow Selected");
    	this.ArrowImg.setImage(new Image(Controller.class.getResourceAsStream("/images/double-arrow (1).png")));
    	
    	if(selectedShapes.get(0) != null && selectedShapes.get(1) != null && selectedShapes.size() == 2) {
    		Shape s1 = selectedShapes.get(0);
    		Shape s2 = selectedShapes.get(1);
    		getArrowPos(s1,s2);
    	}
    	else {
    		StatusBarL.setText("Please select 2 shapes to connect");
    	}
    	
    	newArrow = current.drawArrow(firstClickX, firstClickY, lastClickX, lastClickY, arrowColor);
    	anchorPane.getChildren().add(newArrow);
    	event.consume();
    }

    @FXML
    void dashedArrowAction(ActionEvent event) {
    	this.StatusBarL.setText("Dashed Arrow Selected");
    	this.ArrowImg.setImage(new Image(Controller.class.getResourceAsStream("/images/Dashed.png")));
    }

    @FXML
    void leftAlignAction(ActionEvent event) {
    	this.StatusBarL.setText("Alignement set to the left");
    }

    @FXML
    void topAlignAction(ActionEvent event) {
    	this.StatusBarL.setText("Alignement set to the top");
    }

    @FXML
    void InversionAction(ActionEvent event) {
    	this.StatusBarL.setText("Inverse a pictogram");
    	
    }

    @FXML
    void detectDrag(MouseEvent event) {
    	copyClipboard(event, ConversionInv);
    }
    @FXML
    void detectDragArrow(MouseEvent event) {
    	copyClipboard(event, ArrowImg);
    }
   
    @FXML
    void draggedOver(DragEvent event) { 
    	event.acceptTransferModes(TransferMode.ANY); 
    	System.out.println("Dragged over!");
    	System.out.println(idCopiedObj);
    	event.consume();
    } 
    
    
    
    @FXML
    void dragDropped(DragEvent event) {

    	System.out.println("Drooooped");
    	Shape newNode = null;
    	Node node = BorderPane.lookup("#"+idCopiedObj);
    	String nodeString = node.toString();
    	
    	cpt++;
    	System.out.println(nodeString);
    	
    	String nameParent = "InversionbasedTab";
    	
    	//newNode = shFact.getShape(nodeString, nameParent, event.getX(), event.getY());
    	newNode = current.drawShape(nodeString, nameParent, event.getX(), event.getY());

    	System.out.println(cptRedo);
    	System.out.println(cpt);
    	anchorPane.getChildren().add(newNode);
    	newNode.setOnMouseClicked(e -> onShapeSelected(e));
    	
    	event.consume();
    }
    
    int cptMouse = 0;
    
    
    @FXML
    void startArrow(MouseEvent event) {
    	//premier prototype    	
    	//firstClickX = event.getX();
    	//firstClickY = event.getY();
    }
    
    //Color arrowColor= Color.BLACK;
    
 
    @FXML
    void endArrow(MouseEvent event) {
    	//premier prototype
    	
//    	Shape newArrow=null;
//    	lastClickX = event.getX();
//    	lastClickY = event.getY();
//    	
//    	//newArrow = new Arrow(firstClickX, firstClickY, lastClickX, lastClickY, arrowColor);
//    	newArrow = current.drawArrow(firstClickX, firstClickY, lastClickX, lastClickY, arrowColor);
//    	anchorPane.getChildren().add(newArrow);
//    	event.consume();
    	
    }
    
    @FXML
    void LineCreator(MouseEvent event) {
    }
    
    @FXML
    void initialize() {
        assert MenuArrow != null : "fx:id=\"MenuArrow\" was not injected: check your FXML file 'UI.fxml'.";
        assert EnergyBasedTab != null : "fx:id=\"EnergyBasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMonoConv != null : "fx:id=\"EstimatorMonoConv\" was not injected: check your FXML file 'UI.fxml'.";
        assert Edit != null : "fx:id=\"Edit\" was not injected: check your FXML file 'UI.fxml'.";
        assert InversionbasedTab != null : "fx:id=\"InversionbasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert ModesL != null : "fx:id=\"ModesL\" was not injected: check your FXML file 'UI.fxml'.";
        assert anchorPane != null : "fx:id=\"anchorPane\" was not injected: check your FXML file 'UI.fxml'.";
        assert ArrowImg != null : "fx:id=\"ArrowImg\" was not injected: check your FXML file 'UI.fxml'.";
        assert MultiConv != null : "fx:id=\"MultiConv\" was not injected: check your FXML file 'UI.fxml'.";
        assert AccumulatorInv != null : "fx:id=\"AccumulatorInv\" was not injected: check your FXML file 'UI.fxml'.";
        assert EnergySource != null : "fx:id=\"EnergySource\" was not injected: check your FXML file 'UI.fxml'.";
        assert Expandbtn != null : "fx:id=\"Expandbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Addbtn != null : "fx:id=\"Addbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert AlignementL != null : "fx:id=\"AlignementL\" was not injected: check your FXML file 'UI.fxml'.";
        assert TopAlignbtn != null : "fx:id=\"TopAlignbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert MultiConvBot != null : "fx:id=\"MultiConvBot\" was not injected: check your FXML file 'UI.fxml'.";
        assert MultiConvMid != null : "fx:id=\"MultiConvMid\" was not injected: check your FXML file 'UI.fxml'.";
        assert MonoConv != null : "fx:id=\"MonoConv\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorLineAccumulator != null : "fx:id=\"EstimatorLineAccumulator\" was not injected: check your FXML file 'UI.fxml'.";
        assert Undo != null : "fx:id=\"Undo\" was not injected: check your FXML file 'UI.fxml'.";
        assert DashedArrowbtn != null : "fx:id=\"DashedArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMultiConv != null : "fx:id=\"EstimatorMultiConv\" was not injected: check your FXML file 'UI.fxml'.";
        assert Picturebtn != null : "fx:id=\"Picturebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert MonoCoupTop != null : "fx:id=\"MonoCoupTop\" was not injected: check your FXML file 'UI.fxml'.";
        assert Redo != null : "fx:id=\"Redo\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorAccumulator != null : "fx:id=\"EstimatorAccumulator\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorEnergySource != null : "fx:id=\"EstimatorEnergySource\" was not injected: check your FXML file 'UI.fxml'.";
        assert File != null : "fx:id=\"File\" was not injected: check your FXML file 'UI.fxml'.";
        assert InversionL != null : "fx:id=\"InversionL\" was not injected: check your FXML file 'UI.fxml'.";
        assert CouplingInvTop != null : "fx:id=\"CouplingInvTop\" was not injected: check your FXML file 'UI.fxml'.";
        assert Accumulator != null : "fx:id=\"Accumulator\" was not injected: check your FXML file 'UI.fxml'.";
        assert MonoCoupBot != null : "fx:id=\"MonoCoupBot\" was not injected: check your FXML file 'UI.fxml'.";
        assert BorderPane != null : "fx:id=\"BorderPane\" was not injected: check your FXML file 'UI.fxml'.";
        assert MonoCoupMid != null : "fx:id=\"MonoCoupMid\" was not injected: check your FXML file 'UI.fxml'.";
        assert Help != null : "fx:id=\"Help\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorTab != null : "fx:id=\"EstimatorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert DoubleArrowbtn != null : "fx:id=\"DoubleArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert ConversionInv != null : "fx:id=\"ConversionInv\" was not injected: check your FXML file 'UI.fxml'.";
        assert Drawbtn != null : "fx:id=\"Drawbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMultiConvMid != null : "fx:id=\"EstimatorMultiConvMid\" was not injected: check your FXML file 'UI.fxml'.";
        assert SimpleArrowbtn != null : "fx:id=\"SimpleArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMultiConvBot != null : "fx:id=\"EstimatorMultiConvBot\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMultiCoupTop != null : "fx:id=\"EstimatorMultiCoupTop\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMonoCoupBot != null : "fx:id=\"EstimatorMonoCoupBot\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMonoCoupMid != null : "fx:id=\"EstimatorMonoCoupMid\" was not injected: check your FXML file 'UI.fxml'.";
        assert EditorTab != null : "fx:id=\"EditorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert Erasebtn != null : "fx:id=\"Erasebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert StatusBarL != null : "fx:id=\"StatusBarL\" was not injected: check your FXML file 'UI.fxml'.";
        assert StrategybasedTab != null : "fx:id=\"StrategybasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert SimulatorTab != null : "fx:id=\"SimulatorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert FullScreenbtn != null : "fx:id=\"FullScreenbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Infobtn != null : "fx:id=\"Infobtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert OptionL != null : "fx:id=\"OptionL\" was not injected: check your FXML file 'UI.fxml'.";
        assert LeftAlignbtn != null : "fx:id=\"LeftAlignbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Menubar != null : "fx:id=\"Menubar\" was not injected: check your FXML file 'UI.fxml'.";
        assert MultiCoupTop != null : "fx:id=\"MultiCoupTop\" was not injected: check your FXML file 'UI.fxml'.";
        assert CouplingInvBot != null : "fx:id=\"CouplingInvBot\" was not injected: check your FXML file 'UI.fxml'.";
        assert Accordion != null : "fx:id=\"Accordion\" was not injected: check your FXML file 'UI.fxml'.";
        assert CouplingInvMid != null : "fx:id=\"CouplingInvMid\" was not injected: check your FXML file 'UI.fxml'.";
        assert LineAccumulator != null : "fx:id=\"LineAccumulator\" was not injected: check your FXML file 'UI.fxml'.";
        assert Strategy != null : "fx:id=\"Strategy\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMonoCoupTop != null : "fx:id=\"EstimatorMonoCoupTop\" was not injected: check your FXML file 'UI.fxml'.";
        assert Inversionbtn != null : "fx:id=\"Inversionbtn\" was not injected: check your FXML file 'UI.fxml'.";

    }
}
