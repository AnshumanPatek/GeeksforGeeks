class Solution{
public:
    ListNode *moveToFront(ListNode *head){
         if(head == NULL || head->next == NULL){

            

                return head;

        }

        

        ListNode*pre = NULL;

        ListNode*curr = head;

        

        while(curr->next != NULL){

            

             pre = curr;

             curr = curr->next;

        }

        

        curr->next = head;

        pre->next = NULL;

        

        return curr;
    }
};
