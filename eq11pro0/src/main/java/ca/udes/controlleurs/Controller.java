package ca.udes.controlleurs;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Menu Help;

    @FXML
    private TitledPane EstimatorTab;

    @FXML
    private AnchorPane StrategyAP;

    @FXML
    private Button Drawbtn;

    @FXML
    private TitledPane EnergyBasedTab;

    @FXML
    private Menu Edit;

    @FXML
    private TitledPane StrategyTab;

    @FXML
    private Label ModesL;

    @FXML
    private TitledPane InversionBasedTab;

    @FXML
    private Tab EditorTab;

    @FXML
    private Button AlignLeftbtn;

    @FXML
    private Button Erasebtn;

    @FXML
    private Button Expandbtn;

    @FXML
    private Label Inversionl;

    @FXML
    private Accordion LeftAccordion;

    @FXML
    private Button Addbtn;

    @FXML
    private Label AlignementL;

    @FXML
    private Button AlignTopbtn;

    @FXML
    private Tab SimulatorTab;

    @FXML
    private Button FullScreenbtn;

    @FXML
    private Button Infobtn;

    @FXML
    private Label OptionL;

    @FXML
    private MenuButton ArrowMenubtn;

    @FXML
    private AnchorPane EnergyBasedAP;

    @FXML
    private AnchorPane EstimatorAP;

    @FXML
    private Button Picturebtn;

    @FXML
    private AnchorPane InversionBasedAP;

    @FXML
    private Menu File;

    @FXML
    private Button Inversionbtn;

    @FXML
    void addAction(ActionEvent event) {

    }

    @FXML
    void fullScreenAction(ActionEvent event) {

    }

    @FXML
    void drawAction(ActionEvent event) {

    }

    @FXML
    void expandAction(ActionEvent event) {

    }

    @FXML
    void eraseAction(ActionEvent event) {

    }

    @FXML
    void infoAction(ActionEvent event) {

    }

    @FXML
    void pictureAction(ActionEvent event) {

    }

    @FXML
    void arrowAction(ActionEvent event) {

    }

    @FXML
    void alignLeftAction(ActionEvent event) {

    }

    @FXML
    void alignTopAction(ActionEvent event) {

    }

    @FXML
    void inversionAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Help != null : "fx:id=\"Help\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorTab != null : "fx:id=\"EstimatorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert StrategyAP != null : "fx:id=\"StrategyAP\" was not injected: check your FXML file 'UI.fxml'.";
        assert Drawbtn != null : "fx:id=\"Drawbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EnergyBasedTab != null : "fx:id=\"EnergyBasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert Edit != null : "fx:id=\"Edit\" was not injected: check your FXML file 'UI.fxml'.";
        assert StrategyTab != null : "fx:id=\"StrategyTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert ModesL != null : "fx:id=\"ModesL\" was not injected: check your FXML file 'UI.fxml'.";
        assert InversionBasedTab != null : "fx:id=\"InversionBasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert EditorTab != null : "fx:id=\"EditorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert AlignLeftbtn != null : "fx:id=\"AlignLeftbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Erasebtn != null : "fx:id=\"Erasebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Expandbtn != null : "fx:id=\"Expandbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Inversionl != null : "fx:id=\"Inversionl\" was not injected: check your FXML file 'UI.fxml'.";
        assert LeftAccordion != null : "fx:id=\"LeftAccordion\" was not injected: check your FXML file 'UI.fxml'.";
        assert Addbtn != null : "fx:id=\"Addbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert AlignementL != null : "fx:id=\"AlignementL\" was not injected: check your FXML file 'UI.fxml'.";
        assert AlignTopbtn != null : "fx:id=\"AlignTopbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert SimulatorTab != null : "fx:id=\"SimulatorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert FullScreenbtn != null : "fx:id=\"FullScreenbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Infobtn != null : "fx:id=\"Infobtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert OptionL != null : "fx:id=\"OptionL\" was not injected: check your FXML file 'UI.fxml'.";
        assert ArrowMenubtn != null : "fx:id=\"ArrowMenubtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EnergyBasedAP != null : "fx:id=\"EnergyBasedAP\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorAP != null : "fx:id=\"EstimatorAP\" was not injected: check your FXML file 'UI.fxml'.";
        assert Picturebtn != null : "fx:id=\"Picturebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert InversionBasedAP != null : "fx:id=\"InversionBasedAP\" was not injected: check your FXML file 'UI.fxml'.";
        assert File != null : "fx:id=\"File\" was not injected: check your FXML file 'UI.fxml'.";
        assert Inversionbtn != null : "fx:id=\"Inversionbtn\" was not injected: check your FXML file 'UI.fxml'.";

    }
}
