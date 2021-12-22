# emp_JWJ
Roster: Jefford Shau, William Vongphanith, Jacob Kirmayer

## Tests Performed ##
  We tested through different array lengths of size 2^n, with n being an integer from 0 to 27. We tested each array size 1000 times for both Binary Search and Linear Search. We used arrays where their values matched their indexes, making them ordered arrays in ascending order, and a random target value in each test. We stored the average time and the maximum time run for each array size and printed this data.

## Results ##
  In our results, we found that the average time for Linear Search increases exponentially while the average time for Binary Search increases  linearly. 
  For all our test cases, we found that the average time for Binary Search is always less than 1 millisecond, while Linear Search begins to exceed 1 millisecond between array sizes 1_048_576 and 2_097_152.
  For array size of length 134_217_728, the average time for Linear Search was around 60 milliseconds, while the average time for Binary Search was around 0.025 milliseconds. For array size of length 134_217_728, the average time for Linear Search was around 120 milliseconds, while the average time for Binary Search was around 0.028 milliseconds. 
  
One run-through is shown below. 
  
**Array Size**|**AvgLin (ms)**|**MaxLin (ms)**|**AvgBin (ms)**|**MaxBin (ms)**
:-----:|:-----:|:-----:|:-----:|:-----:
2|0.001|1|0.001|1
4|0.001|1|0.002|1
8|0.001|1|0.002|1
16|0.001|1|0.002|1
32|0.001|1|0.002|1
64|0.001|1|0.002|1
128|0.001|1|0.002|1
256|0.001|1|0.002|1
512|0.001|1|0.002|1
1024|0.001|1|0.002|1
2048|0.001|1|0.002|1
4096|0.002|1|0.002|1
8192|0.004|1|0.002|1
16384|0.007|1|0.003|1
32768|0.013|1|0.003|1
65536|0.028|1|0.003|1
131072|0.068|2|0.003|1
262144|0.131|2|0.004|1
524288|0.258|2|0.004|1
1048576|0.548|2|0.005|1
2097152|1.63|5|0.005|1
4194304|3.439|5|0.008|1
8388608|7.269|12|0.009|1
16777216|15.08|29|0.01|1
33554432|30.379|30|0.013|1
67108864|58.437|73|0.014|1
134217728|120.538|135|0.016|1

## Conclusions ##
  Through the results above, we concluded that there were a few cases where Linear Search was faster than Binary Search for array sizes of 2 to 4096. However, larger arrays always demonstrated that Binary Search was faster than Linear Search because it took less time. 
