package util;
// 배열을 다룰 때 도움이 되는 메소드들과
// 동적할당을 사용할 때 필요로 하는 메소드들이 담겨있는
// ArrayUtil 클래스


public class ArrayUtil {
    // 1. int[] 기준
    // A. 현재 배열의 길이를 알려주는 size(int[])
    public static int size(int[] array) {
        return array.length;
    }
    
    // B. 현재 배열이 비어있는 배열인지 확인해주는 isEmpty(int[])
    public static boolean isEmpty(int[] array) {
        return size(array) == 0;
    }
    
    // C. 해당 배열의 특정 인덱스의 값을 리턴하는 get(int[], int)
    public static int get(int[] array, int index) {
        return array[index];
    }
    
    // D. 해당 배열에 특정 값이 존재하는지 확인해주는 contains(int[], int)
    public static boolean contains(int[] array, int element) {
        for(int i = 0; i < size(array); i++) {
            if(element == get(array, i)) {
                return true;
            }
        }
        
        return false;
    }
    
    // E. 해당 배열에 특정 값의 가장 먼저 등장하는 인덱스가 몇번인지 찾아주는 indexOf(int[], int)
    //    단, 해당 값이 존재하지 않으면 -1이 리턴된다.
    public static int indexOf(int[] array, int element) {
        for(int i = 0; i < size(array); i++) {
            if(element == get(array, i)) {
                return i;
            }
        }
        
        return -1;
    }
    
    // F. 해당 배열에 특정 값의 가장 나중에 등장하는 인덱스가 몇번인지 찾아주는
    //    lastIndexOf(int[], int)
    //    단, 해당 값이 존재하지 않으면 -1이 리턴된다.
    public static int lastIndexOf(int[] array, int element) {
        for(int i = size(array) -1; i >= 0; i--) {
            if(element == get(array, i)) {
                return i;
            }
        }
        
        return -1;
    }
    
    // G. 해당 배열의 크기를 1 늘리고 가장 마지막 칸에 새로운 요소를 추가하는
    //    add(int[], int)
    public static int[] add(int[] array, int element) {
        // 1. 파라미터 array보다 크기가 1 늘어난 배열을 선언과 초기화한다.
        int[] temp = new int[size(array) + 1];
        // 2. array의 전체 내용을 temp에 저장한다.
        for(int i = 0; i < size(array); i++) {
            temp[i] = get(array, i);
        }
        // 3. temp의 가장 마지막 인덱스에 element를 저장한다.
        temp[size(temp) -1] = element;
        // 4. temp를 리턴한다.
        return temp;
        
        
    }
    
    // H. 해당 배열의 특정 인덱스에 새로운 요소를 추가하는
    //    add(int[], int, int)
    public static int[] add(int[] array, int index, int element) {       
        
        // 1. 길이가 0인 int[] temp를 선언하고 초기화한다.
        int[] temp = new int[0];
        
        // 2. for문을 사용하여
        //    0번 인덱스부터 index 전까지를 temp에 추가한다.       
        for(int i = 0; i < index; i++) {
           temp = add(temp, get(array, i));
        }
        
        // 3. temp에 element를 추가한다.
        temp = add(temp, element);
        
        // 4. array배열의 index부터 끝까지를 temp에 추가한다.
        for(int i = index; i < size(array); i++) {
            temp = add(temp, get(array, i));
        }
               
        return temp;
        
    }
    
    // I. 해당 배열의 특정 인덱스에 새로운 값을 저장하고
    //    원래 있던 값은 리턴하는 set(int[], int, int)
    public static int set(int[] array, int index, int element) {
        // 1. index번에 저장된 값을 임시로 int temp에 저장한다.
        int temp = get(array, index);        
        // 2. index번에 element를 저장한다.
        array[index] = element;
        // 3. temp를 리턴한다.
        return temp;
    }
    
    // J. 특정 인덱스의 값을 배열에서 삭제하는
    //    remove(int[], int).
    //    단, 우리 배열이 int[]이기 때문에 K에 나올 메소드와 구분하기 위하여
    //    이번 한번만은 removeByIndex(int[], int) 라고 한다.
    //    또한, 잘못된 index가 파라미터로 넘어올 경우,
    //    변경되지 않은 int[]이 리턴된다.
    public static int[] removeByIndex(int[] array, int index) {
        // 1. 크기가 0인 int[] temp 선언 및 초기화
        int[] temp = new int[0];
        // 2. array의 길이 만큼 반복되는 for문 시작
        for(int i = 0; i < size(array); i++) {
            // 3. for문을 반복하면서 i가 index와 다르면
            //    array의 i번째 값을 temp에 추가
            if(i != index) {
                temp = add(temp, get(array, i));
            }
        }
        // 4. temp를 리턴한다.
        return temp;
    }
    
    // K. 해당 배열에서 특정 요소를 제거하는
    //    removeByElement(int[], int)
    //    단, 해당 배열에 해당 요소가 없을 경우에는 
    //    아무것도 제거하지 않는다.
    //    또한 해당 배열에서 똑같은 요소가 여러개일 경우에는
    //    가장 먼저 등장하는 요소를 제거한다.
    public static int[] removeByElement(int[] array, int element) {
        // 1. array에서 해당 element의 인덱스를 찾아서 삭제한 결과를 리턴한다.
        return removeByIndex(array, indexOf(array, element));
    }
    

}
