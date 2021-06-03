// Program unrelated to course content, to make the internship report dates

public class temp {
    public static void main(String[] args) {
        int i,j,k;
        k=2;
        int flag1=0;
        int flag2=0;
        String arr[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for(i=8;i<=11;i++)
        {
            for(j=1;j<=31;j++)
            {
                if(i==8 && flag1==0)
                {
                    j=19;
                    flag1=1;
                }
                if(i==11 && flag2==0)
                {
                    if(j>19)
                    {
                        flag2=1;
                        break;
                    }
                }
                if(i==9)
                {
                    if(j>30)
                        break;
                }
                System.out.println(j+"/"+i+"/"+"20:- "+arr[k]);
                if(k==6)
                    k=0;
                else
                    k++;
            }
        }
    }    
}
