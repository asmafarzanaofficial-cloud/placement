// You are using Java
import java.util.*;
class asc{
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        char ch=inp.next().charAt(0);
        if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
            System.out.println("int:"+(int)ch);
            System.out.println("float:"+(float)ch);
            System.out.println("byte:"+(byte)ch);
            System.out.print("short:"+(short)ch);
        }
        else{
            System.out.print("Invalid");
        }
    }
}
