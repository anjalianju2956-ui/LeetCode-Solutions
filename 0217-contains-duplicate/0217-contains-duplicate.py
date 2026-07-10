class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        length_of_list=len(nums)
        set_values=set(nums)
        length_of_set=len(set_values)
        if length_of_list==length_of_set:
            return False
        else:
            return True


obj=Solution()

        