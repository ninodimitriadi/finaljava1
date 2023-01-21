import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
            private Label number;
    @FXML
            private TextArea text;

    int sum = 0;
    int prod = 1;
    Random random = new Random();
    int rand =  random.nextInt(2000 - 1000) + 1000;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onClick(){
        number.setText("გენერირებული რენდომ რიცხვია: " + rand);
        while (rand > 0) {
            sum += rand % 10;
            prod *= rand % 10;
            rand /= 10;
        }
        text.setText(rand + "-ის ციფრთა ჯამია: " + sum + "\n" + rand + "-ის ციფრთა ნამრავლია: " + prod);
    }


}
