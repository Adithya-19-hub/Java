class Company {
    String companyName;
    String companyLocation;

    Company(String a, String b) {
        companyName = a;
        companyLocation = b;
    }

    void accessCompanyDetails() {
        System.out.println(this.companyName);
        System.out.println(this.companyLocation);
    }
}

class Amazon extends Company {
    Amazon() {
        super("Microsoft","Bengalure");
    }

    @Override
    // MethodOverring occurs
    public void accessCompanyDetails() {
        System.out.println("Hey! it is a overridden method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Amazon obj = new Amazon();
        obj.accessCompanyDetails();
    }
}
