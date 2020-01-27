import ObserverPattern.ObserverA;
import ObserverPattern.ObserverB;
import ObserverPattern.Subject;
import StrategyPattern.ExtremeStrength;
import StrategyPattern.SpiderMan;
import StrategyPattern.SpiderWebs;
import StrategyPattern.UseGadgets;

public class Main {

    public static void main(String[] args) {
        boolean observer = false;
        boolean strategy = false;
        boolean decorator = true;

        //OBSERVER - main SUBJECT class keeps track of data and notifies OBSERVERS when data changes
        if(observer){
            System.out.println("---------- OBSERVER PATTERN ----------");
            Subject subject = new Subject();

            //create observers and pass in subject they want to observe (constructor code will add them as observers to the subject)
            new ObserverA(subject);
            new ObserverB(subject);

            //subject data changes and automatically updates all observers...triggering their souts (reporting the changed number)
            subject.changeUnstableInt();
        }

        //STRATEGY - code to an INTERFACE so can easily change method behavior at runtime, by using different IMPLEMENTATION of that interface
        //like services cuz can use any implementation of that service interface anywhere in the app...FLEXIBLE!!
        if (strategy){
            System.out.println("---------- STRATEGY PATTERN ----------");
            System.out.println();
            System.out.println("SpiderMan does the following...isn't it cool how he can perform so many powers w/o changing the code?!");
            System.out.println("--------------------------");
            //can change Spiderman's super power dynamically cuz performSuperPower() and changeSuperPower() accept any class that IMPLEMENTS SuperPowerInterface as parameter
            SpiderMan spiderMan = new SpiderMan(new SpiderWebs());
            spiderMan.performSuperPower();
            spiderMan.changeSuperPower(new ExtremeStrength());
            spiderMan.performSuperPower();
            spiderMan.changeSuperPower(new UseGadgets());
            spiderMan.performSuperPower();
        }

        if(decorator){
            System.out.println("---------- DECORATOR PATTERN ----------");
        }

    }
}
