public class SearchDriver {

    private long totalTime = 0;
    private double avgTime = 0;
    private long maxTime = 0;

    public void update(long time) {
        totalTime += time;
        if (time > maxTime) {
          maxTime = time;
        }
    }

    public static void main(String[] args) {
        int arrayLength = 1; // determins starting length
        int numOfArrayTests = 27; // determins size of the arrays

        SearchDriver linSearch = new SearchDriver();
        SearchDriver binSearch = new SearchDriver();

        // generates multiple arrays different lengths
        for (int arrayNum = 0; arrayNum < numOfArrayTests; arrayNum++)
        {

          // generates ordered elements ascending order
          Comparable[] newArray = new Comparable[arrayLength];
          for (int idx = 0; idx < arrayLength; idx++)
          {
            newArray[idx] = idx;
          }

            // performs each array test 1000 times
            for (int counter = 0; counter <= 1000; counter++) {
              // generates target random target
              int randomIndex = (int) (Math.random() * arrayLength);
              Comparable randomValue = newArray[randomIndex];

              // time record for LinSearch
              long startTimeLin = System.currentTimeMillis();
              LinSearch.linSearch(newArray, randomValue);
              long endTimeLin = System.currentTimeMillis();
              long totalTimeLin = endTimeLin - startTimeLin;
              linSearch.update(totalTimeLin);

              // time record for BinSearch
              long startTimeBin = System.currentTimeMillis();
              BinSearch.binSearch(newArray, randomValue);
              long endTimeBin = System.currentTimeMillis();
              long totalTimeBin = endTimeBin - startTimeBin;
              binSearch.update(totalTimeBin);

              // prints a summary


              // To check for errors while running
              // System.out.println("Array size: " + arrayLength + "; Random value: " + randomValue + "; Lin StartTime: " + startTimeLin + "; Lin EndTime: " + endTimeLin + "; LinSearch: " + totalTimeLin + "; Bin StartTime: " + startTimeBin + "; Bin EndTime: " + endTimeBin + "; BinSearch: " + totalTimeBin);
          }
          arrayLength *= 2;
          linSearch.avgTime = linSearch.totalTime / (double) 1000;
          binSearch.avgTime = binSearch.totalTime / (double) 1000;
          System.out.println("Lin Array size: " + arrayLength + "; Lin Avg Time: " + linSearch.avgTime + "; Lin MaxTime: " + linSearch.maxTime);
          System.out.println("Bin Array size: " + arrayLength + "; Bin Avg Time: " + binSearch.avgTime + "; Bin MaxTime: " + binSearch.maxTime);
        }
    }
}
