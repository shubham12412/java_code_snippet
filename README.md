# java_code_snippet
code snippet for java

(1) import java.util.Collections; \
Collections.emptyList();

(2)import java.util.Arrays;\
Arrays.sort(intervals);\
Arrays.sort(intervals, (i1, i2) -> i1.start - i2.start);   // here i1,i2 is Interval class
Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);       // here i1,i2 is one dimensional array

(3)import java.util.Comparator; \
```
		new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				
				return 0;
			}
		};
```
better use lambda expression 
##### (o1,o2 -> {})
#### NOTE: but ***anonymous inner class*** solution is faster compared to lambda ,,,, need to explore ???? find example below

https://leetcode.com/submissions/detail/229290672/  6ms \
https://leetcode.com/submissions/detail/229289635/ 38ms


(4)
