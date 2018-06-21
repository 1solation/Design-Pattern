package chainOfResponsibilityPattern;

public class Dean extends AbstractHandler
{

	@Override
	protected void handleRequest(String name, int days) 
	{
		//承担责任
		if(days > 7 && days <= 31)
			System.out.println("approved by Dean!");
		//寻找下家
		else if(getNextHandler() != null)
			getNextHandler().handleRequest(name, days);
	}

}
