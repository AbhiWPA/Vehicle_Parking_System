package db;

import controller.DashBoardFormController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import model.OnDelivery;

import java.util.ArrayList;

public class Database {

    public static ObservableList<OnDelivery> onDeliveryTable = FXCollections.observableArrayList();

    static {
        DashBoardFormController d1 = new DashBoardFormController();
        onDeliveryTable.add(
                new OnDelivery(d1.cbxVehicle.getValue(), d1.lblVehicleType.getText(), d1.cbxDriver.getValue(), d1.lblDate.getText(), d1.lblTime.getText())
        );
    }

}
