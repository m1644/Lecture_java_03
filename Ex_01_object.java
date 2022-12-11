/**
 * Ex_01
 * Объекты
 */
public class Ex_01_object {

    // public static void main(String[] args) {
    //     Object o = 1; GetType(o);   // java.lang.Integer
    //     o = 1.2; GetType(o);    // java.lang.Double
    // }

    // static void GetType(Object obj) {
    //     System.out.println(obj.getClass().getName());
    // }

    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.2, 2.1));
        System.out.println(Sum(1.0, 3));
        System.out.println(Sum(4, 2.0));
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if(a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else if(a instanceof Double && b instanceof Integer) {
            return (Object) ((Double) a + (Integer) b);
        } else if(a instanceof Integer && b instanceof Double) {
            return (Object) ((Integer) a + (Double) b); 
        } else return 0;
    }
}
