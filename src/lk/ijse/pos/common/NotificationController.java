package lk.ijse.pos.common;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import org.controlsfx.control.Notifications;

import java.util.Optional;

public class NotificationController {
    public static void notification(){
        Notifications notifications = Notifications.create();
        notifications.graphic(new ImageView("/lk/ijse/pos/assest/close.png"));
    }
    public static ButtonType alertConfig(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm");
        alert.setContentText("Do you want to continue this process");
        Optional<ButtonType> buttonType = alert.showAndWait();
        return buttonType.get();
    }
}
