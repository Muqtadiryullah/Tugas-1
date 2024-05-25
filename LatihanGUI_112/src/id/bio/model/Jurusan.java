package id.bio.model;

public class Jurusan {
    private String id;
    private String nama;
    public Jurusan(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    public Jurusan(String id) {
        this.id = id;
    }
    public Jurusan() {
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public String toString(){
        return nama;
    }
    
}
