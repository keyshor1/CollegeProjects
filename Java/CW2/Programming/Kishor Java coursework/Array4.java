public class Array4 {
    boolean status = true;
    public int isFilter(int[] Array4){
        for (int i = 0; i <= Array4.length - 1; i++){
            if(Array4[i]==9){
                for (int j = 0; j <= Array4.length - 1; j++){
                    if(Array4[j]==11){
                        status = true;
                    }
                    else{
                        status = false;
                    }
                }
            }
            if(Array4[i]==7){
                for (int j = 0; j <= Array4.length - 1; j++){
                    if(Array4[j]==13){
                        status = false;
                    }
                    else{
                        status = true;
                    }
                }
            }
        }
        if (status == false){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String args[]){
        Array4 fa = new Array4();
        int[] Array4={1, 2, 3, 9, 6, 11, 7, 13};
        System.out.println(fa.isFilter(Array4));
    }
}