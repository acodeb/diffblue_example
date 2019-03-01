package com.diffblue;

public class ArrayContainsValue {
    public static <T> boolean contains(T[] array, T searchValue) {

        if( searchValue != null ){

            for(T value : array){

                if( value == searchValue || value.equals(searchValue)){
                    return true;
                }
            }
        }
        return false;
    }
}
