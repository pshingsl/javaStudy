package javaStudy.ch10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Ex11_10 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A = " + setA); // A = [1, 2, 3, 4, 5]

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = " + setB);

        Iterator iterator = setB.iterator();
        while (iterator.hasNext()){
            Object tmp = iterator.next();
            if(setA.contains(tmp))
                setKyo.add(tmp);
        }

        iterator = setA.iterator();
        while (iterator.hasNext()){
            Object tmp = iterator.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);
        }

        iterator = setA.iterator();
        while (iterator.hasNext())
            setHab.add(iterator.next());

        iterator = setB.iterator();
        while (iterator.hasNext())
            setHab.add(iterator.next());

        System.out.println("교집합: " + setKyo);
        System.out.println("합집합: " + setHab);
        System.out.println("차집합: " + setCha);
    }
}
