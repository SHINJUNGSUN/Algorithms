# [Silver III] 두 수의 합 - 3273 

[문제 링크](https://www.acmicpc.net/problem/3273) 

### 성능 요약

메모리: 95484 KB, 시간: 720 ms

### 분류

정렬, 두 포인터

### 제출 일자

2025년 3월 19일 22:16:47

### 문제 설명

<p>n개의 서로 다른 양의 정수 a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>으로 이루어진 수열이 있다. a<sub>i</sub>의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다. 자연수 x가 주어졌을 때, a<sub>i</sub> + a<sub>j</sub> = x (1 ≤ i < j ≤ n)을 만족하는 (a<sub>i</sub>, a<sub>j</sub>)쌍의 수를 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다. (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)</p>

### 출력 

 <p>문제의 조건을 만족하는 쌍의 개수를 출력한다.</p>

### 정리
- 시간 복잡도: O(N) 또는 O(1,000,000)
  
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();

        boolean[] exist = new boolean[1000001];
        for (int i = 0; i < N; i++)
            exist[arr[i]] = true;

        int ans = 0;
        for (int i = 1; i <= (X - 1) / 2; i++) {
            if (i <= 1000000 && X - i <= 1000000)
                ans += (exist[i] && exist[X - i]) ? 1 : 0;
        }
        System.out.println(ans);
    }
}
```
