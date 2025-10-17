module com.example.sudoku_express {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.example.sudoku_express.Controllers to javafx.fxml;


    opens com.example.sudoku_express to javafx.fxml;
    exports com.example.sudoku_express;
}