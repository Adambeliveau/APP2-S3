package ca.udes.controlleurs;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private ResourceBundle resources;
    
    @FXML
    private ImageView ArrowImg;

    @FXML
    private URL location;

    @FXML
    private MenuButton MenuArrow;

    @FXML
    private Button MultiCoupbtn;

    @FXML
    private TitledPane EnergyBasedTab;

    @FXML
    private Button EstimatorMonoCoupbtn;

    @FXML
    private Button EstimatorCoupInvWeigbtn;

    @FXML
    private Menu Edit;

    @FXML
    private TitledPane InversionbasedTab;

    @FXML
    private Label ModesL;

    @FXML
    private Button MonoCoupbtn;

    @FXML
    private Button EstimatorMultiConvbtn;

    @FXML
    private Button Accumulateurbtn;

    @FXML
    private Button Expandbtn;

    @FXML
    private Button Addbtn;

    @FXML
    private Label AlignementL;

    @FXML
    private Button TopAlignbtn;

    @FXML
    private Button Strategybtn;

    @FXML
    private Canvas Canvas;

    @FXML
    private Button CouplingInvWeightingbtn;

    @FXML
    private Button EstimatorIndirectInvbtn;

    @FXML
    private Button DirectInvDisturbancebtn;

    @FXML
    private Button Picturebtn;

    @FXML
    private Button EnergySourcebtn;

    @FXML
    private Button MonoConvbtn;

    @FXML
    private Menu File;

    @FXML
    private Label InversionL;

    @FXML
    private BorderPane BorderPane;

    @FXML
    private Menu Help;

    @FXML
    private TitledPane EstimatorTab;

    @FXML
    private MenuItem DoubleArrowbtn;

    @FXML
    private Button Drawbtn;

    @FXML
    private MenuItem SimpleArrowbtn;
    
    @FXML
    private MenuItem DashedArrowbtn;

    @FXML
    private Tab EditorTab;

    @FXML
    private Button EstimatorCoupInvDistbtn;

    @FXML
    private Button Erasebtn;

    @FXML
    private Label StatusBarL;

    @FXML
    private Button DirectInvbtn;

    @FXML
    private TitledPane StrategybasedTab;

    @FXML
    private Button EstimatorEnergySourcebtn;

    @FXML
    private Tab SimulatorTab;

    @FXML
    private Button EstimatorMultiCoupbtn;

    @FXML
    private Button FullScreenbtn;

    @FXML
    private Button Infobtn;

    @FXML
    private Label OptionL;

    @FXML
    private Button LeftAlignbtn;

    @FXML
    private Button EstimatorStrategybtn;

    @FXML
    private MenuBar Menubar;

    @FXML
    private Button CouplingInvDistributionbtn;

    @FXML
    private Button EstimatorMonoConvbtn;

    @FXML
    private Button MultiConvbtn;

    @FXML
    private Accordion Accordion;

    @FXML
    private Button IndirectInvbtn;

    @FXML
    private Button EstimatorDirectInvbtn;

    @FXML
    private Button EstimatorAccumulateurbtn;

    @FXML
    private Button Inversionbtn;

    @FXML
    private Button EstimatorDirectInvDisbtn;

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
    void directInvDisturbanceAction(ActionEvent event) {
    	this.StatusBarL.setText("Direct inversion with disturbance pictogram selected");
    }

    @FXML
    void directInvAction(ActionEvent event) {
    	this.StatusBarL.setText("Direction inversion pictogram selected");
    }

    @FXML
    void indirectInvAction(ActionEvent event) {
    	this.StatusBarL.setText("Indirect inversion pictogram selected");
    }

    @FXML
    void couplingInvWeightingAction(ActionEvent event) {
    	this.StatusBarL.setText("Coupling inversion (weighted) pictogram selected");
    }

    @FXML
    void couplingInvDistributionAction(ActionEvent event) {
    	this.StatusBarL.setText("Coupling inversion (distribution) pictogram selected");
    }

    @FXML
    void strategyAction(ActionEvent event) {
    	this.StatusBarL.setText("Strategy pictogram selected");
    }

    @FXML
    void estimatorMultiCoupAction(ActionEvent event) {
    	this.StatusBarL.setText("Multi-physical coupling pictogram selected (Estimator)");
    }

    @FXML
    void estimatorMonoCoupAction(ActionEvent event) {
    	this.StatusBarL.setText("Mono-physical coupling pictogram selected (Estimator)");
    }

    @FXML
    void estimatorMultiConvAction(ActionEvent event) {
    	this.StatusBarL.setText("Multi-physical conversion pictogram selected (Estimator)");
    }

    @FXML
    void estimatorMonoConvAction(ActionEvent event) {
    	this.StatusBarL.setText("Mono-physical conversion pictogram selected (Estimator)");
    }

    @FXML
    void estimatorEnergySourceAction(ActionEvent event) {
    	this.StatusBarL.setText("Energy source pictogram selected (Estimator)");
    }

    @FXML
    void estimatorAccumulateurAction(ActionEvent event) {
    	this.StatusBarL.setText("Accumulator pictogram selected (Estimator)");
    }	

    @FXML
    void estimatorstrategyAction(ActionEvent event) {
    	this.StatusBarL.setText("Strategy pictogram selected (Estimator)");
    }

    @FXML
    void estimatorCoupInvDistAction(ActionEvent event) {
    	this.StatusBarL.setText("Coupling inversion (distribution) pictogram selected (Estimator)");
    }

    @FXML
    void estimatorCoupInvWeigthAction(ActionEvent event) {
    	this.StatusBarL.setText("Coupling inversion (Weighting) pictogram selected (Estimator)");
    }

    @FXML
    void estimatorIndirectInvAction(ActionEvent event) {
    	this.StatusBarL.setText("Indirect inversion pictogram selected (Estimator)");
    }

    @FXML
    void estimatorDrectInvAction(ActionEvent event) {
    	this.StatusBarL.setText("Direction inversion pictogram selected (Estimator)");
    }

    @FXML
    void estimatorDirectInvDisAction(ActionEvent event) {
    	this.StatusBarL.setText("Direct inversion with disturbance pictogram selected (Estimator)");
    }

    @FXML
    void AccumulateurAction(ActionEvent event) {
    	this.StatusBarL.setText("Accumulator pictogram selected");
    }

    @FXML
    void energySourceAction(ActionEvent event) {
    	this.StatusBarL.setText("Energy source pictogram selected");
    }

    @FXML
    void monoConvAction(ActionEvent event) {
    	this.StatusBarL.setText("Mono-physical conversion pictogram selected");
    }

    @FXML
    void multiConvAction(ActionEvent event) {
    	this.StatusBarL.setText("Multi-physical conversion pictogram selected");
    }

    @FXML
    void monoCoupAction(ActionEvent event) {
    	this.StatusBarL.setText("Mono-physical coupling pictogram selected");
    }
    
    @FXML
    void multiCoupAction(ActionEvent event) {
    	this.StatusBarL.setText("Multi-physical coupling pictogram selected");
    }

    @FXML
    private AnchorPane anchorPane;
    
    // Event on dragDetected on Circle in Library
    @FXML
    void detectDrag(MouseEvent event) {
    	System.out.println("Drag detected!");
    	Dragboard dragboard = DirectInvbtn.startDragAndDrop(TransferMode.ANY); 
    	ClipboardContent clipboardContent = new ClipboardContent(); 
    	clipboardContent.putString("Item copied to clipboard"); 
    	dragboard.setContent(clipboardContent);
    	System.out.println(dragboard.getContentTypes());
    	event.consume(); 
    }
    
    // Event on drag Over on Anchor Pane
    @FXML
    void draggedOver(DragEvent event) { 
    	event.acceptTransferModes(TransferMode.ANY); 
    	System.out.println("Dragged over!");
    	event.consume(); 
    } 

    // Event on drag Drop on Anchor Pane
    @FXML
    void dragDropped(DragEvent event) {
    	System.out.println("Drag dropped!");
    	
    	Circle newCircle = new Circle(event.getX(),event.getY(),20);
    	newCircle.setFill(Color.BLUE);
    	newCircle.setStroke(Color.BLUE);
    	
    	anchorPane.getChildren().add(newCircle);
    	event.consume();
    }
    
    @FXML
    void initialize() {
        assert MenuArrow != null : "fx:id=\"MenuArrow\" was not injected: check your FXML file 'UI.fxml'.";
        assert MultiCoupbtn != null : "fx:id=\"MultiCoupbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EnergyBasedTab != null : "fx:id=\"EnergyBasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMonoCoupbtn != null : "fx:id=\"EstimatorMonoCoupbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorCoupInvWeigbtn != null : "fx:id=\"EstimatorCoupInvWeigbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Edit != null : "fx:id=\"Edit\" was not injected: check your FXML file 'UI.fxml'.";
        assert InversionbasedTab != null : "fx:id=\"InversionbasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert ModesL != null : "fx:id=\"ModesL\" was not injected: check your FXML file 'UI.fxml'.";
        assert MonoCoupbtn != null : "fx:id=\"MonoCoupbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMultiConvbtn != null : "fx:id=\"EstimatorMultiConvbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert anchorPane != null : "fx:id=\"anchorPane\" was not injected: check your FXML file 'UI.fxml'.";
        assert ArrowImg != null : "fx:id=\"ArrowImg\" was not injected: check your FXML file 'UI.fxml'.";
        assert Accumulateurbtn != null : "fx:id=\"Accumulateurbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Expandbtn != null : "fx:id=\"Expandbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Addbtn != null : "fx:id=\"Addbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert AlignementL != null : "fx:id=\"AlignementL\" was not injected: check your FXML file 'UI.fxml'.";
        assert TopAlignbtn != null : "fx:id=\"TopAlignbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Strategybtn != null : "fx:id=\"Strategybtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert CouplingInvWeightingbtn != null : "fx:id=\"CouplingInvWeightingbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorIndirectInvbtn != null : "fx:id=\"EstimatorIndirectInvbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert DashedArrowbtn != null : "fx:id=\"DashedArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert DirectInvDisturbancebtn != null : "fx:id=\"DirectInvDisturbancebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Picturebtn != null : "fx:id=\"Picturebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EnergySourcebtn != null : "fx:id=\"EnergySourcebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert MonoConvbtn != null : "fx:id=\"MonoConvbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert File != null : "fx:id=\"File\" was not injected: check your FXML file 'UI.fxml'.";
        assert InversionL != null : "fx:id=\"InversionL\" was not injected: check your FXML file 'UI.fxml'.";
        assert BorderPane != null : "fx:id=\"BorderPane\" was not injected: check your FXML file 'UI.fxml'.";
        assert Help != null : "fx:id=\"Help\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorTab != null : "fx:id=\"EstimatorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert DoubleArrowbtn != null : "fx:id=\"DoubleArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Drawbtn != null : "fx:id=\"Drawbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert SimpleArrowbtn != null : "fx:id=\"SimpleArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EditorTab != null : "fx:id=\"EditorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorCoupInvDistbtn != null : "fx:id=\"EstimatorCoupInvDistbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Erasebtn != null : "fx:id=\"Erasebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert StatusBarL != null : "fx:id=\"StatusBarL\" was not injected: check your FXML file 'UI.fxml'.";
        assert DirectInvbtn != null : "fx:id=\"DirectInvbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert StrategybasedTab != null : "fx:id=\"StrategybasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorEnergySourcebtn != null : "fx:id=\"EstimatorEnergySourcebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert SimulatorTab != null : "fx:id=\"SimulatorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMultiCoupbtn != null : "fx:id=\"EstimatorMultiCoupbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert FullScreenbtn != null : "fx:id=\"FullScreenbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Infobtn != null : "fx:id=\"Infobtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert OptionL != null : "fx:id=\"OptionL\" was not injected: check your FXML file 'UI.fxml'.";
        assert LeftAlignbtn != null : "fx:id=\"LeftAlignbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorStrategybtn != null : "fx:id=\"EstimatorStrategybtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Menubar != null : "fx:id=\"Menubar\" was not injected: check your FXML file 'UI.fxml'.";
        assert CouplingInvDistributionbtn != null : "fx:id=\"CouplingInvDistributionbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorMonoConvbtn != null : "fx:id=\"EstimatorMonoConvbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert MultiConvbtn != null : "fx:id=\"MultiConvbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Accordion != null : "fx:id=\"Accordion\" was not injected: check your FXML file 'UI.fxml'.";
        assert IndirectInvbtn != null : "fx:id=\"IndirectInvbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorDirectInvbtn != null : "fx:id=\"EstimatorDirectInvbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorAccumulateurbtn != null : "fx:id=\"EstimatorAccumulateurbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Inversionbtn != null : "fx:id=\"Inversionbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorDirectInvDisbtn != null : "fx:id=\"EstimatorDirectInvDisbtn\" was not injected: check your FXML file 'UI.fxml'.";

    }
}
