import javax.swing.JOptionPane; 
import java.util.Random;
public class VarArgs {
void table(int n)
{
	String data="";
	for(int i=1;i<=10;i++)
	{
		data=data+n+" * "+i+" = "+n*i+"\n";
	}

	JOptionPane.showMessageDialog(null, data,"Table of "+n,JOptionPane.PLAIN_MESSAGE);
}

void firsttenevennumber()
{
String data="";

for(int i=0;i<=10;i++)
{
	data=data+i+"      "+i*2+"\n";
}

JOptionPane.showMessageDialog(null, data,"First ten even numbers",JOptionPane.PLAIN_MESSAGE);
}

//Calculating the values to be placed into the elements of an array.
void array()
{
int arr[]=new int[10];	
String data="";
for(int i=0;i<10;i++)
{
	arr[i]=i*2+2;
	data=data+arr[i]+"\n";
}
JOptionPane.showMessageDialog(null, data,"First ten even numbers",JOptionPane.PLAIN_MESSAGE);
}

// Computing the sum of the elements of an array.
int sum(int  arr[])
{
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=arr[i]+sum;
	}
	return sum;
}

//Bar chart of java
void barchart()
{
	String data="";String data1="";
	int arr[]= {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
for(int i=0;i<arr.length;i++)
{
	data=data+(i*10)+"-"+((i*10)+9)+":  ";
	data1=data1+arr[i]+" ";
	for(int  j=0;j<arr[i];j++)
	{
		data=data+"*";
	}
	data=data+"\n";
}
JOptionPane.showMessageDialog(null, data1,"Raw data",JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null, data,"Organized form of data",JOptionPane.PLAIN_MESSAGE);
}

//Die-rolling program using arrays instead of switch
void dieroll()
{
	Random r=new Random();
	int index[]=new int[6];
	int randomindex=-1;
	String data="";
	for(int i=0;i<6000000;i++)
	{
		randomindex=r.nextInt(6);
		index[randomindex]=index[randomindex]+1;
	}
	
	for(int i=0;i<6;i++)
	{
		data=data+(i+1)+"        "+index[i]+"\n";
	}
	
	JOptionPane.showMessageDialog(null, data,"Face        Frequency",JOptionPane.PLAIN_MESSAGE);
}

//Poll analysis program.
void pollanalysis()
{
	int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,10, 2, 3, 3, 2, 14 };	
	String randomresponses="";
	String invalidresponses="";
	String rawdata="";
	int [] frequency= {0,0,0,0,0};
	for(int i=0;i<responses.length;i++)
	{
		int j=responses[i]-1;
		if( j<5)
		{
			frequency[j]=frequency[j]+1;
		}
		else
		{
			invalidresponses=invalidresponses+"responses["+i+"] is invalid and it is "+responses[i]+"\n";
		}
		rawdata=rawdata+responses[i]+"   ";
	}
	for(int i=0;i<frequency.length;i++)
	{
		randomresponses=randomresponses+(i+1)+"       "+frequency[i]+"\n";
	}
	JOptionPane.showMessageDialog(null, rawdata,"Random ratings ",JOptionPane.PLAIN_MESSAGE);
	JOptionPane.showMessageDialog(null, invalidresponses, "Invalide responses", JOptionPane.PLAIN_MESSAGE);
	JOptionPane.showMessageDialog(null, randomresponses,"Ratings Frequency",JOptionPane.PLAIN_MESSAGE);
}
public static void main(String args[])
{
	VarArgs v=new VarArgs();
	char choice;int number1;
do {
	String choice1=JOptionPane.showInputDialog("Enter 1 for table \nEnter 2 for checking first ten even number\nEnter 3 for array\nEnter 4 for sum \nEnter 5 for bar chart\nEnter 6 for Roll Die\nEnter 7 for Poll analysis program.\nEnter 0 for exit");
	choice=choice1.charAt(0);
	if(choice=='1')
	{
		String number=JOptionPane.showInputDialog("Enter a number that you want to see table");
		number1=Integer.parseInt(number);
		v.table(number1);
	}
	else if(choice=='2')
	{
		v.firsttenevennumber();
	}
	else if(choice=='3')
	{
		v.array();
	}
	else if(choice=='4')
	{
		String size=JOptionPane.showInputDialog("Enter how many number that you want to sum ");
		int Size=Integer.parseInt(size);
		int arr[]=new int[Size];
	String num1;
		for(int i=0;i<Size;i++)         
		{
			num1=JOptionPane.showInputDialog("Enter number  "+(i+1)+": ");
			arr[i]=Integer.parseInt(num1);
		}
	JOptionPane.showMessageDialog(null, "The sum of all number are : "+v.sum(arr));
	}
	else if(choice=='5')
	{
		v.barchart();
	}
	else if(choice=='6')
	{
		v.dieroll();
	}
	else if(choice=='7')
	{
		v.pollanalysis();
	}
	else if(choice=='0')
	{
		JOptionPane.showMessageDialog(null,"Thank you for using this program");
	}
}	while(choice!='0');
}
}
