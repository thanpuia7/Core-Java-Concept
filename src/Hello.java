

class Hello implements A,B
{
    public static void main(String args[])
    {
       /* reference to x is ambiguous both variables are x
        * so we are using interface name to resolve the 
        * variable
        */
       //System.out.println(x); 
       System.out.println(A.x);
       System.out.println(B.x);
    }
}