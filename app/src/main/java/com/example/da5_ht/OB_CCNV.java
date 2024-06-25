package com.example.da5_ht;

public class OB_CCNV {
    private int id;
    private String name;
    private String thoigian;
    private String ngaythangnam;

    public OB_CCNV(int id, String name, String thoigian, String ngaythangnam) {
        this.id = id;
        this.name = name;
        this.thoigian = thoigian;
        this.ngaythangnam = ngaythangnam;
    }

    public OB_CCNV() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getNgaythangnam() {
        return ngaythangnam;
    }

    public void setNgaythangnam(String ngaythangnam) {
        this.ngaythangnam = ngaythangnam;
    }
}
