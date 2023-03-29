
// if else 
/*public class ConditionDemo
 {  
public static void main(String[] args) 
{  
    int number=13;  
    if(number+2==16)
   {  
        System.out.println("even number");  
    }
else
   {  
        System.out.println("odd number");  
    }  
}  
 }*/
 
 
 //if elseif  ladder
 /*public class ConditionDemo { 
public static void main(String[] args) {  
    int marks=35;  
     if(marks==40)
    {  
        System.out.println("fail");  
    }  
    else if(marks==60)
   {  
        System.out.println("pass 60");  
    }  
    else if(marks==65)
   {  
        System.out.println("pass 65");  
    }  
    else if(marks==80)
  {  
        System.out.println("pass 80");  
    }  
    else
{  
        System.out.println("Invalid!");  
    }  
}  
}  */
class ConditionDemo
{
	
	public static void main(String[]args)
	{
		int age=18;  
		int mark=40;
		
		if(age>=20)
		{
			System.out.println("age if block");
			
			if(mark==60)
			{
				System.out.println("mark if block");
				
			}
			
			else
			{
				System.out.println("mark else block");
			}
		}
        else 
        {
	        System.out.println("age else block");
		}
	}
}