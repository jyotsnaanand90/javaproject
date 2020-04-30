
package javaapplication11;

import java.io.Serializable;


public class Accounts implements Serializable{
 public long cardNo;
 public int balance;
 public String password;
 
 public Accounts(long l,int i,String password1){
     cardNo=l;
     balance=i;
     password=password1;
 }

     
}
