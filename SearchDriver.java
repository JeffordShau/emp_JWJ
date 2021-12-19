
public class SearchDriver {

    public static void main(String[] args) {
        int arrayLength = 1;
        int numOfArrayTests = 21;
        // generates multiple arrays
        for (int arrayNum = 0; arrayNum < numOfArrayTests; arrayNum++)
        {

          // generates random elements
          Comparable[] newArray = new Comparable[arrayLength];
          for (int idx = 0; idx < newArray.length; idx++)
          {
            newArray[idx] = idx;
          }

            // performs each array size 1000 times
            for (int counter = 0; counter <= 1000; counter++) {
              // generates target random target
              int randomIndex = (int) (Math.random() * arrayLength);
              Comparable randomValue = newArray[randomIndex];

              // time record for LinSearch
              long startTimeLin = System.currentTimeMillis();
              LinSearch.linSearch(newArray, randomValue);
              long endTimeLin = System.currentTimeMillis();
              long totalTimeLin = endTimeLin - startTimeLin;

              // time record for BinSearch
              long startTimeBin = System.currentTimeMillis();
              BinSearch.binSearch(newArray, randomValue);
              long endTimeBin = System.currentTimeMillis();
              long totalTimeBin = endTimeLin - startTimeLin;

              System.out.println("Array size: " + arrayLength + "; Random value: " + randomValue + "; LinSearch: " + totalTimeLin + "; BinSearch: " + totalTimeBin);
          }
          arrayLength *= 2;
        }
    }
}
