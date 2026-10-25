package cse213.calculatormaking;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculatorController
{
    @javafx.fxml.FXML
    private Label outputLable;
    @javafx.fxml.FXML
    private TextField input1TF;
    @javafx.fxml.FXML
    private TextField input2TF;

    @javafx.fxml.FXML
    public void initialize() {
    }

//    @Deprecated
//    public void buttonOnAction(ActionEvent actionEvent) {
//
//
//        String input = input1TF.getText();
//        outputLable.setText(input);
//
//        String input2 = input2TF.getText();
//        outputLable.setText(input2);
//
//    }

//    @javafx.fxml.FXML
//    public void buttonOnActionSecond(ActionEvent actionEvent) {
//
//    }

    @javafx.fxml.FXML
    public void buttonOnActionFirst(ActionEvent actionEvent) {
        String input1 = input1TF.getText();
        outputLable.setText(input1);
    }


    @javafx.fxml.FXML
    public void buttonOnActionSecond(ActionEvent actionEvent) {
        String input2 = input2TF.getText();
        outputLable.setText(input2);

    }

}


