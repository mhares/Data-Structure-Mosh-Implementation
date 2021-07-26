package linkedlists;

import java.util.NoSuchElementException;

public class Linkedlist {
  private class Node{
      private int value;
      private Node next;

      public Node(int value) {
          this.value = value;
      }
  }

  private Node head;
  private Node tail;
  private int size;

  public void addLast(int value){
      Node newNode = new Node(value);
      if(isEmpty()){
          head = tail = newNode;
      }else{
          tail.next=newNode;
          tail=newNode;
      }
      size++;
  }
  public void addFirst(int value){
      Node newNode = new Node(value);
      if(isEmpty())
          head = tail = newNode;
      else{
          newNode.next=head;
          head = newNode;
      }
      size++;
  }

  public int indexOf(int value){
     Node temp = head;
     int index =0;
     while (temp !=null){
         if(temp.value==value){
             return index;
         }else{
             temp=temp.next;
             index++;
         }
     }

      return -1;
  }

  public boolean contains(int value){
      return indexOf(value) != -1;
  }

  public void removeFirst(){
      // [10 -> 20-> 30]
      if(isEmpty()) throw new NoSuchElementException();
      if(head==tail){
          head=tail=null;
          return;
      }
      Node second = head.next;
      head.next=null;
      head=second;
      size--;

  }

  public void removeLast(){
      if(isEmpty()) throw new NoSuchElementException();
      if(head==tail){
          head=tail=null;
      }else{
     Node prev = getPrevious(tail);
     prev.next=null;
     tail=prev;
      }
     size --;
  }
    private boolean isEmpty() {
      return head==null;
    }

    public Node getPrevious(Node node){
     Node prev =head;
    while (prev != null) {
        if(prev.next ==node) return prev;
        prev=prev.next;
    }
    return null;
    }

    public int getSize() {
        return size;
    }
    public int[] toArray(){
      int[] arr = new int[size];
      int index = 0;
      Node temp= head;
      while (temp != null){
          arr[index++] = temp.value;
          temp=temp.next;
      }
      return arr;
    }
}
