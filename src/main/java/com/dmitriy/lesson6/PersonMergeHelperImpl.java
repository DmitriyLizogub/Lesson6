package com.dmitriy.lesson6;

import java.util.*;

/**
 * Created by dmitriy on 7/1/14.
 */
public class PersonMergeHelperImpl implements PersonMergeHelper {

    @Override
    public Person[] merge(Person[] firstArray, Person[] secondArray) {

        List<Person> mergeList = new ArrayList<Person>(firstArray.length + secondArray.length);
        Collections.addAll(mergeList, firstArray);
        Collections.addAll(mergeList, secondArray);

        PersonComparator personComparator = new PersonComparator();
        Collections.sort(mergeList, personComparator);

        PersonMergeHelperImpl personMergeHelper = new PersonMergeHelperImpl();
        personMergeHelper.removeDuplicates(mergeList);

        return mergeList.toArray(new Person[mergeList.size()]);
    }

    private <T> void removeDuplicates(List<T> list) {
        final Set<T> encountered = new HashSet<T>();
        for (Iterator<T> iter = list.iterator(); iter.hasNext(); ) {
            final T t = iter.next();
            final boolean first = encountered.add(t);
            if (!first) {
                iter.remove();
            }
        }
    }

}
