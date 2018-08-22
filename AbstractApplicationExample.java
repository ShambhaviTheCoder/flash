class Mouse
{
	public void click()
	{
		System.out.println("mouse is clicking...");
	}
}
class Keyboard
{
	public void typing()
	{
		System.out.println("using keyboard typing the content...");
	}
}
class USB_Port
{
	public void connect(Object obj)
	{
	
		System.out.println("establishing connection....");
		
		if(obj instanceof Mouse)
		{
			Mouse ref=(Mouse)obj;
			ref.click();
		}
		else
		{
			Keyboard ref1=(Keyboard)obj;
			ref1.typing();
		}

	}
}
public class AbstractApplicationExample {

	public static void main(String[] args) 
	{

		USB_Port u1=new USB_Port();
		
		Mouse m1=new Mouse();
		u1.connect(m1);
		
		Keyboard k1=new Keyboard();
		u1.connect(k1);
		
	}
}
