package chainOfResponsibilityPattern;

public class Headmaster extends AbstractHandler
{
	@Override
	protected void handleRequest(String name, int days) 
	{
		//�е�����
		if(days > 31)
			System.out.println("Headmaster invited you to have a talk!");
	}
}
