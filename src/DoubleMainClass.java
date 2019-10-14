/**
 * Created by yuliav on 14/10/2019.
 */
public class DoubleMainClass {
    public static void main(String[] args) {
        MyDoublyLinkedList myDoubleList = new MyDoublyLinkedList();
        myDoubleList.add(4);
        myDoubleList.add(5);
        myDoubleList.add(8);
        //System.out.println(myList);
        // System.out.println(invertList(myList));
        System.out.println(myDoubleList);
        myDoubleList.add(9);
        System.out.println(myDoubleList);
        System.out.println(myDoubleList.indexOf(9));
        myDoubleList.reverse();
        System.out.println(myDoubleList);
    }
}
