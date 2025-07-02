class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincapacity = 0;
        int maxcapacity = 0;
        for (int wt : weights) {
            maxcapacity = maxcapacity + wt;
            if (wt > mincapacity) {
                mincapacity = wt;
            }
        }
        while (mincapacity <= maxcapacity) {
            int midcapacity = mincapacity + (maxcapacity - mincapacity) / 2;
            int curr_load = 0;
            int D = 1;
            for (int wt : weights) {
                if (curr_load + wt > midcapacity) {
                    D++;//more days needed new day start
                    curr_load = 0;//reset currentload of the new day
                }
                //if current load and picked weight is within and less than mid then, add that weight and update curr_load
                curr_load = curr_load + wt;
            }
            if (D > days) {
                mincapacity = midcapacity + 1;//inc capacity to  make more weights go  in 1 day 
            } else {
                maxcapacity = midcapacity - 1;
            }
        }
        return mincapacity;
    }
}
