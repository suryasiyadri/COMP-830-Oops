
public class RandomGeneration {
	static int[] random_numbers = new int[10];
	static int min = 0;
	static int max = 100;
	static int sum = 0;
	public static int[] randomnumbergeneration(){
		for(int i = 0;i < 10;i++)
		{
			random_numbers[i] = (int) (Math.random() * ((max - min) + 1)) + min;
		}
		
		return (random_numbers);
	}
	public static int add() {
		for(int i=0;i<10;i++)
		{
			sum = sum + random_numbers[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int[] random_numbers = randomnumbergeneration();
		for(int i = 0; i< random_numbers.length;i++)
		{
			System.out.println(random_numbers[i]);
		}
		System.out.println("Sum is:" + add());
	}
}
