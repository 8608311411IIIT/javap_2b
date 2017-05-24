public class Acad2b
{
public static void main(String []args){
int i,j;

 for(i=0;i<5;i++){
  for(j=0;j<5;j++){
    if(i<=2&&j>=(2-i)&&j<=(2+i)){
       if(i==1&&j==2||i==2&&j==1|| i==2&&j==3)
           System.out.print("b");
       else if(i==2&&j==2)
           System.out.print("c");
       else
           System.out.print("a");
    }
    else if(i>2&&j>=(i-2)&&j<=(4-i)+2){
       if(i==3&&j==2)
           System.out.print("b");
       else
           System.out.print("a");
    }
    else
       System.out.print(" ");
  }
  System.out.print("\n");
 }
}
}
