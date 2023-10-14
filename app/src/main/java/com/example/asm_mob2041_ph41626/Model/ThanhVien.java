package com.example.asm_mob2041_ph41626.Model;

public class ThanhVien {
    private int maTV;
    private String hoTen;
    private int namSinh;
    private int CCCD;

    public ThanhVien() {
    }

    public ThanhVien(int maTV, String hoTen, int namSinh, int CCCD) {
        this.maTV = maTV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.CCCD = CCCD;
    }

    public int getMaTV() {
        return maTV;
    }

    public void setMaTV(int maTV) {
        this.maTV = maTV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }
}
