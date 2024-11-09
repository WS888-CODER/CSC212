


public class OurLinkedList<T> implements OurList<T> {
    
 private OurNode<T> head; 
 private OurNode<T> current; 

 public OurLinkedList () { 
   head = current = null; 
  } 

 public boolean empty () {
   return head == null;
} 

 public boolean last () { 
   return current.next == null;   
}

 public void findFirst( ) {
    current = head;
 }
    
 public void findNext( ) {
     current = current.next;
 } 
 
 public T retrieve( ) {
     return current.data;
 } 
 
 public void update(T val) {
     current.data = val;
 } 
 
 public void insert(T val) {
     OurNode<T> tmp; 
     if (empty()) { 
         current = head = new OurNode<T> (val);
     } 
     else {
         tmp = current.next; 
         current.next = new OurNode<T> (val); 
         current = current.next; 
         current.next = tmp;
     }
 }
 
 public void remove( ) {
   if (current == head) { 
          head = head.next; 
   } 
   else { 
          OurNode<T> tmp = head; 
          while (tmp.next != current) tmp = tmp.next; 
          tmp.next = current.next; } 
   
   if (current.next == null) 
          current = head; 
   else 
          current = current.next; 
 }
 
 public boolean full( ) {
   return false;  
 }
}
