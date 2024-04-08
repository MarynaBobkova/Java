package service;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public interface IMessageService2 { // расширили интерфейс IMessageService за счет интерфейса IKontaktService

    // теперь в этом интерфейсе есть так же все методы интерфейса IKontaktService
    // все классы которые реализуют интерфейс IMessageService обязаны так же реализовать и все методы интерфейса IKontaktService

    boolean sendMessage(String message);

}
