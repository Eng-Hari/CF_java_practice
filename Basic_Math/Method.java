
class Myclass {    // user created class
//funtions contain -> functions, Atributes, methods

    int age;    // class atributes
    String name;

    int isprime(int a) {    //Method inside the class
        int b = 10;
        return b + a;
    }

    int myage(int age) {    //Method inside the class
        return 25 + age;
    }

    static String myname() {
        return "Hariharan";
    }
}

class Method {

    public static void main(String[] args) {
        Myclass mem = new Myclass();
        // create a new object to accec the outer class methods
        mem.age = 25;
        // use object to acces the variables
        mem.name = "Hari";
        System.out.println(mem.age + " " + mem.name);
        System.out.println(mem.isprime(5));
        //use object to call the method from outer class
        System.out.println(mem.myage(25));
        System.out.println(Myclass.myname());
        Myclass.myname();
    }
}
