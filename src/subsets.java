//subset
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class subsets {
    public static List<List<Integer>> subsets(int[] nums)
    {
  List<List<Integer>> result= new ArrayList<>();
      backtrack(0,nums,new ArrayList<>(),result);

      return result;
    }
    private static void backtrack(int start,int[] nums,List<Integer> current,List<List<Integer>> result)// toght coupling
    {
        result.add(new ArrayList<>(current));//ADDITION
        for(int i=start;i<nums.length;i++)
        {
            current.add(nums[i]);
            backtrack(i+1,nums,current,result);
            current.remove(current.size()-1); //backtrack
        }
    }
    public static void main(String[] args) {
        int nums[]={4,2,3};
        int n =nums.length;
        System.out.println(nums);

        
    }
}
