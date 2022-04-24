class SinglyLinkedList{
    Node head;
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
// Insert At Beginning
    public void insertFirst(int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
    }
//Insert At a given position
    public void insert(int position,int data){

        if(position<0 || position>length())
        {
            System.out.println("Invalid index");
            return;
        }
        Node newnode = new Node(data);
        if(position == 0)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        int index=1;
        Node previous=head;
        while(index<position)
        {
            previous=previous.next;
            index++;
        }
        
        Node current = previous.next;
        previous.next=newnode;
        newnode.next=current;
    }
//Insert At End
    public void insertLast(int data){
        Node newnode = new Node(data);
        Node current = head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newnode;
        
    }
//Delete At Beginning
    public Node deleteFirst(){
        if(head==null)
        {
            return null;
        }
        Node temp = head;
        head=head.next;
        temp.next=null;
        return null;
        
    }
//Delete a node form SinglyLinkedList
    public Node delete(int index){
        if(head==null)
        {
            return null;
        }
        else if(index==0){
            head=head.next;
            return head;
        }
        else{
            Node previous=head;
            int count=0;
            while(count<index-1){
                previous=previous.next;
                count++;
            }
            Node current=previous.next;
            previous.next=current.next;
            return current;
        }
    }
//Delete At End
    public Node deleteLast(){
        if(head==null)
        {
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return temp.next;
    }
//Search an element in a SinglyLinkedList
    public boolean search(int key){
        Node current = head;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current=current.next;
        }
        return false;
        
    }
//Find the length of the SinglyLinkedList
    public int length(){
        int count=0;
        Node current = head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
//Travere or Display a SinglyLinkedList
    public void traverse(){
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
//Constructor for SinglyLinkedList
    public SinglyLinkedList()
    {
        this.head=null;
    }
//Main function
    public static void main(String args[])
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head =  new Node(1);
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        sll.head.next=first;
        first.next=second;
        second.next=third;
        sll.traverse();
        System.out.println("Length of Linked List: "+sll.length());
        System.out.println("Insert First");
        sll.insertFirst(100);
        sll.traverse();
        System.out.println("Insert Last");
        sll.insertLast(200);
        sll.traverse();
        System.out.println("Insert At Given Position");
        sll.insert(7,50);
        sll.traverse();
        System.out.println("Delete node at first");
        sll.deleteFirst();
        sll.traverse();
        System.out.println("Delete node at last");
        sll.deleteLast();
        sll.traverse();
        System.out.println("Delete node at a Given Position");
        sll.delete(3);
        sll.traverse();
        if(sll.search(110)==true)
        {
            System.out.println("Element Present");
        }
        else
        {
            System.out.println("Element not present");
        }
        
    }
}
