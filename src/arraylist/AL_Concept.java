package arraylist;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;

public class AL_Concept
{
    public static void main(final String[] args) {
        final ArrayList<String> ar = new ArrayList<String>();
        ar.add("java");
        ar.add("python");
        ar.add("ruby");
        ar.add("javascript");
        ar.add("scala");
        final ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Testing");
        ar2.add("Devops");
        ar.addAll(ar2);
        System.out.println(ar);
        final ArrayList<String> cloneList = (ArrayList<String>)ar.clone();
        System.out.println(cloneList);
        System.out.println(ar.indexOf("javascript"));
        cloneList.remove(3);
        System.out.println(cloneList);
        final ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(nums);
        nums.removeIf(num -> num % 2 != 0);
        System.out.println(nums);
        ar.retainAll(ar2);
        System.out.println(ar);
        final ArrayList<Integer> nums2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        final ArrayList<Integer> subList = new ArrayList<Integer>(nums2.subList(4, 10));
        System.out.println(subList);
        final Object[] nums3 = nums.toArray();
        System.out.println(Arrays.toString(nums3));
    }
}