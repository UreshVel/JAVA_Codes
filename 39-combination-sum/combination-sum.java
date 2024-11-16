class Solution {
    public static void CombinationSum(int t,int idx,List<List<Integer>>ans,List<Integer>ds,int arr[]){
        if(idx==arr.length){
            if(t==0){
                ans.add(new ArrayList(ds));
            }
            return;
        }
        if(t>=arr[idx]){
            ds.add(arr[idx]);
            CombinationSum(t-arr[idx],idx,ans,ds,arr);
            ds.remove(ds.size()-1);
        }
        CombinationSum(t,idx+1,ans,ds,arr);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>arr=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        CombinationSum(target,0,arr,ds,candidates);
        return arr;
    }
}