/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

//Address : 100 -> 200 -> 300 -> 400 -> 500
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* current = head;
    struct ListNode* prev = NULL;
    struct ListNode* temp;
    while(current != NULL){
        temp = current -> next;     //200 = 100-> next
        current -> next = prev;     //100 -> next = NULL
        prev = current;    //100
        current = temp;    //200
    }
    head = prev;   //Since current -> NULL , prev -> 500
    return head;    //head returns the link to the reversed list.
}