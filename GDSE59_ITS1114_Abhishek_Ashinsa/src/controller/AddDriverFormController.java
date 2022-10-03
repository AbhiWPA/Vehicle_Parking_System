package controller;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import model.Driver;
import util.Loader;

import java.io.IOException;

public class AddDriverFormController {

    public JFXTextField idName;
    public JFXTextField idNic;
    public JFXTextField idLNum;
    public JFXTextField idContact;
    public JFXTextArea idAddress;
    public AnchorPane context;


    public void btnAdd(ActionEvent actionEvent) {
        String dName=idName.getText();
        String dNic=idNic.getText();
        String dLNum=idLNum.getText();
        String dAddress=idAddress.getText();
        String dContact= idContact.getText();

        Driver d=new Driver(dName,dNic,dLNum,dAddress,dContact);

    }

    public void btnCancel(ActionEvent actionEvent) throws IOException {
        idName.clear();
        idNic.clear();
        idLNum.clear();
        idContact.clear();
        idAddress.clear();
    }
}
