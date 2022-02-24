package au.edu.unsw.infs2605.starterkit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author sharm
 */
public class CalculatorController {
       
    //define objects from GUI(FXML file)
    @FXML
    Text state;
    @FXML
    Text result;
    @FXML
    TextField numberOne;
    @FXML
    TextField numberTwo;
    @FXML
    Button add;
    @FXML
    Button subtract;
    @FXML
    Button multiply;
    @FXML
    Button divide;
    
    //see if the number is an integer
    public boolean nums(){
        try {
            Integer.parseInt(numberOne.getText());
        } catch(NumberFormatException e){
            return false; 
        } catch(NullPointerException e) {
        return false;
        }
        return true;
    }

    //calculator functions
    @FXML
    public void add(){
        if (nums()){
            int output = Integer.valueOf(numberOne.getText()) + Integer.valueOf(numberTwo.getText());
            state.setText("Result");
            result.setText(Integer.toString(output));
        }else{
            state.setText("Error");
            result.setText("Please enter numbers");
        }
    }
    @FXML
    public void subtract(){
        if (nums()){
            int output = Integer.valueOf(numberOne.getText()) - Integer.valueOf(numberTwo.getText());
            state.setText("Result");
            result.setText(Integer.toString(output));
        }else{
            state.setText("Error");
            result.setText("Please enter numbers");
        }
    }
    @FXML
    public void multiply(){
        if (nums()){
            int output = Integer.valueOf(numberOne.getText()) * Integer.valueOf(numberTwo.getText());
            state.setText("Result");
            result.setText(Integer.toString(output));
        }else{
            state.setText("Error");
            result.setText("Please enter numbers");
        }
    }
    @FXML
    public void divide(){
        if (nums()){
            double output = Double.valueOf(numberOne.getText()) / Double.valueOf(numberTwo.getText());
            state.setText("Result");
            result.setText(Double.toString(output));
        }else{
            state.setText("Error");
            result.setText("Please enter numbers");
        }
    }
}