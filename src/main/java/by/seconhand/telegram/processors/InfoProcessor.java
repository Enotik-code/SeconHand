package by.seconhand.telegram.processors;

import by.seconhand.telegram.interfaces.Processor;
import org.springframework.stereotype.Service;

@Service
public class InfoProcessor implements Processor {

    @Override
    public String run() {
        return "Как тебя зовут?";
    }

    public String getLastName(){
        return "Номер телефона";
    }

    public String getAddress(){
        return "А куда нам доставлять?";
    }

}