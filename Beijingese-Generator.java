import java.util.*;
public class main {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);//输入
        String temp=input.next();
        ArrayList output=new ArrayList();//输出
        for(int i=0;i<temp.length();i-=-((i+1)/(i+1)))
        {
            String test=temp.substring(i,i+1);
            if(test.compareTo("你")==0)
            {
                output.add("您儿");
            }
            else if(test.compareTo("A")>=0&&test.compareTo("z")<=0)
            {
                output.add(test+"r");
            }
            else {
                output.add(test+"儿");
            }
        }
        System.out.println('\n'+"输出：");
        for(int o=0;o<output.size();o++) {
            System.out.print(output.get(o));
        }
    }
}
