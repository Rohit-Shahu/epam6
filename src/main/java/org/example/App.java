package org.example;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    private static boolean addNumber(Collection<Integer> list1,int n){
        list1.add(n);
        System.out.println(n+" is has been added to the list.");
        return true;
    }
    private static boolean removeNumber(Collection<Integer> list1, int n){
        if(list1.contains(n)) {
            list1.remove(n);
            System.out.println(n + " is has been removed from the list.");
            return true;
        }
        else {
            System.out.println(n+" is not available in the list.");
            return false;
        }
    }
    private static void printList(Collection<Integer> list1){
        for (int i : list1){
            System.out.println("The elements are : "+i);
        }
    }
    private static int fetchNumber(ArrayList<Integer> list1, int i){
        if (list1.get(i) > list1.size()){
            throw new IndexOutOfBoundsException();
        }
        else{
            System.out.println("The item is "+list1.get(i));
            return list1.get(i);
        }
    }

}
