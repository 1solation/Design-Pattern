package chainOfResponsibilityPattern;

public class HeadTeacher extends AbstractHandler 
{
	protected void handleRequest(String name, int days) 
	{
		//�е�����
		if(days > 0 && days <= 3)
			System.out.println("approved by HeadTeacher!");
		//Ѱ���¼�
		else if(getNextHandler() != null)
			getNextHandler().handleRequest(name, days);
	}
}
