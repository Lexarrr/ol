public class Triangle {

    Point A, B, C;

    public Triangle(Point a, Point b, Point c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + A +
                ", b=" + B +
                ", c=" + C +
                '}';
    }

    double getArea(){
        return (B.x - A.x)*(C.y - A.y)-(C.x-A.x)*(B.y- A.y)/2;

    }



//
//        public double getArea() {
//            return Math.sqrt((A+B+C)/2);
//        }
//        public double getPerim() {
//            return (A+B+C)/2;
//        }
//    }


}
