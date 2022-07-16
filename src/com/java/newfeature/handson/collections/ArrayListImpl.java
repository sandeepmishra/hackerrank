package com.java.newfeature.handson.collections;

import java.util.*;

/**
 * fail fast iterator it will fail when collection getting modified during iteration
 * but through remove method of iterator it will run without exception
 *
 * Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: the fail-fast behavior of iterators should be used only to detect bugs.
 *
 */
public class ArrayListImpl {
    public static void main(String[] args) {
        List<User> users =new ArrayList<>();
       User user = new User("A", 44,"a address");
        users.add(user);
        System.out.println(user);
        user = new User("B", 23,"b address");
        users.add(user);
        user = new User("D", 10,"d address");
        users.add(user);
        user = new User("N", 98,"n address");
        users.add(user);
        user = new User("R", 5,"r address");
        users.add(user);

        Comparator<User> userComparator = Comparator.comparing(User::age).reversed();
        Collections.sort(users, userComparator);
        users.stream().map(User::name).forEach(System.out::println);
    }

    private record User(String name, Integer age, String address){}
}
