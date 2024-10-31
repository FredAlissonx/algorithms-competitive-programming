# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        start = head
        end = head
        prev = None

        if not start.next:
            return None

        while start and start.next:
            start = start.next.next
            prev = end
            end = end.next
        prev.next = end.next

        return head
