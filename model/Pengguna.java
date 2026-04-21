package model;

public class Pengguna {
    private int id;
    private String nama;
    private String password;

    public Pengguna(int id, String nama, String password) {
        this.id = id;
        this.nama = nama;
        this.password = password;
    }

    public void setNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            this.nama = nama;
        }
    }
    
    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        }
    }
    
    public int getId() { 
        return id; 
    }

    public String getNama() { 
        return nama; 
    }

    public String getPassword() { 
        return password; 
    }

    public void tampilData() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
    }
}