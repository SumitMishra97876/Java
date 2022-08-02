package arrays;

import java.util.Set;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class Duplicates_From_Arrays
{
    public static void main(final String[] args) {
        final Integer[] nums = { 1, 3, 6, 7,3,7};
        final Set<Integer> hs = new HashSet<Integer>();
       // Integer[] array = null;
        int length=nums.length;
        for (int i = 0; i < length; ++i) {
            //Integer num = nums[i];
            if (!hs.add(nums[i])) {
                System.out.println("Duplicate elements are " + nums[i]);
            }
        }
    }
}