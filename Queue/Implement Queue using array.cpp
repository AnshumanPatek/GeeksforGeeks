void MyQueue :: push(int x)
{
        // Your Code
        
        
        arr[rear]=x;
            rear++;
            
        
}

//Function to pop an element from queue and return that element.
int MyQueue :: pop()
{
        // Your Code   
        if(rear == front){
            rear = 0;
            front = 0;
            return -1;
        }else{
           int ok = arr[front];
           // arr[front] = 0;
             front++;
             return ok;
        }
        
        
        
}
