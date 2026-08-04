import java.util.*;

public class CSerejaAndBrackets {
    static class thr{
        int o;
        int c;
        int f;
        thr(int _o,int _c,int _f){
            o=_o;
            c=_c;
            f=_f;
        }
    }
    public static thr marge(thr i,thr j){
        thr th=new thr(0,0,0);
        int match = Math.min(i.o, j.c);
        th.f=i.f+j.f+match;
        th.f = i.f + j.f + match;
        th.o = i.o + j.o - match;
        th.c = i.c + j.c - match;
        return th;
    }
    public static void build(thr seg[],int idx,String s,int low,int high){
        if(low == high){
            if(s.charAt(low) == '(')
                seg[idx]=new thr(1,0,0);
            else
                seg[idx]=new thr(0,1,0);
            return;
        }
        int mid=(low + high)>>1;
        build(seg,idx*2+1,s,low,mid);
        build(seg,idx*2+2,s,mid+1,high);
        seg[idx] = marge(seg[idx*2+1] , seg[idx*2+2]);
    }
    public static thr query(thr seg[],int idx,int low,int high , int l,int r){
        if(high < l || low > r) return new thr(0,0,0);
        if(low >= l && high <= r) return seg[idx];

        int mid = (high + low)>>1;
        thr lh=query(seg,idx*2+1,low,mid,l,r);
        thr rh=query(seg,idx*2+2,mid+1,high,l,r);
        return marge(lh,rh);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int t=sc.nextInt();
        int n=s.length();
        thr seg[]=new thr[n*4];
        build(seg,0,s,0,n-1);
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;
            thr ans = query(seg,0,0,n-1,l,r);
            sb.append(2 * ans.f).append('\n');
        }
        System.out.print(sb);
    }
}