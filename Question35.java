public class Question35 {
    public static void main(String[] args) {

        InnerClass obj1 = new InnerClass(12345);
        InnerClass obj2 = new InnerClass(11111);
        objectWrapper wrapperObj1 = new objectWrapper(obj1);
        objectWrapper wrapperObj2 = new objectWrapper(obj2);
        // Values before swapping
        System.out.println("WrapperObj1 InncerClass ID value : " + wrapperObj1.innerObject.id + "\n" + "WrapperObj2 InncerClass ID value : "
                + wrapperObj2.innerObject.id + "\n");

        swap(wrapperObj1, wrapperObj2);

        // Values after swapping
        System.out.println("WrapperObj1 InncerClass ID value : " + wrapperObj1.innerObject.id + "\n" + "WrapperObj2 InncerClass ID value : "
                + wrapperObj2.innerObject.id);
    }

       static void swap(objectWrapper wrapperObj1, objectWrapper wrapperObj2) {
        InnerClass temp;
        temp = wrapperObj1.innerObject;
        wrapperObj1.innerObject = wrapperObj2.innerObject;
        wrapperObj2.innerObject = temp;
    }

    static class InnerClass {
        public int id;
        public InnerClass(int Id) {
            id = Id;
        }
    }

    static class objectWrapper {
        InnerClass innerObject;
        public objectWrapper(InnerClass objInnner) {
            this.innerObject = objInnner;
        }
    }
}
