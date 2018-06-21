package chainOfResponsibilityPattern;

public class Counselor extends AbstractHandler 
{
	@Override
	protected void handleRequest(String name, int days) 
	{
		//承担责任
		if(days > 3 && days <= 7)
			System.out.println("approved by Counselor!");
		//寻找下家
		else if(getNextHandler() != null)
			getNextHandler().handleRequest(name, days);
	}
}
