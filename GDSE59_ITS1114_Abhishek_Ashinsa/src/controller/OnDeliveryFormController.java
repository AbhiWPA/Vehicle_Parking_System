package controller;

import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.OnDelivery;
import model.diliverTBL;
import model.diliverTM;
import view.tm.OnDeliveryTM;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class OnDeliveryFormController implements Initializable {
    public AnchorPane onDelivery;
    public TableView tblOnDilivery;
    public TableColumn idVNumber;
    public TableColumn idVType;
    public TableColumn idDName;
    public TableColumn idDTime;

    public static String dName;
    public static String vNumber;
    public static String vType;
    public static String dTime;


    static ArrayList<diliverTBL> drl =new ArrayList<diliverTBL>();
    static ObservableList<diliverTM> oList= FXCollections.observableArrayList();

    public static void load() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] arl={vNumber,vType,dName,dTime};

        idVNumber.setCellValueFactory(new PropertyValueFactory("vn"));
        idVType.setCellValueFactory(new PropertyValueFactory("vt"));
        idDName.setCellValueFactory(new PropertyValueFactory("dn"));
        idDTime.setCellValueFactory(new PropertyValueFactory("dt"));
        tblOnDilivery.setItems(oList);


        diliverTM pm=new diliverTM(arl[0],arl[1],arl[2],arl[3]);
        oList.add(pm);
    }
}


