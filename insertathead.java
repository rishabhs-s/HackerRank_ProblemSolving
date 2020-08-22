//Insert a node at the head of a linked list
static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
        node.data=data;
        node.next=head;
        return node;
    }
