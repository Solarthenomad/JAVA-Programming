import java.util.Arrays;

//숫자 섞기 = math.random
public class print_list_ex2 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));
        //0~9까지 숫자들을 출력할 수 있다.

        for (int i = 0; i < 100; i++) {  //100번 두 요소값을 바꾸기를 한다. 그리고 아래의 세개 문장을 100번 반복한다는 것 즉 이 for문은 100번 섞는 것을 의미한다.
            int n = (int)(Math.random() * 10);   //random함수를 사용한 다음 0~9ㄲ 중의 한 값을 임의로 뽑아서 n안에 넣는 것이 가능하다. 아 근데 이부분이 겁나 이해가 안됨...
            int tmp = numArr[0];   //임의의 변수를 설정하고 변수의 값을 선언하고 초기화를 할 때는 항상 배열의 맨 처음 값을 넣어준다.
            numArr[0] = numArr[n];  //배열을 섞기 위해서는 두 수를 바꾸면 된다. numArr[0] = numArr[n]은 0번째와 n번째의 자리  즉 순서를 바꾸는 것이다.
            numArr[n] = tmp;
            //int tmp = numArr[0];에서 tmp라는 값을 설정한 뒤 이것에 numArr이라는 배열의 첫번째 요소를 넣어주고
            //numArr[0] = numArr[n];  //비어버린 numArr의 첫 번째 요소에 n번째 요소 값을 넣어준다.
            //numArr[n] = tmp;    //그렇게 되면 n번쨰가 비게 되니까 아까 0번째 넣어준 값인 tmp를 numArr[n]에 넣어주게 된다.

        }

        System.out.println(Arrays.toString(numArr));
        //main 문 반복

    }
}
