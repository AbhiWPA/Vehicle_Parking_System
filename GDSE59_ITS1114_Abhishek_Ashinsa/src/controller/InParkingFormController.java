package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.parkingTBL;
import model.parkingTM;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class InParkingFormController implements Initializable {
    public AnchorPane InParking;
    public TableView tblParking;
    public TableColumn idVNumber;
    public TableColumn idVType;
    public TableColumn idParkingSlot;
    public TableColumn idParkTime;


    static ArrayList<parkingTBL> prl =new ArrayList<parkingTBL>();
    static ObservableList<parkingTM> obList= FXCollections.observableArrayList();



    public static void loader() {
        for (parkingTBL pr :prl
        ) {
            parkingTM tm=new parkingTM(pr.getvNumber(),pr.getvType(),pr.getpSlot(),pr.getpTime());
            obList.add(tm);
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idVNumber.setCellValueFactory(new PropertyValueFactory("num"));
        idVType.setCellValueFactory(new PropertyValueFactory("tp"));
        idParkingSlot.setCellValueFactory(new PropertyValueFactory("st"));
        idParkTime.setCellValueFactory(new PropertyValueFactory("tm"));
        tblParking.setItems(obList);
        loader();
    }
}
