/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 */
public class Problem11 {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = height.length - 1; j > i; j--) {
                if (height[i] > height[j]) {
                    int v = (j - i) * height[j];
                    if (v > max) {
                        max = v;
                    }
                } else {
                    int v = (j - i) * height[i];
                    if (v > max) {
                        max = v;
                    }
                    break;
                }
            }
        }
        return max;
    }

    //Time Limit Exceeded
    //public int maxArea(int[] height) {
    //    int max = 0;
    //    for (int i = 0; i < height.length - 1; i++) {
    //        for (int j = i + 1; j < height.length; j++) {
    //            int v = (j - i) * (Math.min(height[i], height[j]));
    //            if (max < v) {
    //                max = v;
    //            }
    //        }
    //    }
    //    return max;
    //}

}
