# emp_JWJ
Roster: Jefford Shau, William Vongphanith, Jacob Kirmayer

## Tests Performed ##
  We tested through different different array lengths of size 2^n, for n being an integer from 0 to 27. We tested each array 1000 times for both Binary Search and Linear Search. We used arrays where their values matched their indexes (ordered array) and a random target value in each test. We stored the average time and the max time run for each array size and printed this data.

## Results ##
  In our results, we found that the average time for Linear Search increases exponentially while the average time for Binary Search increases at a lower rate than Linear Search. For instance, for array size 134_217_728, the average time for Linear Search was around 60 milliseconds, while the average time for Binary Search was around 0.020 milliseconds. In addition, for array size 134_217_728, the average time for Linear Search was around 120 milliseconds, while the average time for Binary Search was around 0.20 milliseconds.

## Conclusions ##
  Through the results above, we concluded that Binary Search was much faster than Linear Search.

/*
README.md updated:

    Section with heading “Tests Performed” delineating test performed.
        Should reflect plan, after any peer-suggested modifications.
        Only tests actually run. (ie, Not portions of plan that never got implemented.)
        Abstraction level: Specific enough for an interested party to assess whether or not your experiment is valid – but not so detail-rich that your test methodology becomes obfuscated. (There should be little to no Java; anyone can read your source code if they need to see those specifics.)
    Section with heading “Results” containing clear summary of generated data.
    Section with heading “Conclusions” containing clearly stated conclusions drawn from generated data.
*/
