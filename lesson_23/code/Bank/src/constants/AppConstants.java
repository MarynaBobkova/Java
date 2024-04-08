package constants;

/**
 * @author Andrej Reutow
 * created on 06.10.2023
 */
public class AppConstants {

    public static final String PIN_ERROR = "Неправильный пин-код";

    /**
     * Количесвто карт которое может хранить наш банк (class Bank)
     */
    public static final int DEFAULT_CARDS_SIZE = 50;

    public static final String FUNDS_ERROR_MESSAGE = "У вас не достаточно средств для выполнения этой операции";

    public static final String CLIENT_AMOUNT_LIMIT = "Банк больше не принимает новых клиентов";

    public static final String CARD_FOUND_MESSAGE = "Карта с номером: ";

    public static final String BALANCE_ERROR_MESSAGE = "На счету не достаточно средств";
    public static final String BALANCE_INFO = "Текущий баланс: ";
}
