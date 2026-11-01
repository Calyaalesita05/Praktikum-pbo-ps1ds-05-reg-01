package com.guided.gd1;

// Fondasi umum: belum punya peran spesifik, jadi tidak boleh diinstalasi langsung 
public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setiap pegawai pasti punya gaji, tapi rumusnya beda-beda
    public abstract double earnings();
}
