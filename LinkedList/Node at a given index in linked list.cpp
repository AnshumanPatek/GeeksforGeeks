int GetNth(struct node* head, int index){
  // Code here
  int count = 1;
  
  
  while(head!=NULL){
     if(count==index){
          return head->data;
      }
      head = head->next;
      count++;
       
  }
  return -1;
}
