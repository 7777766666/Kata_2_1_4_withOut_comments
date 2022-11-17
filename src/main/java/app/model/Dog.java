package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public String toString() {       //переопределяем ToString для ДОГ
        return "I am a dog!";
    }
}
