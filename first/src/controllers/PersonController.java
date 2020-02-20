package controllers;

import gw.Gateway;
import gw.LanguageGatway;
import gw.PersonGW;
import gw.SimpleGateway;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Language;
import models.Person;

public class PersonController {

    @FXML
    TextField firstNameTF;

    @FXML
    TextField secondNameTF;

    @FXML
    ComboBox<Language> languageComboBox;

    Gateway<Language> languageGateway = new LanguageGatway();
    Gateway<Person> personGateway = new PersonGW();

    @FXML
    public void initialize(){
        languageComboBox.setItems(FXCollections.observableArrayList(languageGateway.all()));
    }

    public void clickOk(){
        String first_name = firstNameTF.getText();
        String second_name = secondNameTF.getText();
        Language language = languageComboBox.getValue();

        Person person = new Person(first_name, second_name, language);
        personGateway.insert(person);

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Удачно сохранили");
        alert.setContentText("Content");
        alert.showAndWait();

        Stage stage = (Stage) secondNameTF.getScene().getWindow();
        stage.close();
    }

    public void clecikCancel(){
        Stage stage = (Stage) secondNameTF.getScene().getWindow();
        stage.close();
    }
}
