package chaotics.app.example.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by Hans on 18.04.2017.
 */
public class MainApp extends Application {
    /*
    Ohne die main-Methode kann der Compiler keine
    Fehler im Code erkennen. Im fertigem Programm
    wird diese entfernt und die Laufzeitumgebung
    startet das Programm automatisch von der
    start-Methode aus.
     */
    public static void main(String[] args) {
        /*ruft die start-Methode auf*/
        launch(args);
    }

    /*
    primary stage (ps) wird von der Laufzeitumgebung
    geliefert.
     */
    @Override
    public void start(Stage ps) {
        ps.setScene(new Scene(new VBox(new Text("Hello World"))));
    }
}
