package belajar.oop.basic.data;

public class Category {
    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        //if untuk validasi
        if(id != null){
            this.id = id;
        }

    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
