package Queues;

import stacks.Stack;


public class QueueUsingStack {
	Stack sI,sR;
	QueueUsingStack()
	{
		sI = new Stack();
		sR = new Stack();
	}
	void enqueue(int d)
	{
		sI.push(d);
	}
	int dequeue()
	{
		if(sR.viewTop()==null)
		{
			while(sI.viewTop()!=null)
			{
				sR.push(sI.pop());
			}
		}
		return sR.pop();		
	}
}
