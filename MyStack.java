package performanstest;

class MyStack {
      private class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) return -1;
        int value = top.data;
        top = top.next;
        return value;
    }
  }


