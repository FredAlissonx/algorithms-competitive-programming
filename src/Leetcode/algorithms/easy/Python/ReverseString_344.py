class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        ["h","e","l","l","o"]
        r = len(s) - 1, l = 0
        r = o, l = h
        ["o","e","l","l","h"]
        """
        r = len(s) - 1
        l = 0

        while l < r:
            s[r], s[l] = s[l], s[r]

            l += 1
            r -= 1
        
        