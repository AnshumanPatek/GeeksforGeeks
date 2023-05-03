class Solution
{
    public:
    int count(struct node* head, int search)
    {
    //add your code here
    if(head->next==NULL){
        return 0;
    }
    int count= 0;
    while(head!=NULL){
        if(search == head->data){
            count++;
        }
        head = head->next;
    
    }
    return count;
    }
};
