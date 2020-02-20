package gw;

import models.Language;

public class LanguageGatway extends SimpleGateway<Language> {
    public LanguageGatway(){
        insert(new Language("Русский"));
        insert(new Language("Английский"));
    }
}
