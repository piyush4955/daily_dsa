class Solution {
    public int minimumCost(int[] cost) {

        int check[] = new int[cost.length + 1];
        ArrayList<Integer> li = new ArrayList<>();

        int j = 1;
        for (int i = 0; i < cost.length; i++) {
            check[j] = cost[i];
            j++;
        }

        for (int i = 1; i < check.length; i++) {
            li.add(check[i]);
        }

        Collections.sort(li, Collections.reverseOrder());

        int sum = 0;

        if (li.size() <= 2) {
            for (int i = 0; i < li.size(); i++) {
                sum += li.get(i);
            }
        } else {
            int k = 1;
            for (int i = 0; i < li.size(); i++) {
                if (k % 3 == 0) {
                    k++;
                    continue;
                }
                sum += li.get(i);
                k++;
            }
        }

        return sum;
    }
}