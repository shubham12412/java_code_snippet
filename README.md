# java_code_snippet
code snippet for java

(1) import java.util.Collections; \
Collections.emptyList();

(2)import java.util.Arrays;\
Arrays.sort(array);\
Arrays.sort(intervals, (i1, i2) -> i1.start - i2.start);

(3)import java.util.Comparator; \
```
		new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				
				return 0;
			}
		};
```
better use lambda expression \
##### (o1,o2 -> {})


(4)
