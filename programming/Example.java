import java.util.Scanner ;
class Example //(123456-->612345)  key is 5   
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        System.out.println("Enter a Key : ");
        int key=sc.nextInt();
        System.out.println(num+"--> "+rotate(num,key));
    }

    public static int rotate (int num,int key)
    {
        String str = ""+num;
        int lngth = str.length();
        String str1 = "";
        for (int i=0;i<=key;i++) 
        {
            str += num ;   
        }
        for (int i=0;i<lngth;i++) 
        {
            str1 += str.charAt(i+key);   
        }
        return Integer.parseInt(str1);
    }
}