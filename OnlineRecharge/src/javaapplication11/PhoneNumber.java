
package javaapplication11;

import java.io.Serializable;


public class PhoneNumber  implements Serializable{
    public long mobno;
    public String Operator;
    public int balance;
    public PhoneNumber(long num,String op, int bal)
    {
        mobno=num;
        Operator=op;
        balance=bal;
        
    }
}
