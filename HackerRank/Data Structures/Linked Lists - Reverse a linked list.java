/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    
    Node currentNode = head;
    Node previousNode = null;
    Node nextNode;
    
    while(currentNode!=null){
        nextNode = currentNode.next;
        currentNode.next = previousNode;
        
        previousNode = currentNode;
        currentNode = nextNode;
        
    }

    return previousNode;
}
