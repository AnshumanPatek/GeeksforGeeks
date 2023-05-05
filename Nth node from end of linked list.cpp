int getNthFromLast(Node *head, int n)
{
       // Your code here
       	Node* check = head;
    	int count = 0;
    	while(check!= NULL){
    	    check = check->next;
    	    count++;
    	    
    	}
    	if(n>count){
    	    return -1;
    	}
    	int value = count - n;
    	int counter = 0;
    	while(head!=NULL){
    	    
    	    if(counter == value){
    	        return head->data;
    	    }
    	    head = head ->next;
    	    counter++;
    	}
    	//return -1;
}
