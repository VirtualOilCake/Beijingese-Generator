import java.util.*;
public class main {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        String inputString=input.next();//用户输入
        ArrayList output=new ArrayList();//输出的list
        for(int i=0;i<inputString.length();i=i-(-((i+1)/(i+1))))
        {
            String temp=inputString.substring(i,i+1);
            if(temp.compareTo("你")==0)//判定是否为"你"
            {
                output.add("您儿");
            }
            else if(temp.compareTo("A")>=0&&temp.compareTo("z")<=0)//判断是否为英文字符
            {
                output.add(temp+"r");
            }
            else {
                output.add(temp+"儿");//其他字符
            }
        }
        System.out.println('\n'+"输出：");
        for(int o=0;o<output.size();o++) {
            System.out.print(output.get(o));
        }
    }
}
