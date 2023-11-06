package Employee;
//Описывает общие характеристики для всех работников.
//Содержит методы, такие как getName(), getId(),
// calculateSalary(), которые будут реализованы в подклассах.
//6*. Нужно написать метод, который будет возвращать всех работников чья зарплата находится в диапозоне от и до.
//7*. Нужно написать метод, который будет возвращать всех работников которые были устроены на работу в диапозоне от и до.
//* Метод должен принимать параметры "от" и "до" для указания диапазона


import java.util.Arrays;
public class EmployeeRepository implements EmployeeRepositoryInterface {
    Employee[] arrayEmployees = new Employee[10];
    static int counterId = 156789;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeRepository that = (EmployeeRepository) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(arrayEmployees, that.arrayEmployees);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrayEmployees);
    }

    //boolen add (Emp emp){
    //	// проверка куда установить и есть ли место
    //	emp.setId(++counterId) // counterId был 156789, emp установится 156790
    //	Emp[] source[] = emp;
    //	sout()
    //
    //	return emp;
    //}

    @Override
    public boolean add (Employee employee) {

        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i] == null) {
                arrayEmployees[i] = employee;
                employee.setId(++counterId);
                System.out.println("Сотрудник принят на работу " + employee.toString());
                return true;
            }

        }
        System.out.println("Сотрудник не принят на работу " + employee);
        return false;
    }

    @Override
    public boolean remove(int id) {
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i].getId() == id) {
                arrayEmployees[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee[] getAll() {
        int counter = 0;
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i] != null) {
                counter++;}
        }
        Employee[] currentEmployees = new Employee[counter];
        for (int i = 0; i < arrayEmployees.length; i++) {
            if (arrayEmployees[i] != null){
                    currentEmployees[i] = arrayEmployees[i];
            }
        }
        return currentEmployees;
    }

    @Override
    public Employee findById(int id) {
        for (int i = 0; i < arrayEmployees.length; i++) {
            Employee currentEmployee = arrayEmployees[i];
            if (currentEmployee != null && id == currentEmployee.getId()) {
                return currentEmployee;
            }
        }
        return null;
    }

    public Employee[] getArrayEmployees() {
        return arrayEmployees;
    }

}
