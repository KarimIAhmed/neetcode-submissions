class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map={}
        for index,num in enumerate(nums):
            sub=target-num
            if sub in map:
                return [map.get(sub),index]
            else:
                map[num]=index
        return map           