public class compound {
    int time;
    double rate;
    long principle;
    int n;
    

    void getamount(int t, double r, long p, int n)
    {
        time= t;
        rate= r;
        principle= p;
        n= n;
    }
     void calculation()
    {
        double compound= principle*Math.pow(1+rate/n, n*time);
        System.out.println(compound);
    }
    public static void main(String[] args) {
        compound s= new compound ();
        s.getamount(3,0.18, 500000, 12);
        s.calculation();
    }
    
}
