package firstPackage;

public class SubstringTest {

	public static void main(String[] args) {

		
			String sample = "He is a brave king";
			String arr1[] = sample.split(" ");
			int len = arr1.length;
			int count =1;
			System.out.println("Enter Substring :");
			String substr = "He";
			String arr2[] = new String[len];
			arr2 = substr.split(" ");

			for(int i=0; i<arr1.length; i++){
				if(arr2.length > arr1.length){
					System.out.println("Substring cannot be larger");
					break;
				}
				else{
					for(int j=0; j<arr2.length; j++){
						while(arr1[i]!= arr2[j]) break;
						if(arr1[i].equals(arr2[j])){
							
							count++;
						}
							
						else
							continue;
					}

				}

			}
			if(count>1)
			System.out.println("YES");
		}

}
