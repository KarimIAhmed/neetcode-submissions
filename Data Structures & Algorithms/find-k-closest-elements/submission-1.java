class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> closestElements=new ArrayList<>();
        int counter=1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(arr[middle]==x){
                start=middle;
                break;
            }
            else if(arr[middle]<x){
                start=middle+1;
            }
            else{
                end=middle-1;
            }
        }

        int left=start-1;
        int right=start;

        for (int i = 0; i < k; i++) {
            if (left < 0) {
                closestElements.add(arr[right++]);
            } else if (right >= arr.length) {
                closestElements.add(arr[left--]);
            } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                closestElements.add(arr[left--]);
            } else {
                closestElements.add(arr[right++]);
            }
        }
        Collections.sort(closestElements);
        return closestElements;
    }
}