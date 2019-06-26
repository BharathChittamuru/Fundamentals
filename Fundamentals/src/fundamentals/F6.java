package fundamentals;

public class F6 {
public static void main(String[] args) {
	int i=0,l=args.length;
	if(l==0) {
		System.out.println("No values");
		
	}
	else
	{
	              for(i=0;i<1;i++)
		          {
			               System.out.println(args[i]);
			                if(i!=l-1)
			                System.out.println(",");
				
		           }
	}
	
}
}
