package by.seconhand.telegram.processors;

import by.seconhand.telegram.interfaces.Processor;
import org.springframework.stereotype.Service;

@Service
public class StartProcessor implements Processor {

    @Override
    public String run() {
        return "Привет, это первый интернет-магазин секонд-хэнд в Telegram.\nУ меня очень много" +
                "вещей и мы обязательно тебе что-то подберём. Нажимай кнопку 'Погнали' и погнали!";
    }
}
