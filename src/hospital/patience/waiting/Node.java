package hospital.patience.waiting;
public class Node{
  Node next; 
  Object element;
  Object id;
  public Node(Object o,Object i,Node n){
   next=n;
   element=o;
   id=i;
  }
}