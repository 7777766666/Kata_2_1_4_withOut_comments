package app;

import app.config.AppConfig;
import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {       //запускаем 5 циклов
            AnimalsCage bean =              // Бин некого животного
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }
    }
}
