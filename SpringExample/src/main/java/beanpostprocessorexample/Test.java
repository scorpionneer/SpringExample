package beanpostprocessorexample;

public class Test {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int n=5;
		int k=16;
		k=k<n?k:k-n*(k/n);
		System.out.println(k);
		int j;
		int t;
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			j=i+k<n?i+k:(i+k)-n;
			b[j]=a[i];
		}
		for (int i : b) {
			System.out.println(i);
		}
	}
}
