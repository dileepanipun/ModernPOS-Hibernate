package lk.ijse.pos.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/HomePane.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.centerOnScreen();
            primaryStage.getIcons().add(new Image("/lk/ijse/pos/assest/stageIcon.png"));
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void Main(String args[]){
        launch(args);
    }
}
