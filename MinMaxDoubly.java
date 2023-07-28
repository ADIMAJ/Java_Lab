
public class minmaxdoubly{  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    Node head, tail = null;  
  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
  
         
        if(head == null) {  
            
            head = tail = newNode;  
            
            head.previous = null;  
            
            tail.next = null;  
        }  
        else {  
            
            tail.next = newNode;  
             
            newNode.previous = tail;  
            
            tail = newNode;  
            
            tail.next = null;  
        }  
    }  
  
      
    public int minimumNode() {  
        
        Node current = head;  
        int min;  
  
         
        if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
              
            min = head.data;  
            while(current != null) {  
                 if(min > current.data)  
                    min = current.data;  
                current = current.next;  
            }  
        }  
        return min;  
    }  
  
    
    public int maximumNode() {  
        
        Node current = head;  
        int max;  
       if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
            
            max = head.data;  
             
            while(current != null) {  
                if(current.data > max)  
                    max = current.data;  
                current = current.next;  
            }  
        }  
        return max;  
    }  
  
    public static void main(String[] args) {  
  
        minmaxdoubly dList = new minmaxdoubly();  
        
        dList.addNode(5);  
        dList.addNode(7);  
        dList.addNode(9);  
        dList.addNode(1);  
        dList.addNode(2);  
  
       
        System.out.println("Minimum value node in the list: "+ dList.minimumNode());  
       
        System.out.println("Maximum value node in the list: "+ dList.maximumNode());  
    }  
}  
