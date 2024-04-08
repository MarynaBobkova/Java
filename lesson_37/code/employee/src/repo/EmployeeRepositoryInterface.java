package repo;

import entity.BaseEmployee;

import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Интерфейс для репозитория работников.
 */
public interface EmployeeRepositoryInterface {

    /**
     * Добавляет работника в репозиторий.
     *
     * @param employee Добавляемый работник.
     */
    boolean addEmployee(BaseEmployee employee);

    /**
     * Удаляет работника из репозитория по его ID.
     *
     * @param id ID работника, которого необходимо удалить.
     */
    boolean removeEmployee(int id);

    /**
     * Ищет работника в репозитории по его ID.
     *
     * @param id ID работника, которого необходимо найти.
     * @return Найденный работник или null, если работник не найден.
     */
    BaseEmployee findEmployeeById(int id);

    /**
     * Получает массив всех работников в репозитории.
     *
     * @return Массив всех работников в репозитории.
     */
    BaseEmployee[] getAllEmployees();

    /**
     * Возвращает количество работников в репозитории.
     *
     * @return Количество работников в репозитории.
     */
    int countEmployees();

    /**
     * Метод сортирует массив работников на основе компаратора
     *
     * @param comparator определят как сравнивать объекты
     * @return отсортированный массив
     */
    BaseEmployee[] sortByComparator(Comparator<BaseEmployee> comparator);

    /**
     * Метод возвращает список рабтников которые были устроены на работу в указанном диапозоне времени (годах)
     *
     * @param fromYear от какого годо
     * @param toYear   до какого годо
     * @return отфильтрованный массив
     */
//    BaseEmployee[] filterByHireYear(int fromYear, int toYear);

//    BaseEmployee[] filterBySalary(double fromSalary, double toSalary);

    BaseEmployee[] filterBy(Predicate<BaseEmployee> predicate);
}
