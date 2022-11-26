package project.project5C0589;

/**
 * Hello world!
 *
 */
public class App
{
	void printApp(int n)
		{
			synchronized(this)
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(n+"*"+i+"="+(n*i));
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
			}		
		}
	}
	class Mythread1 extends Thread
	{
		App t;
		Mythread1(App t)
		{
			this.t=t;
		}
		public void run()
		{
			t.printApp(7);
		}
	}

	class thread 
	{
		public static void main(String args[])
		{
			App obj = new App();
			Mythread1 th1 = new Mythread1(obj);
			th1.start();
			
		}
	}

