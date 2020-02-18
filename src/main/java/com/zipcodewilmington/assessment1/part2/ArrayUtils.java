package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer num = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) num++;
        }
        return num;

        // for (Object i : objectArray) {
        //      if (i.equals(objectToCount)) num += 1;
                // return num;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
//        int counter = 0;
//        for (int i = 0; i < objectArray.length - 1; i++) {
//            if (objectArray[i] != objectToRemove) {
//                counter++;
//            }
//        }
//        Integer[] newArr = new Integer[counter];
//        int index = 0;
//        for (Object o : objectArray) {
//            if (o != objectToRemove) {
//                newArr[index] = (Integer) o;
//                index++;
//            }
//        }
//        return newArr;

        // int num = 0;
        // for (Object i : objectArray) {
        //    if (i.equals(objectToRemove)) num++;
        // }
        // Integer[] result = new Integer[objectArray.length - num];
        // for (Integer i = 0; i < objectArray.length; i++) {
        //    if (!objectArray[i].equals(objectToRemove)) {
        //      result[counter] = objectArray[i];
        //         j++;
        //      }
        // return result;

        ArrayList<Object> temp = new ArrayList<>();
        for (Object i : objectArray) {
            if (!i.equals(objectToRemove)) temp.add(i);
        }
        Integer[] foo = new Integer[temp.size()];
        return temp.toArray(foo);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int max = 0;
        int occ = 0;
        Object result = null;
        for (Object i : objectArray) {
            occ = getNumberOfOccurrences(objectArray, i);
            if (occ > max) {
                max = occ;
                result = i;
            }
        }
        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int min = objectArray.length; //Integer.MAX_VALUE;
        int occ = 0;
        Object result = null;
        for (Object i : objectArray) {
            occ = getNumberOfOccurrences(objectArray, i);
            if (occ < min) {
                min = occ;
                result = i;
            }
        }
        return result;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        ArrayList<Object> result = new ArrayList<>();

        for (Object i : objectArray) result.add(i);

        for (Object i : objectArrayToAdd) result.add(i);

        //result.addAll(Arrays.asList(objectArrayToAdd));

        Integer[] array = result.toArray(new Integer[objectArray.length + objectArrayToAdd.length]);

        return array;
    }
}
