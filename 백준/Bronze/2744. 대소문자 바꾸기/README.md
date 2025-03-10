# [Bronze V] 대소문자 바꾸기 - 2744 

[문제 링크](https://www.acmicpc.net/problem/2744) 

### 성능 요약

메모리: 17588 KB, 시간: 172 ms

### 분류

구현, 문자열

### 제출 일자

2025년 3월 10일 12:09:58

### 문제 설명

<p>
	영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>
	첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.</p>

### 출력 

 <p>
	첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.</p>

### 정리
<img src="https://upload.wikimedia.org/wikipedia/commons/1/1b/ASCII-Table-wide.svg" />

- 알파벳 대문자 : 'A'(65) ~ 'Z'(90)
- 알파벳 소문자 : 'a'(97) ~ 'z'(122)

```java
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();
        for (int i = 0; i < ans.length; i++) {
            if ('A' <= ans[i] && ans[i] <= 'Z') ans[i] = (char)('a' + ans[i] - 'A');
            else ans[i] = (char)('A' + ans[i] - 'a');
        }
        System.out.println(ans);
    }
}
```
