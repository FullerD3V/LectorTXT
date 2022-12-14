/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectortxt.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author alumno
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Button btn1, btn2, btn3, btn4;
    
    @FXML
    public void btn1OnAction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(lectortxt.LectorTXT.class.getResource("Ex1/FXML.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void btn2OnAction() throws IOException{
        Parent root = FXMLLoader.load(lectortxt.LectorTXT.class.getResource("Ex2/FXML.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void btn3OnAction() throws IOException{
        Parent root = FXMLLoader.load(lectortxt.LectorTXT.class.getResource("Ex3/FXML.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void btn4OnAction() throws IOException{
        Parent root = FXMLLoader.load(lectortxt.LectorTXT.class.getResource("Ex4/FXML.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
