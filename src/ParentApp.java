public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Diva";
        child.doIt();
        System.out.println(child.name);

//        bisa begini untuk mengkonversi dari child nya
//        Parent parent = child;
//        bisa begini juga
        Parent parent =(Parent) child;
        parent.name = "Mamah";
        parent.doIt();
        System.out.println(parent.name);
    }
}
