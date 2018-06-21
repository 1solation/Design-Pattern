package chainOfResponsibilityPattern;

public class Counselor extends AbstractHandler 
{
	@Override
	protected void handleRequest(String name, int days) 
	{
		//�е�����
		if(days > 3 && days <= 7)
			System.out.println("approved by Counselor!");
		//Ѱ���¼�
		else if(getNextHandler() != null)
			getNextHandler().handleRequest(name, days);
	}
}
