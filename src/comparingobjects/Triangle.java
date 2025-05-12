package comparingobjects;

public class Triangle {

    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        Triangle t = (Triangle)o;
        return base==t.base && height==t.height;
    }

//    @Override
//    public boolean equals(Object o) {
//        int b = this.base;
//        int h = this.height;
//        Triangle t = (Triangle)o;
//        int b1 = t.base;
//        int h1 = t.height;
//        return b==b1 && h==h1;
//
//    }

}
