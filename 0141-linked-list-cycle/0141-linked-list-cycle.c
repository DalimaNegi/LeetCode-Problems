/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    
    // FLOYD's SLOW AND FAST POINTER ALGORITHM

    struct ListNode *slow = head;
    struct ListNode *fast = head;

    while(fast != NULL && fast -> next != NULL){     
        // checks weather fast is a valid node and ensures there's one more node ahead
        // to prevent accessing a NULL pointer and avoid runtime errors.
        
        slow = slow -> next;
        fast = fast -> next -> next;

        if(slow == fast){
            return true;
        }
    }
    return false;
}