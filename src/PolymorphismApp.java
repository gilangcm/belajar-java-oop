public class PolymorphismApp {
    public static void main(String[] args) {


        Employee employee = new Employee("Gilang");
        employee.sayHello("Diva");

        employee = new Manager("Fitra");
        employee.sayHello("Mamah");


        employee = new VicePresident("Dinda");
        employee.sayHello("papah");

        sayHello(new Employee("Gilang"));
        sayHello(new Manager("Fitra"));
        sayHello(new VicePresident("Diva "));
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);

        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);

        }else {
            System.out.println("Hello " + employee.name);
        }


    }



}
