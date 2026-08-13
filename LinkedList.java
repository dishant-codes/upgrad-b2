
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}





class LinkList{


    static Node reverse(Node head){

        Node next = null;
        Node current = head;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;            
        }

        return prev;

    }

    static void print(Node head){

        while(head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
        System.out.print("Null");

    }

   public static void main(String[] args) {
    
         
    Node head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(30);
    head.next.next.next = new Node(40);


    print(head);
    

   }

}