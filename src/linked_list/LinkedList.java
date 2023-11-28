package linked_list;

public class LinkedList {
class Node {
    int data;
    Node next;
}
private Node head;
private Node tail;
private int size;


//add
public void AddFirst( int item){
    Node nn = new Node();
    nn.data = item;
    if ( size ==0){
        head =nn;
        tail =nn;
        size++;
    }
    else{
        nn.next=head;
       head=nn;
        size++;
    }
}
public void AddLast(int item){
    Node nn= new Node();
    nn.data = item;
    if ( size ==0){
        AddFirst(item);
    }
    else {
        tail.next =nn;
        nn =tail;
        size++;
    }
}
public void AddAtIndex(int item, int k) throws Exception {
    Node nn = new Node();
    nn.data =item;
    if ( size==0){
        AddFirst(item);
    }
    else if( k==size){
        AddLast(item);
    }
    else{

        Node Kminus1 =GetNode(k-1);
        nn.next =Kminus1.next; // isko hum neeche likh nhi sakte warna data aage ka kha jayega
        Kminus1.next=nn;
        size++;
    }
}

//Get
public int GetFirst(){
    return head.data;
}

public int GetLast(){
    return tail.data;
}
public int GetIndex(int k)throws Exception{
    return GetNode(k).data;
}

//remove
    public int removeFirst(){
    int rv = head.data;
    if ( size ==1){
        head= null;
        tail= null;
    }else {
        Node temp = head;
        head = head.next;
        temp.next=null;

    }
    size--;
    return rv;
    }


    public int removeLast() throws Exception {
    int rv =tail.data;
    if (size == 0){
        return removeFirst();
    }else{
        Node sl = GetNode(size-2);
        sl.next =null;
        tail =sl;
    }size--;
    return rv;
    }

    //remove at Index
    public int RemoveAtIndex(int k)throws Exception{
    if ( k==0){
        return removeFirst();
    }
  else if ( k==size-1){
        return removeLast();
    }
  else{
      Node Kminus1 = GetNode(k-1);
      Node Kth = Kminus1.next;
      Kminus1.next =Kth.next;
      Kth.next =null;
      size--;
      return Kth.data;

    }

    }

private Node GetNode(int k)throws Exception{
    if ( k<0  || k>= size){
        throw new Exception("bhai index range me daalo");
    }
    else{
        Node temp = head;
        for ( int i =0; i<k; i++){
            temp = temp.next;
        }
        return temp;
    }
}

//display
public void Display() {
    Node temp = head;
    while (temp != null) {

        System.out.print(temp.data + "-->");
        temp = temp.next;

    }
    System.out.println(".");

}
//size
    public int size(){
    return size;
    }

}



