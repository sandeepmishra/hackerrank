package com.bit.manipulation;

public class SetXthBit {
    public static void main(String[] args) {

    }

    /**
     * shift 1 by k and do (|) with number
     *  n | (1<<k)
     * @param n
     * @param k
     * @return
     */
    public static int setKthValueToOne(int n, int k){
        return n | (1<<k);
    }

    /**
     *  shift 1 by k and do masking by applying ~ (flip bit 1 to 0 and 0 to 1) and (&) operation with number
     *  n & (~(1<<k))
     * @param n
     * @param k
     * @return
     */
    public static int setKthValueToZero(int n, int k){
        return n & (~(1<<k));
    }

    /**
     * can get by doing & on kth bit of given number (n & 1<<k OR n >> k & 1)
     * @param n
     * @param k
     * @return
     */
    public static int getKthBit(int n, int k){
        int result =  n&(1<<k);
        if(result == 0){
            return 0;
        }
        return 1;
    }



}
