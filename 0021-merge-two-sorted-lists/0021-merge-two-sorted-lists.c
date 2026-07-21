/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {

    if(list1 == NULL){
        return list2;
    }
    if(list2 == NULL){
        return list1;      // as they are already sorted
    }
    
    struct ListNode* head ; //points to 1st node of merged sorted list.
    struct ListNode* temp ;
    struct ListNode* tail ;

    if(list1 -> val <= list2 -> val){
        head = list1;          // moving addresses here and not their value & pointing.
        list1 = list1 -> next;
    }
    else{
        head = list2;
        list2 = list2 -> next;
    }

    tail = head;

    while(list1 != NULL && list2 != NULL){
        if(list1 -> val <= list2 -> val){
            temp = list1;
            list1 = list1 -> next;
        }
        else{
            temp = list2;
            list2 = list2 -> next;
        }

        tail -> next = temp;
        tail = temp;
    }

    //remaining nodes
    if(list1 != NULL){
        tail -> next = list1;
    }
    else{
        tail -> next = list2;
    }

    return head;
}