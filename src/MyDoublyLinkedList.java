public class MyDoublyLinkedList {

private DoubleNode head = null;
private DoubleNode tail = null;
private int size = 0;

    public DoubleNode add(int elem) {
        DoubleNode newNode = new DoubleNode(elem);
        if (head == null || tail == null) {
            newNode.prev = null;
            head = newNode;
            tail = newNode;
            newNode.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        size++;
        return newNode;
    }

    public int size(){
        return size;
    }

    public DoubleNode delete(int ind){

        if(ind == size -1){
            DoubleNode currNode = tail;
            tail = tail.prev;
            tail.next = null;
            size = size - 1;
            return currNode;
        }

        DoubleNode currNode;
        if (ind > this.size() -1){
            return null;
        }
        if (ind < size/2){
             currNode = head;
            int i = 0;
            while (i < ind){
                currNode = currNode.next;
                i++;
            }
        }else {
             currNode = tail;
            int i = size - 1;
            while (ind > i) {
                currNode = currNode.prev;
                i--;
            }
        }

        currNode.prev = currNode.next;
        size --;
        return currNode;
    }

    public DoubleNode deleteElem(int elem) {

        DoubleNode currNode = find(elem);

        if (currNode == null) {
            return null;
        }

        DoubleNode previous = currNode.prev;
        DoubleNode next = currNode.next;

        if (previous == null) {
            this.head = currNode.next;
            this.head.prev = null;
        }

        if (next == null) {
            this.tail = currNode.prev;
            this.tail.next = null;
        }

        else {
            DoubleNode temp = currNode.prev;
            temp.next = currNode.next;
            temp = currNode.next;
            temp.prev = currNode.prev;
        }

        return currNode;
    }


    public DoubleNode find(int elem){
        DoubleNode currNode = head;
        for (int i = 0; i < this.size(); i++) {
            if (currNode.data == elem){
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
    }

    public int indexOf(int elem) {
    DoubleNode currNode = head;
        for(int i = 0; i < elem; i++){
            if(elem == currNode.data){
                return  i;
            }
            currNode = currNode.next;
        }
        return -1;
    }

        public DoubleNode get(int ind) {
        int i = 0;
        DoubleNode currNode;
        if (ind < size/2){
             currNode = head.next;
            while (i < ind){
                currNode = currNode.next;
                i++;
            }
        }else{
             currNode = tail.prev;
            while (i > size/2){
                currNode = currNode.prev;
                i--;
            }
        }
        return currNode;
        }

        public void reverse() {

        }


        @Override
        public String toString() {
            if (head == null)
                return "{}";
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            DoubleNode currNode = head;
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
