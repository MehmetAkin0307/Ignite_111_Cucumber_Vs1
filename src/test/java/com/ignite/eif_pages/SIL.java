package com.ignite.eif_pages;

import com.ignite.pojos.Parent;
import org.junit.Assert;

public class SIL {


    public static void main(String[] args) {

        String arr[]={"Ignite 111","Ignite 112","Ignite 113"};



        try{
            System.out.println(arr[0]);




        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Adreste kaydedilecek okul yok.");
        }
   /*     int arr[]={0,1,2,3,4,5};



        try{
            System.out.println(arr[6]);




        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("girdigi index array de yok");
        }

        String name=findCellfromTableXpath(3,4).getText;
        Parent parent=new Parent();
        Assert.assertEquals(name, parent.firstName);

        System.out.println(findCellfromTableXpath(5,3));

    }

    public static String findCellfromTableXpath(int row, int coloum){
        return "table[@role='presentation']/tbody/tr["+row+"]/td["+coloum+"]";
    }


}
*/

    }
}