package polyMorphismPkg;

import org.checkerframework.checker.units.qual.A;

public class BankExample {

    public static void main(String[] args) {

        RBIRules rbi;
        rbi=new SBIRules();
        System.out.println("SBI Rate of interest is: "+rbi.rbiROI());
        rbi=new AxisRules();
        System.out.println("Axis Rate of interest is: "+rbi.rbiROI());
        rbi=new RBIRules();
        System.out.println("RBI Rate of interest is: "+rbi.rbiROI());
    }

}
