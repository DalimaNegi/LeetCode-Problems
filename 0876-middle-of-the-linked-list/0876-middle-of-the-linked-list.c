/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 #include <math.h>
struct ListNode* findElementsFromMid(int mid,struct ListNode* head){
    int i=1;
    while(i<mid){
        head = head -> next;
        i++;
    }
    return head;
}

struct ListNode* middleNode(struct ListNode* head) {
    int length=0;
    struct ListNode* temp = head;
    while(temp!=NULL){
        length++;
        temp = temp->next;
    }
    struct ListNode* final;
    int mid;
    if(length%2==0){
        mid = (length/2)+1;
        final = findElementsFromMid(mid,head);
    }else{
        mid = ceil(length/2.0);
        final = findElementsFromMid(mid,head);
    }
    return final;    
    //we only return the address of the third node as all the rest of the nodes are linked to it.
}