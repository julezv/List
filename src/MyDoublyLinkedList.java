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
            newNode.next = null;
            tail = tail.next;
        }
        size++;
        return newNode;
    }

    public int size(){
        return size;
    }

    public DoubleNode delete(int ind){
        DoubleNode currNode;

        if(ind == size -1){
            currNode = tail;
            tail = tail.prev;
            tail.next = null;
            size--;
            return currNode;
        }

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
            int i = size - 2;
            while (ind > i) {
                currNode = currNode.prev;
                i--;
            }
        }

        DoubleNode temp = currNode.prev;
        temp.next = currNode.next;
        temp = currNode.next;
        temp.prev = currNode.prev;
        size--;
        return currNode;
    }

    public DoubleNode deleteElem(int elem) {

        DoubleNode currNode = find(elem);

        System.out.println(currNode.data);

        if (currNode == null) {
            return null;
        }

        DoubleNode previous = currNode.prev;
        DoubleNode next = currNode.next;



        if (previous == null) {
            System.out.println(previous);
            // we are at head, shift head right
            head = currNode.next;
            head.prev = null;
        }

        else if (next == null) {
            //we are at tail, shift left
            tail = currNode.prev;
            tail.next = null;
        }

        else {
            DoubleNode temp = currNode.prev;
            temp.next = currNode.next;
            temp = currNode.next;
            temp.prev = currNode.prev;
        }
        size--;
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
            DoubleNode currNode = head;

            for (int i = 0; i < size -1; i++) {
                DoubleNode temp = currNode;
                currNode.prev = currNode.next;
                currNode.next = temp.prev;
                currNode = currNode.prev;
            }
            DoubleNode temp = head;
            head = tail;
            tail = temp;
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
