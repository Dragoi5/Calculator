/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package au.edu.unsw.infs2605.starterkit;
import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author sharm
 */
public class HelloWorldController {
    @FXML
    private void switchToCalc() throws IOException {
        App.setRoot("Calculator");
    }
    
}
