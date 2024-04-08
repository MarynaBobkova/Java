package service;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public interface IKontaktService {

    String addKontakt(String name);

    String[] getAllKontakts();
}
