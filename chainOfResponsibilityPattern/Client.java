package chainOfResponsibilityPattern;

public class Client 
{

	public static void main(String[] args)
	{
		AbstractHandler headTeacher = new HeadTeacher();
		AbstractHandler counselor = new Counselor();
		AbstractHandler dean = new Dean();
		AbstractHandler headmaster = new Headmaster();
		
		headTeacher.setNextHandlder(counselor);
		counselor.setNextHandlder(dean);
		dean.setNextHandlder(headmaster);
		
		headTeacher.handleRequest("张三", 3);				//approved by HeadTeacher!
		//headTeacher.handleRequest("张三", 7);				//approved by Counselor!
		//headTeacher.handleRequest("张三", 31);			//approved by Dean!
		//headTeacher.handleRequest("张三", 365);			//Headmaster invited you to have a talk!
	}

}
