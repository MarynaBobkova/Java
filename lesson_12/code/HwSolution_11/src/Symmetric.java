public class Symmetric {
    //"Симметричный ли массив?" Проверьте, является ли массив симметричным-
    // Симметричный массив выглядит одинаково при чтении слева направо и справа налево.
    public static void main(String[] args) {

        int array[] = new int[6];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 3;
        array[4] = 2;
        array[5] = 1;

        boolean b = true;

        for (int i = 0; i <= (array.length / 2); i++) {
            if (array[i] != array[array.length - 1 - i]) {
                b = false;
                break;
            }
        }
        if (!b) {
            System.out.println(" не симметричный массив");
        } else {
            System.out.println("  симметричный массив");
        }
    }
}
