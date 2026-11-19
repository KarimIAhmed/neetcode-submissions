class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean alive = true;
            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.peek();
                if (top < -asteroid) {
                    stack.pop();          // top explodes, incoming keeps going
                } else if (top == -asteroid) {
                    stack.pop();          // both explode
                    alive = false;
                } else {
                    alive = false;        // incoming explodes
                }
            }
            if (alive) {
                stack.push(asteroid);
            }
        }
        int[] sol = new int[stack.size()];
        for (int i = sol.length - 1; i >= 0; i--) {
            sol[i] = stack.pop();
        }
        return sol;
    }
}