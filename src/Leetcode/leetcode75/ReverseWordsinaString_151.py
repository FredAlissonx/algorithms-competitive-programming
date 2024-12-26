class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.split()
        right, left = 0, len(s) - 1
        while right < left:
            s[right], s[left] = s[left], s[right]
            right += 1
            left -= 1
        return " ".join(s)


