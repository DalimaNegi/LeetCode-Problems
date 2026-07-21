/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    int data = node -> next -> val;
    struct ListNode* nextAdd = node -> next;
    node -> val = data;
    node -> next = nextAdd -> next;
    free(nextAdd);
}