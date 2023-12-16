package hust.soict.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Painter extends Application {
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(new URL("file:" + "D:\\TH_OOP\\IT3103.732874.2023.1.20215109.NguyenThiNhung\\Lab_05\\src\\main\\java\\hust\\soict\\javafx\\Painter.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Painter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
