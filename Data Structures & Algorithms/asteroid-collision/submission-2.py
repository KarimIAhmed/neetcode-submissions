class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack=[]
        for asteroid in asteroids:
            survive=True
            while survive and asteroid<0 and len(stack)!=0 and stack[-1]>0:
                if stack[-1]==-asteroid:
                    stack.pop()
                    survive=False
                elif stack[-1]>-asteroid:
                    survive=False
                else:
                    stack.pop();
            if survive:
                stack.append(asteroid)

        return stack



                