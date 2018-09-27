package thisIsJAVA.Practice.chapter14;

import thisIsJAVA.Practice.chapter14.functionalinterface.MyFunctionalInterface;
import thisIsJAVA.Practice.chapter14.returnfunctionalinterface.MyReturnFunctionalInterface;

public class Main {
    public static void noneReturnMethod(){
        MyFunctionalInterface fi = ()->{
            int i = 0;
            while(i <10){
                System.out.println(i);
                i++;
            }
        };

        fi.method1();

        fi = ()->{
            System.out.println("fi 실행");
        };

        fi.method1();

    }

    public static void returnMethod(){
        MyReturnFunctionalInterface rfi = (x,y) ->  x+y;

        System.out.println(rfi.method(3,4));

        rfi = (sum, multi) ->{
          while(sum>1){
              sum--;
              multi *= sum;
          }
          return multi;
        };

        System.out.println(rfi.method(4,2));

    }

    public static void main(String[] args) {
        noneReturnMethod();
        returnMethod();
    }
}
