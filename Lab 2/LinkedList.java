class LinkedList{
    Node head;
    public void append(Integer val){
        if(this.head==null){
            this.head = new Node(val);
        }
        else{
        Node n = new Node(val);
        Node newN=this.head;
        while(newN.next!=null) newN=newN.next;
        newN.next= n; 
        }
    }
    public void printList(){
        Node n = this.head;
        while(n!=null){
            System.out.print(n.elem+ " ");
            n=n.next;
        }
        System.out.println();
    }

    public void removeFirst(){
        this.head=this.head.next;
    }
   
    public void prepend(Integer val){
        Node newN= new Node(val);
        newN.next=this.head;
        this.head=newN;
    }
    public Node nodeAt(int indx){
        int count=0;
        Node n = this.head;
        while(n!=null){
            if(indx==count) return n;
            count++;
            n=n.next;
        }
        return null;
    }
    public void removeLast(){
        Node n = this.head;
        while(n.next.next!=null) n=n.next;
        n.next=null;
    }
}