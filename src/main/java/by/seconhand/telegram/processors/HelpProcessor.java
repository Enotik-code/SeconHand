package by.seconhand.telegram.processors;

import by.seconhand.telegram.interfaces.Processor;
import org.springframework.stereotype.Service;

@Service
public class HelpProcessor implements Processor {

    @Override
    public String run() {
        return "Сам себе помоги";
    }
}
