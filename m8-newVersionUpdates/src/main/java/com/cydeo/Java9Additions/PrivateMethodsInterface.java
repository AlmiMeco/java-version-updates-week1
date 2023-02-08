package com.cydeo.Java9Additions;

import java.time.LocalDate;

                     /**BOTH RED SEGMENTS ARE THE SAME CODE (ONE IS IMPLEMENTING THE REPETITIVE CODE)**/

public interface PrivateMethodsInterface {


// w/out private methods
    boolean isHoliday(LocalDate date);
    default boolean isBusinessDay(LocalDate date){
        if (date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
        return !isHoliday(date);
    }
//======================================================================================================================
//======================================================================================================================

//  w/ private methods (implementation)
    default LocalDate nextDay(LocalDate date){
       validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate) : nextDate;
        }


// PRIVATE METHOD (JAVA 9)
    private void validate (LocalDate date){
        if (date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }

//======================================================================================================================
//======================================================================================================================




}





