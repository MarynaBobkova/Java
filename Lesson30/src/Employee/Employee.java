package Employee;
//Описывает общие характеристики для всех работников.
//Содержит методы, такие как getName(), getId(), calculateSalary(),
// которые будут реализованы в подклассах.

public interface Employee {
    String getName();
    int getId();
    void setId( int id);



}
