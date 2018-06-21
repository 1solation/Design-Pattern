package chainOfResponsibilityPattern;
//创建抽象的领导类
public abstract class AbstractHandler 
{
	//后继的责任对象
	protected AbstractHandler nextHandler = null;
	
	//设置后继责任对象
	public void setNextHandlder(AbstractHandler nextHandler)
	{
		this.nextHandler = nextHandler;
	}
	//获取后继责任对象
	public AbstractHandler getNextHandler()
	{
		return nextHandler;
	}
	//请求处理函数(请假人姓名，请假天数)
	abstract protected void handleRequest(String name, int days);
}
