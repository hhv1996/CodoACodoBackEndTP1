/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codoacodobackendtp1.models;
import java.util.Scanner;
/**
 *
 * @author HhV
 */
public class User {
    private String name;
    private String surname;
    private int age;
    private String hobbie;
    private String ide;
    private String so;

    public User(String name, String surname,int age,String hobbie,String ide,String so) {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.hobbie=hobbie;
        this.ide=ide;
        this.so=so;
    }
    public User() {
        this.name="";
        this.surname="";
        this.age=0;
        this.hobbie="";
        this.ide="";
        this.so="";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getHobbie() {
        return hobbie;
    }

    public String getIde() {
        return ide;
    }

    public String getSo() {
        return so;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public void setSo(String so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return "----------------\nNombre=" + name + "\nApellido=" + surname + ",\nEdad=" + age + ",\nHobbie=" + hobbie + ",\nIde=" + ide + ",\nSO=" + so;
    }
    public void userDataInput (){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        this.setName(sc.nextLine());
        System.out.println("Ingrese el apellido: ");
        this.setSurname(sc.nextLine());
        System.out.println("Ingrese el Edad: ");
        this.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el hobbie: ");
        this.setHobbie(sc.nextLine());
        System.out.println("Ingrese el ide: ");
        this.setIde(sc.nextLine());
        System.out.println("Ingrese el SO: ");
        this.setSo(sc.nextLine());
    }
}