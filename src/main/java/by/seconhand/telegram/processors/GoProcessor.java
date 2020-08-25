package by.seconhand.telegram.processors;

import by.seconhand.telegram.interfaces.Processor;
import org.springframework.stereotype.Service;

@Service
public class GoProcessor implements Processor {

    @Override
    public String run() {
        return "Выбери с чего мы начнём!";
    }
}
