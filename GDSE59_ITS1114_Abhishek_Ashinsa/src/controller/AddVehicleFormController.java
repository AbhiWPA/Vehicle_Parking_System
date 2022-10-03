package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import model.Vehicle;

import java.net.URL;
import java.util.ResourceBundle;

public class AddVehicleFormController implements Initializable {
    public JFXTextField idVNumber;
    public JFXTextField idMWeight;
    public JFXTextField idPassenger;
    public JFXComboBox idVType;

    public void btnAdd(ActionEvent actionEvent) {
        idVType.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String nType = newValue.toString();

            String nNum = idVNumber.getText();
            String nWeight = idMWeight.getText();
            String nPassenger = idPassenger.getText();

            Vehicle vn = new Vehicle(nNum, nType, nWeight, nPassenger);


        });

    }

    public void btnCancel(ActionEvent actionEvent) {

        idVNumber.clear();
        idMWeight.clear();
        idPassenger.clear();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] arr={"Bus","Van","Cargo Lorry"};
        idVType.setPromptText("Select Type");
        idVType.getItems().addAll(arr);

    }
}
