import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuliav on 01/10/2019.
 */
public class MainClass {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        //Есть операция добавления в конец списка
        //удаления из списка - по номеру, по ссылке
        //нахождение элемента по номеру, возвращение количества элементов

        //O(1) int[] a = new int[5]; sout(a[3])
        // arrayList.indexOf(4)
        //O(n) arrayList.add(123)
        //O(n)

        //linkedList
        //add: O(1)
        //remove(Object o): O(1)
        //indexOf(): O(n)

        MyLinkedList myList = new MyLinkedList();
        myList.add(4);
        myList.add(5);
        myList.add(8);
        //System.out.println(myList);
       // System.out.println(invertList(myList));
        System.out.println(myList.size());
        myList.add(9);
//        System.out.println(myList.size());
//        System.out.println(myList.indexOf(5));
//        System.out.println(myList.indexOf(6));
//        System.out.println(myList.indexOf(8));
//        System.out.println(myList.get(2).data);
//        System.out.println(myList.get(20));

        myList.deleteElem(9);
        System.out.println(myList);

        int[] a = {0, 2, 4, 4, 15, 18, 43}; //O(log_2 n)
        System.out.println(Arrays.toString(a));
        int len = a.length;
        int ind1 = len / 2 - 1;
        int ind2 = len / 2;
        if (len % 2 != 0){
            ind2++;
        }

        for (int i = 0; i < len / 2; i++) {
            int temp = a[ind1 - i];
            a[ind1 - i] = a[ind2 + i];
            a[ind2 + i] = temp;
        }

        System.out.println(Arrays.toString(a));


        int c = 5, d = 7;
        int temp = c;
        c = d;
        d = temp;

    }

    public static MyLinkedList invertList(MyLinkedList list) {
        return null;
    }
}
