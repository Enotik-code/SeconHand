package by.seconhand.telegram.buttons;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

@Service
public class ButtonService {

    public synchronized void setButtonsAfterStart(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        List<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardStart = new KeyboardRow();
        keyboardStart.add(new KeyboardButton("Погнали"));
        keyboard.add(keyboardStart);
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    public synchronized void setButtonsAfterSecondMessage(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardStart = new KeyboardRow();
        keyboardStart.add(new KeyboardButton("Каталог"));

        KeyboardRow keyboardCategory = new KeyboardRow();
        keyboardCategory.add(new KeyboardButton("Категории"));

        KeyboardRow keyboardInfo = new KeyboardRow();
        keyboardCategory.add(new KeyboardButton("Моя информация"));

        KeyboardRow keyboardOrder = new KeyboardRow();
        keyboardCategory.add(new KeyboardButton("Мои заказы"));

        keyboard.add(keyboardStart);
        keyboard.add(keyboardCategory);
        keyboard.add(keyboardInfo);
        keyboard.add(keyboardOrder);

        replyKeyboardMarkup.setKeyboard(keyboard);
    }

}
