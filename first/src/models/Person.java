package models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class Person extends EntityClass {
    private StringProperty firstName = new SimpleStringProperty();
    private StringProperty secondName = new SimpleStringProperty();;
    private ObjectProperty<Language> language = new SimpleObjectProperty<>();

    public Person(String firstName, String secondName, Language language) {
        super();
        this.firstName.set(firstName); ;
        this.secondName.set(secondName);
        this.language.set(language);
    }

    public Person(int id, String firstName, String secondName, Language language) {
        super(id);
        this.firstName.set(firstName); ;
        this.secondName.set(secondName);
        this.language.set(language);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getSecondName() {
        return secondName.get();
    }

    public StringProperty secondNameProperty() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName.set(secondName);
    }

    public Language getLanguage() {
        return language.get();
    }

    public ObjectProperty<Language> languageProperty() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language.set(language);
    }

    @Override
    public String toString(){
        return getSecondName() + " " + getFirstName();
    }
}
