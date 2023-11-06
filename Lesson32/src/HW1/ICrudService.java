package HW1;
// Напишите интерфейс для CRUD (С - Creat, R - Read, U - Update, D - Delete) операций. Интерфейс должен быть обобщенным
//
//Пример не обобщенного интерфейса:
//
//public interface ICrudService { // не обобщенный интерфейс с CRUD операциями над объектом типа Car
//
//    Car add();
//
//    Car get(Long id);
//
//    Car[] getAll();
//
//    Car edit(Long id);
//
//    boolean remove(Long id);
//
//}
//Создайте package entity и внутри этого package создайте эти класcы:
//Book c полями: int id, String title
//Animal, c полями: long id, String color
//Создайте несколько имплементаций обобщенного интерфейса для классов: Book, Animal.
//!!! Опционально - реализуйте методы в классах имплементаций
//В итоге у вас должны получится следующие методы (Achtung - это читы):

public interface ICrudService <ElementType, ElementIdType> {
    ElementType add();
    ElementType get(ElementIdType id);
    ElementType[] getAll();
    ElementType edit(ElementIdType id);
    boolean remove(ElementIdType id);

}
