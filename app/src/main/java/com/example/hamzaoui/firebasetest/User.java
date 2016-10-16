package com.example.hamzaoui.firebasetest;

/**
 * Created by hamzaoui on 30/09/16.
 */

public class User {
    String nom,prenom,userId;

    public User(String nom, String prenom,String userId) {
        this.nom = nom;
        this.prenom = prenom;
        this.userId=userId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
