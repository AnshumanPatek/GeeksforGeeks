class Solution {
  public:
    // Function to count nodes of a linked list.
    bool searchKey(int n, struct Node* head, int key) {
        // Code here
        for(int i = 0; i<n;i++){
            if(key == head->data){
                return 1;
            }
            head = head ->next;
        }
        return 0;
    }
};
