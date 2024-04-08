/**
 * @author Andrej Reutow
 * created on 15.09.2023
 */

//    У Пети есть два ведра: одно пустое, а в другом 100 яблок.
//    Ваша задача помочь Пете переложить все яблоки из полного ведра в пустое.
//    Как только все яблоки будут переложены, Петя может идти гулять.
//    Требования:
//      Используйте цикл while для перекладывания яблок.
//      После каждого перекладывания яблока выводите количество оставшихся яблок в полном ведре и количество яблок в пустом ведре.
//      Когда все яблоки будут переложены, выведите сообщение, что Петя может идти гулять
public class BucketTask {

    public static void main(String[] args) {
        int bucketA = 100; // полное ведро
        int bucketB = 0; // пустое ведро

        // 1 - bucketA <= 100 - true
        // 1 - {bucketA = 100 - 1, bucketA = 0 + 1 ...}
        // 2 - bucketA <= 100 = (bucketA - 99, bucketB - 1)


//        while (bucketA <= 100 & bucketB <= 99) {
//            bucketA -= 1;
//            bucketB += 1;
//            System.out.println("В ведре А " + bucketA + " яблок");
//            System.out.println("В ведре B " + bucketB + " яблок");
//        }

//        while (bucketA != 0) {
//            bucketA -= 1;
//            bucketB += 1;
//            System.out.println("В ведре А " + bucketA + " яблок");
//            System.out.println("В ведре B " + bucketB + " яблок");
//        }

        while (bucketB != 100) {
            bucketA -= 1;
            bucketB += 1;
            System.out.println("В ведре А " + bucketA + " яблок");
            System.out.println("В ведре B " + bucketB + " яблок");
        }
    }
}
