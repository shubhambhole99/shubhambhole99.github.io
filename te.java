class Solution {
    public int divide(int dend, int sor) {

    boolean sign=(dend>=0)==(sor>=0)?true:false;
    if(dend>=2147483647 && Math.abs(sor)==1){
        return sign?2147483647:-2147483647;
    }
    if(dend<=-2147483648 && Math.abs(sor)==1){
return sign?2147483647:-2147483648;
    }
    
int result=0;
 dend=Math.abs(dend);
sor=Math.abs(sor);
    while(dend-sor>=0){
        int count=0;
        while(dend-(sor<<1<<count)>=0){
            count++;
        }
        result+=1<<count;
        dend=dend-(sor<<count);
    }
    return sign?+result:-result;   
    }
}