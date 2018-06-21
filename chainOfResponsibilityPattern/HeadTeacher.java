package chainOfResponsibilityPattern;

public class HeadTeacher extends AbstractHandler 
{
	protected void handleRequest(String name, int days) 
	{
		//承担责任
		if(days > 0 && days <= 3)
			System.out.println("approved by HeadTeacher!");
		//寻找下家
		else if(getNextHandler() != null)
			getNextHandler().handleRequest(name, days);
	}
}
