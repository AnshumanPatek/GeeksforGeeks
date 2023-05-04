int sumOfLastN_Nodes(struct Node* head, int n)
{
      // Code here
    Node* temp = head;
      int count = 0;
     while(temp!=NULL){
         count++;
         temp = temp->next;
     }
     int check = count - n;
     int counter = 0;
     int sum = 0;
     while(head!=NULL){
        
         if(counter>=check){
             sum = sum + head->data;
         }
         counter++;
         head = head->next;
     }
     return sum;
}
