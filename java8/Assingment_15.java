package java8Assingment;

public class Assingment_15 {

	public static void main(String[] args) {
		
	int a[]= {5,8,6,11,12,4,5,3,4,12,12,8};
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]*a[i]==(a[j]*a[j] + a[k]*a[k]) || a[j]*a[j]==(a[i]*a[i] + a[k]*a[k]) || a[k]*a[k]==(a[j]*a[j] + a[i]*a[i]))
						{
							System.out.println(a[i]+" "+a[j]+" "+a[k]);
							count++;
						}
				}
			}
		}
		System.out.println("Number  of tripletes verify Pythagors "+count);
	}

}
