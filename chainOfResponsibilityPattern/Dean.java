package chainOfResponsibilityPattern;

public class Dean extends AbstractHandler
{

	@Override
	protected void handleRequest(String name, int days) 
	{
		//�е�����
		if(days > 7 && days <= 31)
			System.out.println("approved by Dean!");
		//Ѱ���¼�
		else if(getNextHandler() != null)
			getNextHandler().handleRequest(name, days);
	}

}
