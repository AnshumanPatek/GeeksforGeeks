class Solution
{
    public:
    //Function to delete a node without any reference to head pointer.
    void deleteNode(Node *del)
    {
       // Your code here
       Node *temp = del;
       del->data = temp ->next ->data;
       del ->next = temp ->next->next;
      // free(temp);
    }

};
