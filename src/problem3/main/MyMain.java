
/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("somiya",8);
        obj.insert("kaira",9);
        obj.insert("yashi",7);
        obj.insert("rohan",6);
        obj.insert("raj",1);
        obj.display();
    }
}