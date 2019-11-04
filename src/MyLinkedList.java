/**
 * Created by yuliav on 01/10/2019.
 */
public class MyLinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public Node add(int elem) {
        Node newNode = new Node(elem);
        if (head == null || tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return newNode;
    }

    public int size(){
        return size;
    }

    public Node deleteByIndex(int ind){
        Node temp = head;
        if (ind > this.size() -1){
            return null;
        }
        else if (ind == 0){
            head = temp.next;
        }

        for (int i = 0; i < ind -1 ; i++) {
            temp = temp.next;
        }
        if(ind == size -1){
            tail = temp;
        }
        Node temp2 = temp.next;
        temp.next = temp2.next;
        return temp;
    }


    public Node deleteElem(int elem) {
        Node currNode = head;
        for (int i = 0; i < this.size(); i++) {
            if (currNode.data == elem) {
                if (currNode == head) {
                    head = currNode.next;
                } else if (currNode == tail) {
                    tail = this.get(i-1);
                    tail.next = null;
                } else {
                    this.get(i - 1).next = this.get(i + 1);
                }
                size--;
                break;
            }
            currNode = currNode.next;

        }
        return currNode; //w/o get(i)
    }

    public Node find(int elem){
        Node currNode = head;
        for (int i = 0; i < this.size(); i++) {
            if (currNode.data == elem){
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
    }

    public int indexOf(int elem) {
        Node currNode = head;
        for (int i = 0; i < this.size(); i++) {
            if (currNode.data == elem){
                return i;
            }
            currNode = currNode.next;

        }
        return -1;
    }

    public Node get(int ind) {
        Node currNode = head;
        int i = 0;
        while (i < ind & currNode!= null){
            currNode = currNode.next;
            i ++;
        }
        return currNode;
    }


    public  void iterativeReverse() {
       Node currNode = head;
       Node prev = null;
       Node next;
       tail = head;
       while(currNode != null){
           next = currNode.next;
           currNode.next = prev;
           prev = currNode;
           currNode = next;
       }
       head = prev;
    }


    @Override
    public String toString() {
        if (head == null)
            return "{}";
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Node currNode = head;
        while (currNode != null) {
            sb.append(currNode.data);
            if (currNode != tail) {
                sb.append(", ");
            }
            currNode = currNode.next;
        }
        sb.append("}");
        return sb.toString();
    }
}
