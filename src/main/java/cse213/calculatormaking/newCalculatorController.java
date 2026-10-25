package cse213.calculatormaking;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class newCalculatorController
{
    @javafx.fxml.FXML
    private TextField number2TF;
    @javafx.fxml.FXML
    private TextField number1TF;
    @javafx.fxml.FXML
    private Label outputLable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void mulButton(ActionEvent actionEvent) {
        int number1 = Integer.parseInt(number1TF.getText());
        int number2 = Integer.parseInt(number2TF.getText());
        int result = number1*number2;
        String resultstr = Integer.toString(result);
        System.out.println(result);

        outputLable.setText(resultstr);


    }

    @javafx.fxml.FXML
    public void subButton(ActionEvent actionEvent) {
        int number1 = Integer.parseInt(number1TF.getText());
        int number2 = Integer.parseInt(number2TF.getText());
        int result = number1-number2;
        String resultstr = Integer.toString(result);
        System.out.println(result);

        outputLable.setText(resultstr);


    }

    @javafx.fxml.FXML
    public void additionButton(ActionEvent actionEvent) {
        String number1 = number1TF.getText();
        String number2 = number2TF.getText();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = a+b;
        String result = Integer.toString(c);
        System.out.println(c);
        outputLable.setText(result);

    }

    @javafx.fxml.FXML
    public void diviButton(ActionEvent actionEvent) {
        int number1 = Integer.parseInt(number1TF.getText());
        int number2 = Integer.parseInt(number2TF.getText());
        int result = number1 / number2;
        String resultstr = Integer.toString(result);
        System.out.println(result);

        outputLable.setText(resultstr);


    }
}