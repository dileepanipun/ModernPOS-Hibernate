package lk.ijse.pos.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import lk.ijse.pos.common.NotificationController;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class HomePaneController implements Initializable {

    @FXML
    private JFXButton btnMinimize;

    @FXML
    void handleClose(ActionEvent event) {
        ButtonType buttonType = NotificationController.alertConfig();
        if (buttonType == ButtonType.OK){
            System.exit(0);
        }
    }

    @FXML
    void handleMinimize(ActionEvent event) {
        Stage stage = (Stage) btnMinimize.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
