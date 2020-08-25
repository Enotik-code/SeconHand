package by.seconhand.telegram.dispatcher;

import by.seconhand.bean.Client;
import by.seconhand.service.ClientService;
import by.seconhand.telegram.bot.BotCommand;
import by.seconhand.telegram.processors.*;
import by.seconhand.telegram.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import static by.seconhand.telegram.bot.BotCommand.*;


@Service
public class RequestDispatcher {
    public static Long chatId = 0L;
    public static String ApiTalkMe = new String();
    public static String ApiMyClass = new String();

    @Autowired
    private MessageService messageService;

    @Autowired
    private HelpProcessor helpProcessor;

    @Autowired
    private SettingProcessor settingProcessor;

    @Autowired
    private StartProcessor startProcessor;

    @Autowired
    private InfoProcessor infoProcessor;

    @Autowired
    private GoProcessor goProcessor;

    @Autowired
    private ClientService clientService;

   // @Autowired
   // private TelegramService telegramService;

    public void dispatch(Update update) {
        chatId = update.getMessage().getChatId();
        //telegramService.saveClient(telegramService.buildNewClient(chatId));
        //if(telegramService.getClient(chatId).getTypeSubscribe().equals("Test time")) {
            switch (getCommand(update)) {
                case HELP:
                    //System.out.println(update.getMessage().getContact().getPhoneNumber());
                    messageService.sendMessage(chatId, helpProcessor.run());
                    break;
                case START:
                    messageService.sendMessage(chatId, startProcessor.run());
                    break;
                case SETTING:
                    messageService.sendMessage(chatId, settingProcessor.run());
                    break;
                case GO:
                    messageService.sendMessage(chatId, goProcessor.run());
                    break;
                case INFO:
                    clientService.saveClient(Client.builder()
                            .id(chatId)
                            .build());
                    messageService.sendMessage(chatId, infoProcessor.run());
                    break;
            }
        //}
        //else   messageService.sendMessage(chatId, noSubscribeProcessor.run());
    }

    private BotCommand getCommand(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message != null && message.hasText()) {
                String msgText = message.getText();
                if (msgText.startsWith(HELP.getCommand())) {
                    return HELP;
                } else if (msgText.startsWith(START.getCommand())) {
                    return START;
                } else if (msgText.startsWith(SETTING.getCommand())) {
                    return SETTING;
                }else if (msgText.startsWith(GO.getCommand())) {
                    return GO;
                }else if (msgText.startsWith(INFO.getCommand())) {
                    return INFO;
                }
            }
        }
        return NONE;
    }
}