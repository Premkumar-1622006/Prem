 class Company {
    String company = "ABC";
}
class Employee extends Company {
    String empName = "Ravi";
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.company + " " + e.empName);
    }
}
