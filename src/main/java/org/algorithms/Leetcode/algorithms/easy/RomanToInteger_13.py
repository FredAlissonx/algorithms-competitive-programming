class Solution:
    def romanToInt(self, s: str) -> int:
        """
        IV
        """
        symbols = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        ans = 0

        for i in range(len(s)):
            if i < len(s) - 1 and symbols.get(s[i]) < symbols.get(s[i+1]):
                ans -=  symbols.get(s[i])
            else:
                ans += symbols.get(s[i])

        return ans
