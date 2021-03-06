/*
 * Fichier produit dans le cadre de lapp 2 - s3.
 * Universite de sherbrooke
 * Genie informatique
 * Par Adam Béliveau et Joaquin Esteban Faundez-Flores
 * BELA1003 - FAUJ3006
 */

package ca.udes.controlleurs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ca.udes.model.OpenTxt;
import ca.udes.model.OpenXml;
import ca.udes.model.SaveTxt;
import ca.udes.model.SaveXml;
import ca.udes.model.ShapeFactory;
import ca.udes.model.Strategy;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.Node;

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
    private MenuItem Open;
    
    @FXML
    private MenuItem Save;
    
    private ShapeFactory shFact = new ShapeFactory();
    
    private int cpt = 0;
    
    private String idCopiedObj = "";
    
    
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
    
    protected List<Double> x = new ArrayList<Double>();
	protected List<Double> y = new ArrayList<Double>();    
	protected List<String> id = new ArrayList<String>();
	private int cptDebut = 0;
	private Strategy strats;
    
    @FXML
    void SavetxtAction(ActionEvent event) throws IOException {
    	strats = new Strategy(cpt, cptDebut, x, y, id, BorderPane, shFact, anchorPane);
		strats.SetSaveType(new SaveTxt());
		strats.SaveExecute();
    }
    
    @FXML
    void SaveXMLAction(ActionEvent event) throws IOException{
    	strats = new Strategy(cpt, cptDebut, x, y, id, BorderPane, shFact, anchorPane);
		strats.SetSaveType(new SaveXml());
		strats.SaveExecute();
    }
    
    @FXML
    void OpentxtAction(ActionEvent event) throws IOException {
    	for(int i = 0 ; i < cpt ; i ++) {
    		anchorPane.getChildren().remove(i);
    		cpt--;
    	}
    	strats = new Strategy(cpt, cptDebut, x, y, id, BorderPane, shFact, anchorPane);
    	strats.SetOpenType(new OpenTxt());
    	anchorPane = strats.OpenExecute();
    	cpt = anchorPane.getChildren().size();
    }
    
    @FXML
    void OpenXMLAction(ActionEvent event) throws IOException {
    	for(int i = 0 ; i < cpt ; i ++) {
		anchorPane.getChildren().remove(i);
		cpt--;
    	}
    	strats = new Strategy(cpt, cptDebut, x, y, id, BorderPane, shFact, anchorPane);
    	strats.SetOpenType(new OpenXml());
    	anchorPane = strats.OpenExecute();
    }

    @FXML
    void addAction(ActionEvent event) {
    	this.StatusBarL.setText("add");
    }

    @FXML
    void fullScreenAction(ActionEvent event) {
    	this.StatusBarL.setText("FullScreen");
    }
    
    @FXML
    void drawAction(ActionEvent event) {
    	this.StatusBarL.setText("Draw");

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
    	this.StatusBarL.setText("Simple Arrow Selected");
    	this.ArrowImg.setImage(new Image(Controller.class.getResourceAsStream("/images/next (1).png")));
    	
    }

    @FXML
    void doubleArrowAction(ActionEvent event) {
    	this.StatusBarL.setText("Double Arrow Selected");
    	this.ArrowImg.setImage(new Image(Controller.class.getResourceAsStream("/images/double-arrow (1).png")));
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
    	Node newNode = null;
    	Node node = BorderPane.lookup("#"+idCopiedObj);
    	String nodeString = node.toString();
    	System.out.println(nodeString);
    	

    	newNode = shFact.getShape(nodeString, event.getX(), event.getY(), idCopiedObj);

    	cpt++;
    	System.out.println(cpt);
    	anchorPane.getChildren().add(newNode);

    }
    
    @FXML
    void LineCreator(DragEvent event) {
    	if(isDraw == 1) {
    		
    	}
    	
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
        assert DashedArrowbtn != null : "fx:id=\"DashedArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMultiConv != null : "fx:id=\"EstimatorMultiConv\" was not injected: check your FXML file 'UI.fxml'.";
        assert Picturebtn != null : "fx:id=\"Picturebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert MonoCoupTop != null : "fx:id=\"MonoCoupTop\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorAccumulator != null : "fx:id=\"EstimatorAccumulator\" was not injected: check your FXML file 'UI.fxml'.";
        assert Save != null : "fx:id=\"Save\" was not injected: check your FXML file 'UI.fxml'.";
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
        assert Open != null : "fx:id=\"Open\" was not injected: check your FXML file 'UI.fxml'.";
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
