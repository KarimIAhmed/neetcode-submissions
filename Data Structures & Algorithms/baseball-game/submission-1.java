class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String o:operations){
            if(o.equals("+")){
                int num1=stack.pop();
                //int num2=stack.pop();
                int num3=(num1+stack.peek());
                stack.push(num1);
                //stack.push(num2);
                stack.push(num3);
            }
            else if(o.equals("D")){
                int num1=stack.peek();
                stack.push(num1*2);
            }
            else if(o.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(o));
            }
        }
        int solution=0;
        while(!stack.isEmpty()){
            solution+=stack.pop();
        }
        return solution;        
    }
}