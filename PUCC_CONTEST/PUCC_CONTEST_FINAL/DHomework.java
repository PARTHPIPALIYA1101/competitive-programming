import java.util.*;
 
public class DHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int cnt[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        List<int[]> freq=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(cnt[i] > 0){
                freq.add(new int[]{cnt[i],i});
            }
        }
        Collections.sort(freq,(a,b)-> a[0]-b[0]);
        boolean removed[]=new boolean[26];
        for (int[] pair : freq) {
            if (k >= pair[0]) {
                k -= pair[0];
                removed[pair[1]] = true;
            } else {
                break;
            }
        }
        int distinct = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > 0 && !removed[i]) {
                distinct++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!removed[c - 'a']) {
                ans.append(c);
            }
        }
        System.out.println(distinct);
        System.out.println(ans.toString());
    }
}