package com.rinkusaini.a2_myappteam;

import com.google.firebase.firestore.Exclude;

public class msgcollection {
    String msg;
    String docId;
    String name;


    @Exclude
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public msgcollection(){}

    public msgcollection(String msg, String name){
        this.msg = msg;
        this.name = name;
    }

    public String getMsg(){
        System.out.println(msg);
        return msg;
    }


    public String getName(){
        System.out.println(name);
        return name;
    }
}
