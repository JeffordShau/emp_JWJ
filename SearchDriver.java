
public class SearchDriver {
    public static void main(String[] args) {
        int arrayLength = 1;
        for (int i = 0; i < 21; i++) {
            int[] normalArray = new int[arrayLength];
            for (int j = 0; j < normalArray.length; j++) {
                normalArray[j] = (int) Math.random() * 1048576;
            }
            int randomIndex = (int) (Math.random() * arrayLength);
            int randomValue = normalArray[randomIndex];

            int startTimeLin = (int) System.currentTimeMillis();
            LinSearch.linSearch(normalArray, randomValue);
            int totalTimeLin = (int) System.currentTimeMillis() - startTime;

            int startTimeBin = (int) System.currentTimeMillis();
            BinSearch.binSearch(normalArray, randomValue);
            int totalTimeBin = (int) System.currentTimeMillis() - startTime;

            System.out.println("Array size: " + arrayLength + "; Random value: " + randomValue + "; LinSearch: " + totalTimeLin + "; BinSearch: " + totalTimeBin);
            arrayLength *= 2;
        }
    }
}
