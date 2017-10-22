/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfxml;

import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author youmayosh
 */
public class FXMLLatihanController implements Initializable {

    @FXML
    private TextField textnama;

    @FXML
    private TextField textalamat;

    @FXML
    private TextField textabsen;

    @FXML
    private TextField textelepon;

    @FXML
    private Button buttonProses;

    @FXML
    private JFXTextArea textProses;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
            String nama = textnama.getText();
            String alamat = textalamat.getText();
            String absen = textabsen.getText();
            String telepon  = textelepon.getText();
            
            textProses.setText("Nama Anda : "+nama+"\n"+"Alamat : "+alamat+"\n"+"Absen : "+absen+
                    "\n"+"No Telepon : "+telepon+"\n");
    }
    @FXML
    void Hapus(ActionEvent event) {
       textProses.setText("");
       textnama.setText("");
       textalamat.setText("");
       textabsen.setText("");
       textelepon.setText("");
    }
    
}
