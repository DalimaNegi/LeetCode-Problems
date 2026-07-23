/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode * reverse (struct ListNode * head){
    //Time cmplx - O(n) Space cmplx -> O(1)
    struct ListNode * current = head;
    struct ListNode * prev = NULL;
    struct ListNode * temp;
    while(current != NULL){
        temp = current->next;
        current -> next = prev;
        prev = current;
        current = temp;
    }
    head = prev;
    return head;
}

bool isPalindrome(struct ListNode* head){
    struct ListNode * slow = head;
    struct ListNode * fast = head;

    while(fast != NULL && fast->next != NULL){
        slow = slow -> next;
        fast = fast -> next -> next;
    }

    if(fast != NULL){
        slow = slow -> next;
    }

    struct ListNode * start = head;
    struct ListNode * secondHalf = reverse(slow);
    while(secondHalf!= NULL){
        if(start->val != secondHalf->val){
            return false;
        }
        start = start -> next;
        secondHalf = secondHalf -> next;
    }
    return true;
}


// bool isPalindrome(struct ListNode* head) {          
//     //Time & space cmplx -> O(n) as there is an extra array
//     struct ListNode * temp = head;
//     int count = 0;
//     while(temp!=NULL){
//         count++;
//         temp = temp->next;
//     }
//     int arr[count];
//     int i = 0;
    
//     struct ListNode * temp1 = head;
//     while(temp1 != NULL && i<count){
//         arr[i]= temp1 -> val;
//         i++;
//         temp1 = temp1->next;
//     }

//     int j = count-1;
//     int k = 0;
//     while(k<j){
//         if(arr[k] == arr[j]){
//             k++;
//             j--;
//         }else{
//             return false;
//         }
//     }
//     return true;
// }


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