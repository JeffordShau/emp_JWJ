# emp_JWJ
Roster: Jefford Shau, William Vongphanith, Jacob Kirmayer

## Tests Performed ##
  We tested through different array lengths of size 2^n, with n being an integer from 0 to 27. We tested each array size 1000 times for both Binary Search and Linear Search. We used arrays where their values matched their indexes, making them ordered arrays in ascending order, and a random target value in each test. We stored the average time and the maximum time run for each array size and printed this data.

## Results ##
  In our results, we found that the average time for Linear Search increases exponentially while the average time for Binary Search increases at a much lower rate than Linear Search. For instance, the average time for Binary Search is always less than 1 millisecond in our test cases, while Linear Search exceeds 1 millisecond for array size of length 1_048_576. We also found more specific results below. For array size of length 134_217_728, the average time for Linear Search was around 60 milliseconds, while the average time for Binary Search was around 0.025 milliseconds. In addition, for array size of length 134_217_728, the average time for Linear Search was around 120 milliseconds, while the average time for Binary Search was around 0.028 milliseconds. 

## Conclusions ##
  Through the results above, we concluded that Binary Search was much faster than Linear Search because Binary Search took less time to complete than Linear Search.

(Measured in milliseconds)

**AvgLin**|**AvgBin**|**MinLin**|**MinBin**|**MaxLin**|**MaxBin**
:-----:|:-----:|:-----:|:-----:|:-----:|:-----:
0|0|0|0|1|0
0|0|0|0|0|0
0|0|0|0|0|0
0|0|0|0|0|0
0|0|0|0|0|0
0|0|0|0|0|0
0|0|0|0|0|0
0|0|0|0|0|0
0|0|0|0|1|0
0|0|0|0|0|0
0|0|0|0|0|0
0|0|0|0|0|1
0|0|0|0|0|0
0|0|0|0|1|0
0|0|0|0|1|0
0|0|0|0|1|0
0|0|0|0|1|0
0|0|0|0|1|0
0|0|0|0|1|0
0|0|0|0|1|0
0|0|0|0|2|0
1|0|0|0|3|0
2|0|0|0|6|0
7|0|0|0|15|0
16|0|3|0|28|0
28|0|0|0|60|0
65|0|6|0|114|0