import java.util.*;
public class Problem2 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n;
    System.out.println("Enter a number");
    n=sc.nextInt();
    _toclass(n,"");
    sc.close();
    }
    public static void _toclass(int n, String str)
    {
        switch(n%10)
        {
            case 1:str="one "+str;
                    break;
            case 2:str="two "+str;
                    break;
            case 3:str="three "+str;
                    break;
            case 4:str="four "+str;
                    break;
            case 5:str="five "+str;
                    break;
            case 6:str="six "+str;
                    break;
            case 7:str="seven "+str;
                    break;
            case 8:str="eight "+str;
                    break;
            case 9:str="nine "+str;
                    break;
            case 0:str="zero "+str;
                    break;
        }
        if(n/10==0){
            System.out.println(str);
            return;
        }
        _toclass(n/10,str);
    }
}
