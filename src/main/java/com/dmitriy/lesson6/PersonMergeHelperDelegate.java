package com.dmitriy.lesson6;

/**
 * Created by dmitriy on 7/1/14.
 */
public class PersonMergeHelperDelegate {

    private final PersonMergeHelperImpl personResourse;

    public PersonMergeHelperDelegate(PersonMergeHelperImpl personResourse){
        this.personResourse = personResourse;
    }

    public Person[] merge(Person[] firstArray, Person[] secondArray){

        return personResourse.merge(firstArray,secondArray);

    }

}
