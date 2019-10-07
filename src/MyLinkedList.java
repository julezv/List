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
        size = 0;
        if (head == null)
            return 0;
        Node currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }
        return size;
    }

    public Node delete(int ind){
        if (ind > this.size() -1){
            return null;
        }
        Node currNode = this.get(ind);
        if(currNode == head){
            head = this.get(ind +1);
        }
        else if (currNode == tail){
            tail = this.get(ind -1);
            tail.next = null;
        }
        else{
            this.get(ind -1).next = this.get(ind+1);
        }
        size--;
        return currNode;
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
        return currNode;
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
