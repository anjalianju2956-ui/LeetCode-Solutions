class Solution(object):
    def isHappy(self, n):
        set_elements=set()
        while(n!=1):
            total=0
            if n in set_elements:
                return False
            set_elements.add(n)
            while(n>0):
                digit=n%10
                total+=digit**2
                n=n//10
            n=total
        return True
        
obj=Solution()
