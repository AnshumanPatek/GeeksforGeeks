int isLengthEvenOrOdd(struct Node* head)
{
     //Code here
     int count =0;
     while(head!=NULL){
         head = head->next;
         count++;
     }
     if(0==(count%2)){
         return 0;
         
     }
     else{
         return 1;
     }
}
