/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanJFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author youmayosh
 */
public class FXMLLatihanController implements Initializable {

       String pin ="";
       String PIN ="1234";
       int tmp;
       int kesempatan=3;
       
    @FXML
    private PasswordField editPin;
    @FXML
    private Button Button1;
    @FXML
    private Button Button2;
    @FXML
    private Button Button3;
    @FXML
    private Button Button4;
    @FXML
    private Button Button5;
    @FXML
    private Button Button6;
    @FXML
    private Button Button7;
    @FXML
    private Button Button8;
    @FXML
    private Button Button9;
    @FXML
    private Button ButtonC;
    @FXML
    private Button Button0;
    @FXML
    private Button ButtonOK;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Push1(ActionEvent event) {
        pin += "1";
        editPin.setText(pin);
    }

    @FXML
    private void Push2(ActionEvent event) {
          pin += "2";
        editPin.setText(pin);
    }

    @FXML
    private void Push3(ActionEvent event) {
          pin += "3";
        editPin.setText(pin);
    }

    @FXML
    private void Push4(ActionEvent event) {
          pin += "4";
        editPin.setText(pin);
    }

    @FXML
    private void Push5(ActionEvent event) {
          pin += "5";
        editPin.setText(pin);
    }

    @FXML
    private void Push6(ActionEvent event) {
          pin += "6";
        editPin.setText(pin);
    }

    @FXML
    private void Push7(ActionEvent event) {
          pin += "7";
        editPin.setText(pin);
    }

    @FXML
    private void Push8(ActionEvent event) {
          pin += "8";
        editPin.setText(pin);
    }

    @FXML
    private void Push9(ActionEvent event) {
          pin += "9";
        editPin.setText(pin);
    }

    @FXML
    private void PushC(ActionEvent event) {
          pin += "";
          editPin.setText("");
    }

    @FXML
    private void Push0(ActionEvent event) {
          pin += "0";
        editPin.setText(pin);
    }

    @FXML
    private void PushOK(ActionEvent event) {
        if (pin.equals(PIN)){
            try{
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            }   catch (IOException e){
                    System.out.println("Failed to Create new Window." + e);
            }
        }   else{
                kesempatan -= 1;
                JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa " + kesempatan +"Kesempatan Lagi!");
                editPin.setText("");
                pin="";
                if(kesempatan == 0) {
                    System.exit(0);
                }
        }
    }
    
}
