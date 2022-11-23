import java.util.Arrays;

public class Arrays_list {

    //문자열 비교 : equals()
    //문자열로 변환해주기 : toString()

    public static void main(String[] args) {
        int [] arr= {0,1,2,3,4};
        int [][] arr2D = {{11,12}, {21,22}};

        System.out.println(Arrays.toString(arr));
        //[0,1,2,3,4]가 출력된다. toString은 1차원 배열만 출력
        System.out.println(Arrays.deepToString(arr2D));
        //[[11,12], [21,22]]가 출력된다. deepTostring은 2차원 이상 배열부터만 출력해줌

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));  //false가 출력됨. equals는
        System.out.println(Arrays.deepEquals(str2D, str2D2));  //True가 출력됨.
    }

    //배열의 복사 : copyOf(), copyOfRange()

    int[] arr= {0,1,2,3,4};
    int[] arr2 = Arrays.copyOf(arr,arr.length);  //

}
