import java.util.*;

public class DXeniaAndBitOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ele = (int)Math.pow(2, n);
        int q=sc.nextInt();
        int seg[]=new int[4*ele];
        int arr[]=new int[ele];
        for(int i =0;i<ele;i++) arr[i]=sc.nextInt();
        boolean flag=(n%2 == 0);
        build(seg,0,arr,0,ele - 1,flag);
        while(q-- >0){
            int i=sc.nextInt();
            int val=sc.nextInt();
            update(seg,0,i-1,val,0,ele - 1,flag);
            System.out.println(seg[0]);
        }
    }
    public static void build(int seg[], int idx,int arr[],int low,int high,boolean flag){
        if(low == high){
            seg[idx] = arr[low];
            return;
        }
        int mid=(high + low)>>1;
        build(seg,idx*2+1,arr,low,mid,!flag);
        build(seg,idx*2+2,arr,mid+1,high,!flag);
        if(flag) seg[idx] = seg[idx*2+1] ^ seg[idx*2+2];
        else seg[idx] = seg[idx*2+1] | seg[idx*2+2];
    }
    public static void update(int seg[], int idx,int pos,int val,int low,int high,boolean flag){
        if(low == high){
            seg[idx] = val;
            return;
        }
        int mid=(high + low)>>1;
        if(pos <= mid) update(seg,idx*2+1,pos,val,low,mid,!flag);
        else update(seg,idx*2+2,pos,val,mid+1,high,!flag);

        if(flag) seg[idx] = seg[idx*2+1] ^ seg[idx*2+2];
        else seg[idx] = seg[idx*2+1] | seg[idx*2+2];
    }
}