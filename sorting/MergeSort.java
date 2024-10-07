public class MergeSort {

    public static void mergeSort(int[] arr, int si, int ei) {
        //base condition
        if(si>=ei) return;

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);

    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int i=si;
        int j=mid+1;
        int k = 0;

        int[] temp = new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i] > arr[j]){
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while(i<=mid) {
            temp[k++] = arr[i++];
        }

        while(j<=ei) {
            temp[k++] = arr[j++];
        }

        for(int a=0, b=si; a<temp.length; a++, b++) {
            arr[b] = temp[a];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,7,6};

        mergeSort(arr, 0, arr.length-1);

        for(int num : arr) {
            System.out.print(num+ " ");
        }
    }
}