package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class Language extends EntityClass {
    private StringProperty name = new SimpleStringProperty();

    public Language(String name) {
        super();
        this.name.set(name);
    }

    public Language(int id, String name) {
        super(id);
        this.name.set(name);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    @Override
    public String toString(){
        return getName();
    }
}
