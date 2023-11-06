package HW17.src;

/* Создать класс Cube, описывающий куб cо стороной a.
Реализовать в нем методы определения площади s (сумма площадей всех граней) и объема v. Создать приложение CubeAppl,
в котором создать несколько экземпляров класса Cube. Для каждого экземпляра вызвать методы класса Cube и рассчитать s и v.
 */
 public class Cube {
     private int side;

     public Cube(int side){
         this.side = side;
     }

    public int getSide() {
        return side;
    }

    public double getSquare() {
         return 6*side * side;
     }
     public double getVolume() {
         return side*side*side;
     }


}
