/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode * temp1;
    struct ListNode * prev = NULL;
    struct ListNode * current = head;

    if(head == NULL){         //if Linked list is empty
        return head;
    }
    while(head!=NULL && head->val==val){       // [7,7,7,7]
            temp1 = head;
            head = head->next;
            free(temp1);
    }
    current = head;            //update new head
    while(current!=NULL){
        if(current->val == val){
            temp1=current;
            prev->next = current->next;
            current = current->next;
            free(temp1);
        }
        else{
            prev = current;
            current = current->next;
        }
    }
    return head;
}