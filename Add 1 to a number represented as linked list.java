
class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        Node rev=reverse(head);
        Node tempRev=rev;
        int carry=1;
        while(carry==1&&tempRev!=null){
            int sum=tempRev.data+carry;
            carry=0;
            if(sum==10){
                tempRev.data=0;
                carry=1;
            }
            else{
                tempRev.data=sum;
            }
            
            tempRev=tempRev.next;
        }
        
        if(carry==1){
            Node newNode=new Node(1);
            Node ans=reverse(rev);;
            newNode.next=ans;
            ans=newNode;
            return ans;
        }
        
        Node ans=reverse(rev);
        return ans;
        
        
    }
    
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        
        return prev;
    }
}
