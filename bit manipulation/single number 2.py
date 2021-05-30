
def singleNumber(nums: List[int]) -> int:
    res = 0
    for i in range(32):
        count = 0
        for n in nums:
            count += (n >> i) & 1
        rem = count % 3
        if i == 31 and rem:  
            res -= 1 << 31
        else:
            res |= rem << i
    return res
