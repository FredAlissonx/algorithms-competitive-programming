class Solution:
    def isPalindrome(self, s: str) -> bool:
        if len(s) <= 1:
            return True
        n = [i.lower() for i in s if i.isalnum()]

        right, left = len(n) - 1, 0
        while left < right:
            if n[left] != n[right]:
                return False

            left += 1
            right -= 1
        return True

