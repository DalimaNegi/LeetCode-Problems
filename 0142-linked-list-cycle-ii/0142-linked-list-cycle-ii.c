/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    if(head == NULL){  //linked list empty
        return NULL;
    }

    struct ListNode *fast = head;
    struct ListNode *slow = head;

    while(fast != NULL && fast ->next != NULL){
        slow = slow -> next;    
        fast = fast -> next -> next;
        
        if(slow == fast){   //400  , head -> 100
            while(slow != head){
                slow = slow -> next;
                head = head -> next;
            }
            return slow;    //time - O(n) space - O(1)
        }
    }
    return NULL;
}