package com.smartinterview.codechef.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/LTIME110D/problems/EZSPEAK
 */
public class EasyPronunciation {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        char[] charArr = {'a','e','i','o','u'};
        for(int i=0;i<t;i++) {
            int N = Integer.parseInt(br.readLine());
            String input= br.readLine();
            int contCount = 0;
            for(int j=0;j<N;j++){
                if(input.charAt(j)!=charArr[0] ||
                        input.charAt(j)!=charArr[1] || input.charAt(j)!=charArr[3] ||
                        input.charAt(j)!=charArr[2] || input.charAt(j)!=charArr[4] ) {
                    contCount++;
                }
                if(input.charAt(j)==charArr[0] ||
                        input.charAt(j)==charArr[1] || input.charAt(j)==charArr[3] ||
                        input.charAt(j)==charArr[2] || input.charAt(j)==charArr[4] ) {
                    contCount=0;
                }
                if(contCount>=4){
                    break;
                }
            }

            if(contCount>=4){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
