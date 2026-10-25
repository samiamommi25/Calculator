module cse213.calculatormaking {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.calculatormaking to javafx.fxml;
    exports cse213.calculatormaking;
}