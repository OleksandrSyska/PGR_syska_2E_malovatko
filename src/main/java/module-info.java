module com.example.pgr_syska_2e_malovatko {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pgr_syska_2e_malovatko to javafx.fxml;
    exports com.example.pgr_syska_2e_malovatko;
}