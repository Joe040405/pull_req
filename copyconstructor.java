public class copyconstructor {
 double fprice;
 String fname;
 copyconstructor(double fprice,String fname)
    {
        this.fprice=fprice;
        this.fname=fname;
    }
    copyconstructor(copyconstructor banana)
    {
        fprice=banana.fprice;
        fname=banana.fname;
    }
    double showprice()
    {
        return fprice;
    }
    String showname()
    {
        return fname;
    }
    public static void main(String args[])
    {
    copyconstructor j1 = new copyconstructor(150,"Mango");
    System.out.println("Name of the fruit"+j1.showname());
    copyconstructor j2 = new copyconstructor(j1);
    System.out.println("price of the  of the fruit" +j2.showprice());
}
}
