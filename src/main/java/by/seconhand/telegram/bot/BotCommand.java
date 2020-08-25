package by.seconhand.telegram.bot;

public enum BotCommand {
    START("/start"),
    HELP("/help"),
    SETTING("/settings"),
    GO("Погнали"),
    INFO("Моя информация"),
    NONE("/none");

    String command;
    public String getCommand() {
        return command;
    }

    BotCommand(String command) {
        this.command = command;
    }
}