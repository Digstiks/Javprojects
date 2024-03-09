package oop.lesson7.avtomobile;

public class recursion {
    public int sum(int number){
        if(number<0){
            return 0;
        }
        int result=number+sum(number-1);
        return result;
    }

}
