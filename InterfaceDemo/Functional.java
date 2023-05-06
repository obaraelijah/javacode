package InterfaceDemo;

// @FunctionalInterface
// interface A
// {
//     void show();
// }

// class B implements A {

//     public void show()
//     {
//         System.out.println("in show");
//     }
// }

@FunctionalInterface
interface A 
{
    int add(int i, int j);
}

public class Functional {
    
    public static void main(String[] args) {

        // A obj = new B();
        // obj.show();

        // A obj = new A() {
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };
        // obj.show();

    //     //lambda expression
    //     A obj = () ->
    //     {
    //         System.out.println("in show");
    //     };
    //     obj.show();
    // 

    A obj = (i,j) -> i+j;

    int results = obj.add(4, 6);
    System.out.println(results);

   

    }
}
