import java.util.*;

class A {
    String b;
    int w;
    int x;
    int y;
    int z;

    A(String b, int w, int x, int y) {
        this.b = b;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    void f() {
        z++;
        int p = w + x + y;
        if (z % p < w) {
            System.out.println(b + " green");
        } else if (z % p < w + x) {
            System.out.println(b + " yellow");
        } else {
            System.out.println(b + " red");
        }
    }
}

class Sv {
    int q;
    int r;

    Sv(int q, int r) {
        this.q = q;
        this.r = r;
    }
}

class Vs {
    List<A> n;

    Vs(List<A> n) {
        this.n = n;
    }

    void da(Sv stats) {
        for (A a : n) {
            if (stats.q > 50) {
                a.w = 60;
                a.y = 30;
            } else {
                a.w = 30;
                a.y = 60;
            }
            a.f();
        }
    }
}

 class Main {
    public static void main(String[] args) {
        List<A> lights = new ArrayList<>();
        lights.add(new A("Intersection1", 30, 5, 60));
        lights.add(new A("Intersection2", 30, 5, 60));

        Vs vs = new Vs(lights);

        Sv stats1 = new Sv(55, 40);
        vs.da(stats1);

        Sv stats2 = new Sv(30, 30);
        vs.da(stats2);
    }
}
