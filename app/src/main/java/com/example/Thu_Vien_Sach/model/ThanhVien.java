package com.example.Thu_Vien_Sach.model;

public class ThanhVien {
    public int maTV;
    public String hoTen;
    public String namSinh;
    public String cccd;

    public ThanhVien() {
    }

//    public ThanhVien(int maTV, String hoTen, String namSinh) {
//        this.maTV = maTV;
//        this.hoTen = hoTen;
//        this.namSinh = namSinh;
//    }

    public ThanhVien(int maTV, String namSinh, String cccd, String hoTen) {
        this.maTV = maTV;
        this.namSinh = namSinh;
        this.cccd = cccd;
        this.hoTen = hoTen;
    }
}
