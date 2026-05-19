class Solution {
    int parent[];
    public int countComponents(int n, int[][] edges) {
        parent=new int[n];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int[] edge:edges){
            union(edge[0],edge[1]);
        }
        for(int p:parent){
            set.add(find(p));
        }
        System.out.println(set);
        return set.size();
    }
    public void union(int node1,int node2){
        int findNode1=find(node1);
        int findNode2=find(node2);

        parent[findNode1]=findNode2;
    }
    public int find(int node){
        if(node==parent[node]){
            return node;
        }
        else{
            return find(parent[node]);
        }
    }
}
