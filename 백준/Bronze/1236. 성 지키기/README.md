# [Bronze I] 성 지키기 - 1236 

[문제 링크](https://www.acmicpc.net/problem/1236) 

### 성능 요약

메모리: 17760 KB, 시간: 180 ms

### 분류

구현

### 제출 일자

2025년 3월 19일 20:29:19

### 문제 설명

<p>영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다. 영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.</p>

<p>성의 크기와 경비원이 어디있는지 주어졌을 때, 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 성의 세로 크기 N과 가로 크기 M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 성의 상태가 주어진다. 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.</p>

### 출력 

 <p>첫째 줄에 추가해야 하는 경비원의 최솟값을 출력한다.</p>

### 정리
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        } // O(N * M)

        // 1. 각 행/열에 대해 경비원이 있는지 확인한다.
        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[M];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (map[r][c] == 'X') {
                    existRow[r] = true;
                    existCol[c] = true;
                }
            }
        } // O(N * M)

        // 2. 보호받지 못하는 행/열의 개수를 구한다.
        int needRowCount = N;
        int needColCount = M;
        for (int r = 0; r < N; r++) {
            if (existRow[r]) needRowCount--;
        } // O(N)
        for (int c = 0; c < M; c++) {
            if (existCol[c]) needColCount--;
        } // O(M)

        // 시간복잡도 : O(N * M) + O(N * M) + O(N) + O(M) => O(NM)

        // 3. 둘 중 큰 값을 출력한다.
        System.out.println(Math.max(needRowCount, needColCount));
    }
}
```
