class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        """
        len(ans) = 2n
        ans[i] = nums[i]
        ans[i + n] == nums[i] 
        """
        size = len(nums) * 2
        ans = [0] * size
        for i in range(len(nums)):
            ans[i] = nums[i]
            ans[len(nums) + i] = nums[i]
        return ans