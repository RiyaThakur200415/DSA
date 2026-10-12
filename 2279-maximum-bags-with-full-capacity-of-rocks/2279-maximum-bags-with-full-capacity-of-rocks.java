
import java.util.Arrays;

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int addRock) {
        int n = rocks.length;
        int[] temp = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            temp[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            if (addRock >= temp[i]) {
                addRock -= temp[i];
                cnt++;
            } else {
                break;
            }
        }

        return cnt;
    }
}
