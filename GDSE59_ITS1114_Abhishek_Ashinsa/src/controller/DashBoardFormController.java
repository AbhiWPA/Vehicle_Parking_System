package controller;

import com.jfoenix.controls.JFXComboBox;
import db.Database;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.OnDelivery;
import model.parkingTBL;
import util.Loader;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DashBoardFormController implements Loader {
    public Label lblDate;
    public Label lblTime;
    public AnchorPane context1;
    public Text txtParkingSlot;
    public JFXComboBox cbxVehicle;
    public Label lblVehicleType;
    public JFXComboBox cbxDriver;

    String s1 = "0"; String s2 = "0"; String s3 = "0"; String s4 = "0"; String s5 = "0"; String s6 = "0";
    String s7 = "0"; String s8 = "0"; String s9 = "0"; String s10 = "0"; String s11 = "0"; String s12 = "0"; String s13 = "0";

    String[] vehicle = {"NA-3434","KA-4563","58-3567","GF-4358","CCB-3568","LM-6679","QA-3369","KB-3668","JJ-9878","GH-5772","XY-4456","YQ-3536","CBB-3566","QH-3444"};
    String[] drivers = {"Sumith Kumara","Amila Pathirana","Jithmal Perera","Sumith Dissanayaka","Suamanasiri Herath","Awantha Fernando","Charith Sudara","Prashan Dineth",
            "Chethiya Dilan","Dushantha Perera","Sumith Udayanga","Dinesh Udara","Udana Chathuranga","Mohommad Riaz","Sandun Kuamara","Priyanga Perera"};

    public void initialize() {
        RunningTime();
        showDate();
        setVehicles();
        driversComboBox();
    }

    private void showDate() {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            lblDate.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    private void RunningTime() {
        final Thread thread = new Thread(()->{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm aa ");
            while (true){
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                final String times=simpleDateFormat.format(new Date());
                Platform.runLater(()->{
                    lblTime.setText(times);
                });
            }
        });
        thread.start();
    }

    public void setVehicles(){

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        String time= String.valueOf(date);


        cbxVehicle.setPromptText("Select Vehicle Number");
        cbxVehicle.getItems().addAll(vehicle);

        cbxVehicle.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue ) -> {
            if (newValue == vehicle[0]) {
                lblVehicleType.setText("Bus");
                txtParkingSlot.setText("14");
                String selected = newValue.toString();
                String vehi="Bus";
                String slt="14";
                parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                InParkingFormController.prl.add(p);
                OnDeliveryFormController.vNumber=selected;
                OnDeliveryFormController.vType="Bus";
                OnDeliveryFormController.dTime=time;

            } else {
                if (newValue == vehicle[1] || newValue == vehicle[2] || newValue == vehicle[3] || newValue == vehicle[4] || newValue == vehicle[5] || newValue == vehicle[6]) {
                    lblVehicleType.setText("Van");
                    String selected = newValue.toString();
                    String vehi="Van";
                    if (s1.equals("0")) {
                        String slt="01";
                        txtParkingSlot.setText(slt);
                        s1 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Van";
                        OnDeliveryFormController.dTime=time;
                    } else if (s2.equals("0")) {
                        String slt="02";
                        txtParkingSlot.setText(slt);
                        s2 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Van";
                        OnDeliveryFormController.dTime=time;
                    } else if (s3.equals("0")) {
                        String slt="03";
                        txtParkingSlot.setText(slt);
                        s3 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Van";
                        OnDeliveryFormController.dTime=time;
                    } else if (s4.equals("0")) {
                        String slt="04";
                        txtParkingSlot.setText(slt);
                        s4 =slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Van";
                        OnDeliveryFormController.dTime=time;
                    } else if (s5.equals("0")) {
                        String slt="12";
                        txtParkingSlot.setText(slt);
                        s5 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Van";
                        OnDeliveryFormController.dTime=time;
                    } else if (s6.equals("0")) {
                        String slt="13";
                        txtParkingSlot.setText(slt);
                        s6 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Van";
                        OnDeliveryFormController.dTime=time;
                    }


                } else {
                    lblVehicleType.setText("Cargo Lorry");
                    String selected = newValue.toString();
                    String vehi="Cargo Lorry";

                    if (s7.equals("0")) {
                        String slt="05";
                        txtParkingSlot.setText(slt);
                        s7 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Cargo Lorry";
                        OnDeliveryFormController.dTime=time;

                    } else if (s8.equals("0")) {
                        String slt="06";
                        txtParkingSlot.setText(slt);
                        s8 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Cargo Lorry";
                        OnDeliveryFormController.dTime=time;

                    } else if (s9.equals("0")) {
                        String slt="07";
                        txtParkingSlot.setText(slt);
                        s9 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Cargo Lorry";
                        OnDeliveryFormController.dTime=time;

                    } else if (s10.equals("0")) {
                        String slt="08";
                        txtParkingSlot.setText(slt);
                        s10 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Cargo Lorry";
                        OnDeliveryFormController.dTime=time;

                    } else if (s11.equals("0")) {
                        String slt="09";
                        txtParkingSlot.setText(slt);
                        s11 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Cargo Lorry";
                        OnDeliveryFormController.dTime=time;

                    } else if (s12.equals("0")) {
                        String slt="10";
                        txtParkingSlot.setText(slt);
                        s12 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Cargo Lorry";
                        OnDeliveryFormController.dTime=time;

                    } else if (s13.equals("0")) {
                        String slt="11";
                        txtParkingSlot.setText(slt);
                        s12 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        InParkingFormController.prl.add(p);
                        OnDeliveryFormController.vNumber=selected;
                        OnDeliveryFormController.vType="Cargo Lorry";
                        OnDeliveryFormController.dTime=time;

                    }
                }
            }
        });

    }


    public void driversComboBox() {

       cbxDriver.getItems().addAll(drivers);
        cbxDriver.setPromptText("Select Name");

        cbxDriver.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String dSelected = newValue.toString();
            OnDeliveryFormController.dName=dSelected;
        });

    }


    public void managementLoginOnAction(ActionEvent actionEvent) throws IOException {
        loadUi("ManagementLoginForm");
    }

    @Override
    public void loadUi(String location) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.setTitle(location);
        stage.show();
    }

    public void onDeliveryShiftOnAction(ActionEvent actionEvent) {


    }
}
