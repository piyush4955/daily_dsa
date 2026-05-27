class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> result = new ArrayList<>();
        if(finalSum%2 != 0) return result;

        long prod = 2;
        while(finalSum >= prod){
            result.add(prod);
            finalSum -= prod;
            prod += 2;
        }

        if(finalSum > 0){
            long sum = result.remove(result.size()-1);
            sum += finalSum;
            result.add(sum);
        }

        return result;
    }
}