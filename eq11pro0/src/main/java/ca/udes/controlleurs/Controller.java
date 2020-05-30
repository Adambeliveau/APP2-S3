package ca.udes.controlleurs;

import java.net.URL;
import java.util.ResourceBundle;

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
import javafx.scene.layout.BorderPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton MenuArrow;

    @FXML
    private MenuItem FullArrowbtn;

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
    private TitledPane EnergyBasedTab;

    @FXML
    private MenuItem SimpleArrowbtn;

    @FXML
    private Menu Edit;

    @FXML
    private TitledPane InversionbasedTab;

    @FXML
    private Label ModesL;

    @FXML
    private Tab EditorTab;

    @FXML
    private Button Erasebtn;

    @FXML
    private TitledPane StrategybasedTab;

    @FXML
    private Button Expandbtn;

    @FXML
    private Button Addbtn;

    @FXML
    private Label AlignementL;

    @FXML
    private Button TopAlignbtn;

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
    private Accordion Accordion;

    @FXML
    private Button Picturebtn;

    @FXML
    private Menu File;

    @FXML
    private Label InversionL;

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
    void PictureAction(ActionEvent event) {

    }

    @FXML
    void menuArrowAction(ActionEvent event) {

    }

    @FXML
    void simpleArrowAction(ActionEvent event) {

    }

    @FXML
    void fullArrowAction(ActionEvent event) {

    }

    @FXML
    void leftAlignAction(ActionEvent event) {

    }

    @FXML
    void topAlignAction(ActionEvent event) {

    }

    @FXML
    void InversionAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert MenuArrow != null : "fx:id=\"MenuArrow\" was not injected: check your FXML file 'UI.fxml'.";
        assert FullArrowbtn != null : "fx:id=\"FullArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert BorderPane != null : "fx:id=\"BorderPane\" was not injected: check your FXML file 'UI.fxml'.";
        assert Help != null : "fx:id=\"Help\" was not injected: check your FXML file 'UI.fxml'.";
        assert EstimatorTab != null : "fx:id=\"EstimatorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert DoubleArrowbtn != null : "fx:id=\"DoubleArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Drawbtn != null : "fx:id=\"Drawbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert EnergyBasedTab != null : "fx:id=\"EnergyBasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert SimpleArrowbtn != null : "fx:id=\"SimpleArrowbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Edit != null : "fx:id=\"Edit\" was not injected: check your FXML file 'UI.fxml'.";
        assert InversionbasedTab != null : "fx:id=\"InversionbasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert ModesL != null : "fx:id=\"ModesL\" was not injected: check your FXML file 'UI.fxml'.";
        assert EditorTab != null : "fx:id=\"EditorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert Erasebtn != null : "fx:id=\"Erasebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert StrategybasedTab != null : "fx:id=\"StrategybasedTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert Expandbtn != null : "fx:id=\"Expandbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Addbtn != null : "fx:id=\"Addbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert AlignementL != null : "fx:id=\"AlignementL\" was not injected: check your FXML file 'UI.fxml'.";
        assert TopAlignbtn != null : "fx:id=\"TopAlignbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert SimulatorTab != null : "fx:id=\"SimulatorTab\" was not injected: check your FXML file 'UI.fxml'.";
        assert FullScreenbtn != null : "fx:id=\"FullScreenbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Infobtn != null : "fx:id=\"Infobtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert OptionL != null : "fx:id=\"OptionL\" was not injected: check your FXML file 'UI.fxml'.";
        assert LeftAlignbtn != null : "fx:id=\"LeftAlignbtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert Menubar != null : "fx:id=\"Menubar\" was not injected: check your FXML file 'UI.fxml'.";
        assert Accordion != null : "fx:id=\"Accordion\" was not injected: check your FXML file 'UI.fxml'.";
        assert Picturebtn != null : "fx:id=\"Picturebtn\" was not injected: check your FXML file 'UI.fxml'.";
        assert File != null : "fx:id=\"File\" was not injected: check your FXML file 'UI.fxml'.";
        assert InversionL != null : "fx:id=\"InversionL\" was not injected: check your FXML file 'UI.fxml'.";
        assert Inversionbtn != null : "fx:id=\"Inversionbtn\" was not injected: check your FXML file 'UI.fxml'.";

    }
}
