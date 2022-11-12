

package linkedlist;


public class LiList {
  int data;
  node first;
  
      
   void insert(int value){
       node newnode = new node ();
      // first.next= newnode;
       newnode.data=value;
       newnode.next=null;
      System.out.println(newnode.data);
   }   
     
   
      
    }

class node{
    int data;
    node next=null;

    
    
}
