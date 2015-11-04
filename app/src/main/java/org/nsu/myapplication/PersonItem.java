package org.nsu.myapplication;

/**
 * Created by iBrain on 02-11-2015.
 */
public class PersonItem {
    String name;
    String nickName;
    int imageResId;
    String department;

    public PersonItem(String name, String nickName, int imageResId,String department) {
        this.name = name;
        this.nickName = nickName;
        this.imageResId = imageResId;
        this.department=department;
    }
}
