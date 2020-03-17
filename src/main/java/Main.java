import designpatterns.AdapterPattern.AdapterMain;
import designpatterns.CommandPattern.CommandMain;
import designpatterns.DecoratorPattern.DecoratorMain;
import designpatterns.FacadePattern.FacadeMain;
import designpatterns.FactoryPattern.FactoryMain;
import designpatterns.ObserverPattern.ObserverMain;
import designpatterns.ParentMain;
import designpatterns.SingletonPattern.SingletonMain;
import designpatterns.StatePattern.states.StateMain;
import designpatterns.StrategyPattern.*;
import designpatterns.TemplateMethodPattern.TemplateMethodMain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, ParentMain> patternsMap = new HashMap<>();
    private static String userInput;
    private static boolean loop = true;

    //TODO need to add better Sout messages to each PatternMain to explain what is happening
    public static void main(String[] args) {
        populatePatternsMap();
        System.out.println("Type appropriate number to see each design pattern in action!");
        showPatternsKeySet();

        while(loop){
            System.out.println();
            System.out.println("Number (or command) >>>");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine().trim();

            try{
               Integer integerInput = Integer.parseInt(userInput);
                if(patternsMap.containsKey(integerInput)){
                    ParentMain patternMain = patternsMap.get(integerInput);
                    patternMain.execute();
                }
                else{
                    printInvalidInputMessage();
                }
            }
            catch (NumberFormatException e){
                checkForValidInputAndDisplayMessage();
            }
        }
    }

    private static void checkForValidInputAndDisplayMessage() {
        if(userInput.equalsIgnoreCase("patterns")){
            showPatternsKeySet();
        }
        else if(userInput.equalsIgnoreCase("help")){
            displayHelpInfo();
        }
        else if(userInput.equalsIgnoreCase("exit")){
            loop = false;
        }
        else{
            printInvalidInputMessage();
        }
    }

    private static void populatePatternsMap(){
        patternsMap.put(1, new AdapterMain("Adapter"));
        patternsMap.put(2, new CommandMain("Command"));
        patternsMap.put(3, new DecoratorMain("Decorator"));
        patternsMap.put(4, new FacadeMain("Facade"));
        patternsMap.put(5, new FactoryMain("Factory"));
        patternsMap.put(6, new ObserverMain("Observer"));
        patternsMap.put(7, new SingletonMain("Singleton"));
        patternsMap.put(8, new StrategyMain("Strategy"));
        patternsMap.put(9, new TemplateMethodMain("Template Method"));
        patternsMap.put(10, new StateMain("State"));
    }
    private static void showPatternsKeySet(){
        System.out.println("Design Patterns:");
        for (Map.Entry<Integer, ParentMain> pattern: patternsMap.entrySet()) {
            System.out.println(pattern.getKey() + " - " + pattern.getValue().toString(pattern.getValue()));
        }
    }

    private static void displayHelpInfo(){
        System.out.println("Other commands include:");
        System.out.println("Exit - end program");
        System.out.println("Patterns - show key/value list of all Design Patterns.");
    }

    private static void printInvalidInputMessage() {
        System.out.println("Invalid input. Please try again.");
    }
}

