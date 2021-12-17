
public class SearchDriver {
    public static void main(String[] args) {
        int arrayLength = 1;
        for (int i = 0; i < 21; i++) {
            OrderedArrayList normalArray = new OrderedArrayList();
            for (int j = 0; j < Math.pow(2,i); j++) {
                normalArray.add((int) (Math.random() * 1048576));
            }
            int randomIndex = (int) (Math.random() * arrayLength);
            int randomValue = normalArray.get(randomIndex);

            int startTimeLin = (int) System.currentTimeMillis();
            LinSearch.linSearch(normalArray._data, randomValue);
            int totalTimeLin = (int) System.currentTimeMillis() - startTimeBin;

            int startTimeBin = (int) System.currentTimeMillis();
            BinSearch.binSearch(normalArray._data, randomValue);
            int totalTimeBin = (int) System.currentTimeMillis() - startTimeBin;

            System.out.println("Array size: " + arrayLength + "; Random value: " + randomValue + "; LinSearch: " + totalTimeLin + "; BinSearch: " + totalTimeBin);
            arrayLength *= 2;
        }
    }
}
