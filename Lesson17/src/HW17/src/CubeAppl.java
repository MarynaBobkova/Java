package HW17.src;

public class CubeAppl {
    public static void main(String[] args) {

        Cube cube1 = new Cube(3);
        Cube cube2 = new Cube(9);
        Cube cube3 = new Cube(4);

        printCube(cube1);
        printCube(cube2);
        printCube(cube3);
    }
    public static void printCube(Cube cube) {
        System.out.println("Side: " + cube.getSide());
        System.out.println("Square = " + cube.getSquare());
        System.out.println("Volume " + cube.getVolume());
        System.out.println();
    }
}
