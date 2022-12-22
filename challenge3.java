public class challenge3 {
    

    
    public static double Median(int a[], int n){
        //check if no of values are even 
            if (n % 2 != 0)
                //if it is, then just didvide 
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    
    }
    
    public static double Mode(int a[], int n){
        int count = 0;
        int maxNoOfCount = 0;
        int value=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<i;j++){
               //comparing values to each other to see if they are equal
               //if so add to count
               if (a[j]==a[i]){
                   ++count;
               }
               if (count>maxNoOfCount){
                   //comparing the current count in the running loop
                   //to the current count, this makes sure to that
                   //the maxNoOfCount value will have the no of the value
                   //which is present the most
                   maxNoOfCount=count;
                   
                   //equatin the i value only if its the highest occuring
                   //in the array as done above
                   value=a[i];
                   
               }
           }
       } 
       return value;
    }
    
    public static double prime(int a[], int n){
        int [] array;
        for(int i=0;i<n;i++){
            if (a[i]%1=0){
                for(int j=0;j<array.length;j++){
                    array[i]=a[i];
                }
            }
        }
        return Arrays.toString(array);
    }
    
    
    
    
    public static void main(String[] args) {
        int tempNo;
       int n[]={47,84,75,21,14,14,79};
       
        System.out.println("Before Sorting");
       for(int num:n){
           System.out.print(num + ", ");
       }
       
       for (int i=0; i<n.length-1 ;i++){
           for(int j=i+1; j<n.length; j++){
               if (n[i]>=n[j])
               {
                   tempNo=n[i];
                   n[i]=n[j];
                   n[j]=tempNo;
               }
           }
       }
        System.out.println("");
        System.out.println("After Sort");
        System.out.println(Arrays.toString(n));
       
        System.out.println("---------------------");
        System.out.println("Median: " + Median (n,n.length));
        System.out.println("Highest Value: "+ n[6]);
        System.out.println("Mode: "+ Mode(n,n.length));
        
        
        
       

        


       
    }
}
