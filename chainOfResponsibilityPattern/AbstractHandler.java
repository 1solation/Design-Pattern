package chainOfResponsibilityPattern;
//����������쵼��
public abstract class AbstractHandler 
{
	//��̵����ζ���
	protected AbstractHandler nextHandler = null;
	
	//���ú�����ζ���
	public void setNextHandlder(AbstractHandler nextHandler)
	{
		this.nextHandler = nextHandler;
	}
	//��ȡ������ζ���
	public AbstractHandler getNextHandler()
	{
		return nextHandler;
	}
	//��������(������������������)
	abstract protected void handleRequest(String name, int days);
}
