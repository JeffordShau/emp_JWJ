public class Search2Driver {
    // number of iterations
    private static final int numOfArrayTests = 27;
    // number of times each test is run
    private static final int counts = 30;

    private static long[] totalTimeLin = new long[numOfArrayTests];
    private static  double[] avgTimeLin = new double[numOfArrayTests];
    private static long[] maxTimeLin = new long[numOfArrayTests];
    private static long[] minTimeLin = new long[numOfArrayTests];

    private static long[] totalTimeBin = new long[numOfArrayTests];
    private static double[] avgTimeBin = new double[numOfArrayTests];
    private static long[] maxTimeBin = new long[numOfArrayTests];
    private static long[] minTimeBin = new long[numOfArrayTests];

    public static void main(String[] args) {
        int arrayLength = 1; // determins starting length

        // generates multiple arrays different lengths
        for (int arrayNum = 0; arrayNum < numOfArrayTests; arrayNum++)
        {
            System.out.println("Array Length: " + arrayLength + " (Iter " + (arrayNum + 1) + ")");
            // generates ordered elements ascending order
            Comparable[] newArray = new Comparable[arrayLength];
            for (int idx = 0; idx < arrayLength; idx++)
            {
                newArray[idx] = idx;
            }

            // performs each array test 1000 times

            long[] linTimes = new long[counts];
            long[] binTimes = new long[counts];

            for (int counter = 0; counter < counts; counter++) {
                // generates target random target
                int randomIndex = (int) (Math.random() * arrayLength);
                Comparable randomValue = newArray[randomIndex];

                // time record for LinSearch

                long startTimeLin = System.currentTimeMillis();
                LinSearch.linSearch(newArray, randomValue);
                long endTimeLin = System.currentTimeMillis();
                long totalTimeLin = endTimeLin - startTimeLin;
                linTimes[counter] = totalTimeLin;

                // time record for BinSearch

                long startTimeBin = System.currentTimeMillis();
                BinSearch.binSearch(newArray, randomValue);
                long endTimeBin = System.currentTimeMillis();
                long totalTimeBin = endTimeBin - startTimeBin;
                binTimes[counter] = totalTimeBin;

                // To check for errors while running
                // System.out.println("Array size: " + arrayLength + "; Random value: " + randomValue + "; Lin StartTime: " + startTimeLin + "; Lin EndTime: " + endTimeLin + "; LinSearch: " + totalTimeLin + "; Bin StartTime: " + startTimeBin + "; Bin EndTime: " + endTimeBin + "; BinSearch: " + totalTimeBin);
            }

            // stuff for appending to existing arrays.

            // average time for LinSearch
            long sumLin = 0;
            for (int i = 0; i < counts; i++) {
                sumLin += linTimes[i];
            }
            double avgLin = sumLin / (double) counts;

            // average time for BinSearch
            long sumBin = 0;
            for (int i = 0; i < counts; i++) {
                sumBin += binTimes[i];
            }
            double avgBin = sumBin / (double) counts;

            // get maximum value in linTimes
            long maxLin = linTimes[0];
            for (int idx = 1; idx < counts; idx++)
            {
                if (linTimes[idx] > maxLin) {
                    maxLin = linTimes[idx];
                }
            }

            // get minimum value in linTimes
            long minLin = linTimes[0];
            for (int idx = 1; idx < counts; idx++)
            {
                if (linTimes[idx] < minLin) {
                    minLin = linTimes[idx];
                }
            }

            // get maximum value in binTimes
            long maxBin = binTimes[0];
            for (int idx = 1; idx < counts; idx++)
            {
                if (binTimes[idx] > maxBin) {
                    maxBin = binTimes[idx];
                }
            }

            // get minimum value in binTimes
            long minBin = binTimes[0];
            for (int idx = 1; idx < counts; idx++)
            {
                if (binTimes[idx] < minBin) {
                    minBin = binTimes[idx];
                }
            }

            // appends to arrays
            avgTimeLin[arrayNum] = avgLin;
            avgTimeBin[arrayNum] = avgBin;
            maxTimeLin[arrayNum] = maxLin;
            minTimeLin[arrayNum] = minLin;
            maxTimeBin[arrayNum] = maxBin;
            minTimeBin[arrayNum] = minBin;

            arrayLength *= 2;

        }
        printArrays();

    }

    // helper function to print array data
    public static void printArrays() {
        System.out.println("AvgLin\tAvgBin\tMinLin\tMinBin\tMaxLin\tMaxBin");
        for (int x = 0; x < numOfArrayTests; x++) {
            System.out.println((int) avgTimeLin[x] + "\t" + (int) avgTimeBin[x] + "\t" + (int) minTimeLin[x] + "\t" + (int) minTimeBin[x] + "\t" + (int) maxTimeLin[x] + "\t" + (int) maxTimeBin[x]);
        }
    }
}
