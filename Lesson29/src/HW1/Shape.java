package HW1;
// Создайте абстрактный класс Shape с типом поля double и абстрактными методами calcArea и calcPerimeter.
//Создать классы-наследники Circle, Triangle, Square.
//Убедитесь, что все классы правильно вычисляют площадь и периметр
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур.
//Добавьте в массив три круга, два треугольника и один квадрат.
//Выведи на печать площадь и периметр для каждой фигуры
//Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public abstract class Shape {


    public abstract double calcArea();


    public abstract double calcPerimeter();

    public abstract String name ();


}
