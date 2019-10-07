import java.util.ArrayList;
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

        myList.deleteElem(8);
        System.out.println(myList);

    }

    public static MyLinkedList invertList(MyLinkedList list) {
        return null;
    }
}
