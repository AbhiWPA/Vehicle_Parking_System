package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.Loader;

import java.io.IOException;

public class ParkingSystemFormController implements Loader {
    public AnchorPane inParking;
    public JFXComboBox cbxSelected;
    public JFXButton btnLogOut;
    public JFXButton btnAddVehicle;
    public JFXButton btnAddDriver;

    String[] select = {"In Parking", "On Delivery"};

    public void initialize(){
        setSelection();
    }

    private void setSelection() {
        cbxSelected.getItems().addAll(select);

        cbxSelected.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue ) -> {

        if (newValue == "On Delivery"){
            try {
                loadUi("OnDeliveryForm");
                btnLogOut.setVisible(false);
                btnAddDriver.setLayoutX(480);
                btnAddVehicle.setLayoutX(346);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if (newValue == "In Parking"){
            try {
                loadUi("InParkingForm");
            } catch (IOException e) {
                e.printStackTrace();
            }
            btnLogOut.setVisible(true);
            btnAddDriver.setLayoutX(401);
            btnAddVehicle.setLayoutX(286);
        }
        });
    }

    @Override
    public void loadUi(String location) throws IOException {
        inParking.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"));
        inParking.getChildren().add(parent);
    }

    public void addVehicleOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../view/AddVehicleForm.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setTitle("Add New Vehicle");
        stage2.show();
    }

    public void addDriverOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../view/AddDriverForm.fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setTitle("Add New Driver");
        stage2.show();
    }

    public void logOutOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) btnLogOut.getScene().getWindow();
        stage.close();
    }
}
