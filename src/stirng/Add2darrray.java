package stirng;

public class Add2darrray 
{
public static void main(String[] args) 
{
int a[][]= {
		{25,65,9},{24,98,65},{78,96,32}};

int b[][]= {{12,57,8},{87,9,6},{74,12,3}};

int c[][]=new int[3][3];
for (int i = 0; i < c.length; i++)
{
for (int j = 0; j < c[i].length; j++)
{
c[i][j]=a[i][j]+b[i][j];	
}	
System.out.println();
}
for (int i = 0; i < c.length; i++)
{
	for (int j = 0; j < c[i].length; j++) 
	{
	System.out.print(c[i][j] + " ");	
	}
}

}
}

