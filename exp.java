import java.util.*;
import java.text.DecimalFormat;
class exp{
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        double b=inp.nextDouble();
        double t=inp.nextDouble();
        double f=inp.nextDouble();
        double l=inp.nextDouble();
        double tot=0.0;
        tot=b+t+f+l;
        double a1=b/tot;
        double a2=t/tot;
        double a3=f/tot;
        double a4=l/tot;
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("Total expenses: Rs."+df.format(tot));
        System.out.println("Branding expenses percentage: "+df.format(a1*100)+"%");
        System.out.println("Travel expenses percentage: "+df.format(a2*100)+"%");
        System.out.println("Food expenses percentage: "+df.format(a3*100)+"%");
        System.out.println("Logistics expenses percentage: "+df.format(a4*100)+"%");
        
    }
}
