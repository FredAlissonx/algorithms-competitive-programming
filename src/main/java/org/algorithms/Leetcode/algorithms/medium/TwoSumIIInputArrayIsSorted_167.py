class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left, right = 0, len(numbers) - 1
        while left < right:
            r = numbers[left] + numbers[right]
            if r == target:
                return [left + 1, right + 1]
            elif r > target:
                right -= 1
            else:
                left += 1

        return []


