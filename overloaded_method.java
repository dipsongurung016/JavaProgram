public class overloaded_method {
    public static void main(String[] args) {

        String result=orderMomo("Jhol","large size");
        System.out.println(result);
        String result1=orderMomo("Jhol");
        System.out.println(result1);
    }

    static String orderMomo(String name){
        return name + " "+ "momo";
    }
    static String orderMomo(String name,String size){
        return size +" "+ name + " "+ "momo";
    }
}

// method overloading = methods that share the same name,
//                      but different parameters
// signature = name + parameters