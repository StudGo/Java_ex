package lab11.task;

public class task8 {
    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public class SinglyLinkedList {
        private Node head;

        public SinglyLinkedList() {
            head = null;
        }

        public void createHead(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        public void createTail(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node current = head;
            while (current != null) {
                sb.append(current.value);
                if (current.next != null) {
                    sb.append(" -> ");
                }
                current = current.next;
            }
            return sb.toString();
        }

        public void addFirst(int value) {
            createHead(value);
        }

        public void addLast(int value) {
            createTail(value);
        }

        public void insert(int index, int value) {
            if (index == 0) {
                addFirst(value);
            } else {
                Node newNode = new Node(value);
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    if (current == null) {
                        throw new IndexOutOfBoundsException("Invalid index");
                    }
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        public void removeFirst() {
            if (head == null) {
                throw new IllegalStateException("Empty list");
            }
            head = head.next;
        }

        public void removeLast() {
            if (head == null) {
                throw new IllegalStateException("Empty list");
            }
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }

        public void remove(int index) {
            if (head == null) {
                throw new IllegalStateException("Empty list");
            }
            if (index == 0) {
                removeFirst();
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    if (current == null) {
                        throw new IndexOutOfBoundsException("Invalid index");
                    }
                    current = current.next;
                }
                if (current.next == null) {
                    throw new IndexOutOfBoundsException("Invalid index");
                }
                current.next = current.next.next;
            }
        }
    }
}
