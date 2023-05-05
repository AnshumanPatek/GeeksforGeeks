#include <cmath>
class Solution{
    public:
    /* Should return data of middle node. If linked list is empty, then  -1*/
    int getMiddle(Node *head)
    {
        
       Node* slow = head;
       Node* fast = head;
       int count =0;
       if(slow==NULL){
           return -1;
         }
        while(fast!=NULL&&fast->next!=NULL){
            
            fast = fast->next->next;
             slow=slow->next;
            count++;
        }
             return slow->data;
        
        
        
    }
};
