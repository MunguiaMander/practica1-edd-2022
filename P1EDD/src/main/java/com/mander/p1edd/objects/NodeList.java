package com.mander.p1edd.objects;

public class NodeList<T> {

    // POINTERS
    protected Node<T> head;
    protected Node<T> tail;
    private int size;

    public NodeList() {
        this.head = this.tail = null;
    }

    /**
     * method to check if list is empty
     * 
     * @return true if list is empty, false otherwise
     */
    public boolean isEmpty() {
        return this.tail == null;
    }

    /**
     * Method to add node at list head
     */
    public void addAtHead(T data) {
        if (isEmpty()) { // 1st step
            head = tail = new Node<T>(data); // 2 steps, declaration and initializations
        } else {
            head = new Node<T>(data, null, this.head); // 1 step, delcaration and initizlization
            head.getPrevious().setNext(head); // 1 step, set previous node's next to new node
        }
        this.size++;
    }

    /**
     * This method add a node at the start of the list
     * 
     * @param data the data for the new node
     */
    public void addAtTail(T data) {
        if (isEmpty()) {
            head = tail = new Node<T>(data);
        } else {
            tail = new Node<T>(data, this.tail, null);
            tail.getNext().setPrevious(tail);
        }
        this.size++;
    }

    /**
     * This method removes the first node of the list
     * 
     * @return the data of the removed node
     */
    public T deleteFromTail() {
        T data = this.tail.getData();
        if (this.tail == this.head) {
            this.head = this.tail = null;
        } else {
            this.tail = this.tail.getNext();
            this.tail.setPrevious(null);
        }
        this.size--;
        return data;
    }

    /**
     * This method deletes the last node of the list
     * 
     * @return
     */
    public T deleteFromHead() {
        T data = this.head.getData();
        if (this.tail == this.head) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.getPrevious();
            this.head.setNext(null);
        }
        this.size--;
        return data;
    }

    /**
     * This method deletes a node from the list
     * 
     * @param data
     */
    public void delete(T data) {
        if (!isEmpty()) {
            if (tail == head) {
                tail = head = null; // clear
            } else if (tail.getData().equals(data)) {
                tail = tail.getNext();
            } else {
                Node<T> previous, temporal;
                previous = tail;
                temporal = tail.getNext();
                while (temporal != null && !temporal.getData().equals(data)) {
                    previous = previous.getNext();
                    temporal = previous.getNext();
                }
                // found the info
                if (temporal != null) {
                    previous.setNext(temporal.getNext());

                    if (temporal == head) {
                        head = previous;
                    }
                }
            }
            this.size--;
        } else {
            System.out.println("Node list are empty");
        }
    }

    public void printData() {
        Node<T> current = this.tail;
        while (current != null) {
            System.out.println(current.getData().toString());
            current = current.getNext();
        }
        System.out.println("");
    }

    public Node<T> getTail() {
        return this.tail;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public int getSize() {
        return this.size;
    }

}
