/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode * temp = head;
    int count = 0;
    while(temp!=NULL){
        count++;
        temp = temp->next;
    }
    int arr[count];
    int i = 0;
    
    struct ListNode * temp1 = head;
    while(temp1 != NULL && i<count){
        arr[i]= temp1 -> val;
        i++;
        temp1 = temp1->next;
    }

    int j = count-1;
    int k = 0;
    while(k<j){
        if(arr[k] == arr[j]){
            k++;
            j--;
        }else{
            return false;
        }
    }
    return true;
}


//Below approach works only on some test cases because it ends up reversing the original linked list.


// bool isPalindrome(struct ListNode* head) {          
//     struct ListNode * temp;
//     struct ListNode * reversedHead;
//     struct ListNode * head1 = head;
//     struct ListNode * prev = NULL;
//     struct ListNode * current = head1;
//     while (current != NULL){
//         temp = current -> next;
//         current -> next = prev;
//         prev = current;
//         current = temp;
//     }
//     reversedHead = prev;
//     while(head!=NULL && reversedHead!=NULL){
//        if( head->val != reversedHead-> val){
//           return false;
//           break;
//        }
//        head = head -> next;
//        reversedHead = reversedHead -> next;
//     }
//     return true;
// }