package Employee;
// Определяет методы, которые должны быть реализованы в классе EmployeeRepository
// для управления данными о работниках.
//Включает методы для добавления, удаления, поиска, получения списка всех
// работников и получения количества работников.

public interface EmployeeRepositoryInterface {
    boolean add(Employee employee);
    boolean remove(int id);
    Employee[] getAll();
    Employee findById(int id);

}
