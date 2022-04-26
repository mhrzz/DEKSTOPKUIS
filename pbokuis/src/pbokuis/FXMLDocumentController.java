/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbokuis;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


/**
 *
 * @author ajeng
 */
public class FXMLDocumentController implements Initializable {
    
   
     

    @FXML
    private Label label;

    @FXML
    private TextField tf_ukuran;

    @FXML
    private TextField tf_harga;

    @FXML
    private TextField tf_warna;

    @FXML
    private DatePicker tf_tanggal;

    @FXML
    private ComboBox<?> cb_jenis;
    
    @FXML
    private Button button;

    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       // label.setText("Hello World!");
       System.out.println(tf_ukuran.getText());
        System.out.println(tf_harga.getText());
        System.out.println(tf_warna.getText());
        System.out.println(tf_tanggal.getValue().toString());
        System.out.println(cb_jenis.getValue().toString());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ArrayList <String> list = new ArrayList<String>();
        list.add("ssd sata");
        list.add("ssd M.2 NVMe");
        list.add("ssd PCIe");
        list.add("ssd 2,5 inch");
        ObservableList items = FXCollections.observableArrayList(list);
        cb_jenis.setItems(items);
        // TODO
    }    
    
}