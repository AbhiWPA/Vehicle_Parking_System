package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.ParallelTransition;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import util.Loader;

import java.io.IOException;
import java.util.stream.Stream;

public class ManagementLoginFormController implements Loader {
    public AnchorPane context;
    public JFXTextField txtUserName;
    public JFXPasswordField txtPassword;
    public JFXButton btnLogin;

    String uName="abhishek";
    String pWord="abhishek";

    public void btnCancelOnAction(ActionEvent actionEvent) {
        txtUserName.clear();
        txtPassword.clear();
    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
       String name=txtUserName.getText();
       String word=txtPassword.getText();
       if(name.equals(uName) && word.equals(pWord)) {
           loadUi("ParkingSystemForm");
       }else{
           new Alert(Alert.AlertType.WARNING, "Incorrect User Name or Password, Try again!", ButtonType.OK).show();
       }
    }

    @Override
    public void loadUi(String location) throws IOException {

        Stage  stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();

        Parent parent = FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"));
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(parent));
        stage2.setTitle(location);
        stage2.show();

    }
}
