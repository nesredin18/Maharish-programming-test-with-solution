import javax.swing.text.StyleConstants;

class mah{
    public static int nextperfectsquare(int n){
        int next=0,m=0;
        while(next<=n){
            m++;
            next=m*m;
        }
        return next;

    }
    public static int n_upcount(int a[],int n){
        int sum=0,count=0,s=1;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            
            if(s==1){
            
            if(sum>n){
                System.out.println(sum);
                count++;
                s=0;
            }}
            else if(sum<=n){
                s=1;}
        }
        return count;
    }
    public static int primeCount(int start, int end){
        int count=0;
        for(int i=start;i<=end;i++){
            if(i<2) continue;
            int no=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    no=0;
                    break;
                }
            }
            if(no==1) {
                System.out.println(i);
                count++;}

        }
        return count;
    }
    public static int isMadhavArray(int []a){
        int n=1,k=1;
        while(k<a.length){
            k=n*(n+1)/2;
            n++;
        }
        if(k!=a.length) return 0;
        int sum=a[0];
        int sum2=0;
        int s=1,e=2,j=2;
        while(e<a.length){
            sum2=0;
        for(int i=s;i<=e;i++){
            sum2+=a[i];
        }
        if(sum!=sum2) return 0;
        s=s+j;e=e+j+1;j++;
        System.out.println(sum2);
    }
        
        return 1;

    }
public static int isprime(int n){
    if(n<2) return 0;
    for(int i=2;i<n;i++){
        if(n%i==0) return 0;
    }
    return 1;
}
    public static int findprcupineNumber(int n){
        int t=0;
        while(t==0){
            n++;
            int next=n+1;
            if(isprime(n)==1&n%10==9){
                while(isprime(next)==0) next++;
                if(next%10==9) t=1;
            }
        }
        return n;
    }

    public static int isGuthrieSequence(int a[]){
        if(a[a.length-1]!=1) return 0;
        for(int i=1;i<a.length;i++){
            if(a[i-1]%2==0){
                if(a[i-1]/2!=a[i]) return 0;
            }
            else{
                if(a[i-1]*3+1!=a[i])
                return 0;
            }
        }
        return 1;
    }

    public static int repsEqual(int []a,int n){
        for(int i=a.length-1;i>=0;i--){
            if(n%10!=a[i]) return 0;
            n=n/10;
        }
        return 1;
    }
    public static int isCentered15(int []a){
        for(int i=0;i<a.length;i++){
            int sum=a[i];
            
            for(int j=i;j<a.length-1;j++){
                
                if(sum==15&i==a.length-1-j){
                    System.out.println("no");
                    return 1;
                }
                else{
                    sum+=a[j+1];
                    System.out.println(sum);
                   // System.out.println(sum);
                    if(sum==15&i==a.length-2-j){
                        System.out.println(i);
                        System.out.println(j);
                        return 1;
                }
                }
            }
        }
        
        return 0;
    }
    public static int depth(int a){
        int []b= new int[10];
        int yes=0,count=0,temp=0,n=1;
        b[0]=1;
        while(yes==0){
            count++;
            temp=a*n;
            n++;
            while(temp>0){
                int i=temp%10;
                b[i]=i;
                temp=temp/10;
            }
            for(int i=0;i<b.length;i++){
                if(b[i]!=i) {yes=0;break;}
                yes=1;
            }
        }
        return count;

    }

    public static int matches(int []a,int []p){
        int s=0;
        for(int i=0;i<p.length;i++){
            int temp=p[i];
            if(temp<0) temp*=-1;
            for(int j=s;j<s+temp;j++){
                if(a[j]*p[i]<0)
                return 0;
            }

            s=s+temp;
        }
        return 1;
    }
public static int isSequentiallyBounded(int[ ] a){

    for(int i=0;i<a.length-1;i++){
        if(count>=a[i]) return 0;
        if(a[i]>a[i+1]) return 0;
        if(a[i]==a[i+1]) count++;
        else count=0;

    }
}
    public static int smallest(int n){
        int j=0,yes=0;
        while(yes==0){
            j++;
            int EA=0;
            for(int i=1;i<n+1;i++){
                int temp=j*i;
                EA=0;
                while(temp>0){
                    if(temp%10==2){
                        EA=1;
                        break;
                    }
                    temp=temp/10;
                }
                if(EA==0) break;
            }
            if(EA==1) break;
        }
        return j;
    }
    public static int[ ] clusterCompression(int[ ] a){
        if(a.length<2) return a;
        int count=0;
        for(int i=0;i<a.length-1;i++){
            if(i==a.length-2){
                if(a[i]!=a[i+1]){
                    count+=2;
                }
                else{
                    count++;
                }
            }
            else{
                if(a[i]!=a[i+1]){
                    count++;
                }
            }
        }
        int []b=new int[count];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(i==a.length-2){
                if(a[i]!=a[i+1]){
                    b[j]=a[i];
                    b[j+1]=a[i+1];
                }
                else{
                   b[j]=a[i];
                }
            }
            else{
                if(a[i]!=a[i+1]){
                    b[j]=a[i];
                    j++;
                }
            }
        }
        return b;

    }

    public static int isRailroadTie(int[ ] a){
        int cond1=0;
        if(a[0]*a[a.length-1]==0) {
            System.out.println("1");
            return 0;}
        if(a[0]!=0&a[1]==0) {
            System.out.println("3");
            return 0;}
        if(a[a.length-1]!=0&a[a.length-2]==0) {
            System.out.println("3");
            return 0;}
        for(int i=1;i<a.length-1;i++){
            System.out.println("yho");
            if(a[i]==0){
                cond1=1;
                if(a[i-1]*a[i+1]==0) return 0;
            }
            else{
                if(a[i-1]==0&a[i+1]==0) return 0;
                if(a[i-1]*a[i+1]!=0) return 0;
            }
        }
        if(a.length<3){
            for(int i=0;i<a.length;i++){
                if(a[i]!=0){
                    cond1=1;
                    break;
                }
            }
        }
        if(cond1==0) return 0;
        return 1;

    }

    public static int fullnessQuotient(int n){
        int count=0;
        for (int i=2;i<10;i++){
            int temp=n,yes=1;
            while(temp>=i){
                System.out.print(temp%i);
                if(temp%i==0){
                    yes=0;
                    break;
                }
                
                temp=temp/i;
            }
            System.out.println();
            if(yes==1&temp!=0){
                count++;
                
            }
        }
        return count;
    }

    public static int isPacked(int []a){
        for(int i=0;i<a.length;i++){
            int yes=0,count=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==a[i]) count++;
                if(count>a[i]) return 0;
                if(a[i]!=a[j]&yes==0) yes=1;
                if(a[i]==a[j]&yes==1) {
                    System.out.println("not cons");
                    return 0;}
            }
            if(count!=a[i]) return 0;
        }
        return 1;
    }

    public static int getExponent(int n, int p){
        int x=0,i=1,temp=p;
        while(p<=n){
            if(n%p==0) {x=i;}
            p=p*temp;
            i++;
        }
        return x;
    }

    public static int[] filterArray(int[] a, int n) {
    int temp = n;
    int length = 0;

    // Calculate the length required for the result array
    while (temp > 0) {
        if (temp % 2 == 1) {
            length++;
        }
        System.out.println(temp%2);
        temp /= 2;
        
    }

    // Check if the input array is big enough
    if (length >=a.length) {
        return null;
    }

    int[] result = new int[length];
    int resultIndex = 0;

    // Traverse the binary representation of n and select elements accordingly
    int i=0,j=0;
    while (n > 0) {
        if(j>=a.length){
            return null;
        }
        if (n % 2 == 1) {
            result[i]=a[j];
            i++;
        }
        j++;
        n /= 2;
    }

    return result;
}

public static int checkConcatenatedSum(int n, int catlen){
    int sum=0;
    int check=n;
    while(n>0){
        int temp=n%10,psum=temp;
        for(int i=1;i<catlen;i++){
            psum=psum*10+temp;
        }
        if(psum>check) return 0;
        n=n/10;
        sum+=psum;
    }
    if(sum==check) return 1;
    return 0;
}
public static int isSequencedArray(int[ ] a, int m, int n){
    int temp=m;
    if(a[0]!=m) return 0;
    for(int i=1;i<a.length;i++){
        if(a[i]!=a[i-1]){
            temp++;
            if(temp>n) return 0;
        }
        if(a[i]!=temp) return 0;
    }
    return 1;
}

public static int largestPrimeFactor(int n){
    if(n<2) return 0;
    int max=0;
    for(int i=2;i<=n;i++){
        if(n%i==0){
            int yes=1;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    yes=0;
                break;}
            }
            if(yes==1) max=i;
        }
    }
    return max;
}
public static int[ ] encodeNumber(int n){
    if(n<2) return null;
    int length=0,temp=n,i=2;
    while(temp!=1){
        if(temp%i==0){
            int yes=1;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    yes=0;
                break;}
            }
            if(yes==1) {
                temp=temp/i;
                length++;}
        }
        else i++;
    }
    int []a=new int[length];
    temp=n;
    i=2;
    int j=0;
    while(temp!=1){
        if(temp%i==0){
            int yes=1;
            for(int k=2;k<i;k++){
                if(i%k==0) {
                    yes=0;
                break;}
            }
            if(yes==1) {
                temp=temp/i;
                a[j]=i;
                j++;}
        }
        else i++;
    }
    return a;
}

static int matchPattern(int[] a,  int[] pattern) {
// len is the number of elements in the array a, patternLen is the number of elements in the pattern.
int len=a.length;
int patternLen=pattern.length;
int i=0; // index into a
int k=0; // index into pattern
int matches = 0; // how many times current pattern character has been matched so far
for (i=0; i<len; i++) {
if (a[i] == pattern[k])
matches++;
else if (matches == 0 || k == patternLen-1)
return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
else // advance to next pattern character 
{
if(a[i]!=pattern[k]){
    matches=0;
    i--;
    k++;
}
} // end of else
} // end of for
// return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
if (i==len && k==patternLen-1) return 1; else return 0;
}
public static int[] doIntegerBasedRounding(int[] arr, int n) {
    if (n <= 0) {
        return arr;
    }

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            int rounded = (arr[i] + n / 2) / n * n; // Integer rounding formula
            arr[i] = rounded;
        }
    }

    return arr;
}
public static int decodeArray(int[ ] a){
    int n= a[0]>0?1:-1,num=0;
    for(int i=0;i<a.length-1;i++){
        int t= a[i]-a[i+1]<0?-1*(a[i]-a[i+1]):a[i]-a[i+1];
        num=num*10+t;
    }
    return n*num;
}
public static int isZeroPlentiful(int []a){
    int count=0,zeros=0,zero=0;
    for(int i=0;i<a.length;i++){
        if(a[i]==0&zero==0){
            zero=1;
            count++;
        }
        else if(a[i]==0){
            count++;
        }
        else if(a[i]!=0){
            if(count<4) return 0;
            zeros++;
            zero=0;
            count=0;
        }
    }
    if(count>=4){
        zeros++;
    }
    return zeros;
}
public static int isDigitIncreasing(int n){
    for(int i=1;i<10;i++){
        int sum=0;
        int j=0;
        while(sum<n){
            j=j*10+i;
            sum=sum+j;
        }
        if(sum==n) return 1;
    }
    return 0;
}
public static int decodeArray1(int[ ] a){
    int sign=a[0]==-1?-1:1;
    int num=0,count=0;
    for(int i=a[0]==-1?1:0;i<a.length;i++){
        if(a[i]==0){
            count++;
        }
        else if(a[i]==1){
            num=num*10+count;
            count=0;
        }
        else{
            return 0;
        }
    }
    return num*sign;
}
public static int isonionarray(int a[]){
    int i=0,j=0;
    while(i<a.length){
        if(i+j==a.length-1&&i!=j&&a[i]+a[j]>10) {
            System.out.println(i +" "+j);
            return 0;}
        j++;
        if(j==a.length){
            i++;
            j=0;
        }
    }
    return 1;
}
public static int isOnionArray(int[] a) {
    int length = a.length;
    for (int j = 0; j <= length / 2; j++) {
        int k = length - j - 1;
        
        if (j != k && a[j] + a[k] > 10) {
            System.out.println(k+" "+j);
            return 0;
        }
    }
    return 1;
}
public static int[] encodeArray(int num) {
    if (num == 0) {
        return new int[] {0, 1};
    }

    boolean isNegative = false;
    if (num < 0) {
        isNegative = true;
        num = -num;
    }

    int length = 0;
    int temp = num;
    while (temp > 0) {
        length += temp % 10 + 1;
        temp /= 10;
    }

    int[] encodedArray = new int[length + (isNegative ? 1 : 0)];
    int index = encodedArray.length-1;
    


    if (isNegative) {
        encodedArray[0] = -1;
    }
    while (num > 0) {
        int digit = num % 10;
        for (int i = index; i >= index-digit; i--) {
            if(i==index){
                //System.out.print("d");
                encodedArray[i]=1;
            }
            else{
            encodedArray[i] = 0;
        }}
        index=index-digit-1;
        num /= 10;
    
    }

    return encodedArray;
}






public static int isSystematicallyIncreasing(int[ ] a){
    int length=0,k=1,m=0,z=1;
    while(length<a.length){
        length+=k;
        k++;
    }
    if(length!=a.length) return 0;
    while(m+z<=a.length){
        int l=1;

        for(int i=m;i<m+z;i++){
            
            if(a[i]!=l){ 
                
                return 0;}
            l++;
        }
        
        m=m+z;
        
        z++;

    }
    return 1;
}
public static int areAnagrams(char[] word1, char[] word2) {
    if (word1.length != word2.length) {
        return 0; // If lengths are different, they can't be anagrams
    }

    int[] charCount = new int[256]; // Assuming ASCII characters

    for (char c : word1) {
        charCount[c]++;
    }

    for (char c : word2) {
        charCount[c]--;
    }

    for (int count : charCount) {
        if (count != 0) {
            return 0; // If any character count is not zero, they are not anagrams
        }
    }

    return 1; // All characters have equal counts, so they are anagrams
}
public static int isFactorialPrime(int n){
    if (n < 1) {
        return 0;
    }

    int a = 1;
    int b = 1;
    int fib = 1;

    while (fib < n) {
        a = b;
        b = fib;
        fib = a + b;
    }

    return b+1==n?1:0;
}
public static int closestFibonacci(int n) {
    if (n < 1) {
        return 0;
    }

    int a = 1;
    int b = 1;
    int fib = 1;

    while (fib <= n) {
        a = b;
        b = fib;
        fib = a + b;
    }

    return b;
}
public static int ishodder(int n){
    int temp=1;
    while(temp<n){
        temp=temp*2;
    }
    if(temp-1==n) return 1;
    return 0;
}
public static int isVesuvian(int n){
    int first=0,n1=0,n2=0;
    for(int i=0;i*i<=n;i++){
        int sum=i*i;
        int temp=sum;
        for(int j=0;j*j<=n;j++){
            sum=temp+j*j;
            if(sum==n){
                first=1;
                n1=i;
                n2=j;
                break;
            }
        }
    }
    if(first==0) return 0;
    for(int i=0;i*i<=n;i++){
        if(i==n1) continue;
        int sum=i*i;
        int temp=sum;
        for(int j=0;j*j<=n;j++){
            if(j==n2) continue;
            sum=temp+j*j;
            if(sum==n){
                return 1;
            }
        }
    }
    return 0;
}
public static int isOneBalanced(int[ ] a){
    int first=0,count=0,second=0;
    for(int i=0;i<a.length;i++){
        if(a[i]==1&first==0){
            count++;
        }
        else if(a[i]==1&first==1){
            count++;
            second=1;
        }
        else if(a[i]!=1){
            first=1;
            count--;
            if(second==1) return 0;
        }
    }
    if(count!=0)return 0;
    return 1;
}
public static int is235Array(int[ ] a){
    int count=0;
    int[]b={2,3,5};
    for(int i=0;i<a.length;i++){
        int yes=0;
        for(int j=0;j<b.length;j++){
            if(a[i]%b[j]==0){
                count++;
                yes=1;
            }
        }
        if(yes==0) count++;
    }
    if(count==a.length) return 1;
    return 0;
}
public static int[] computeHMS(int seconds) {
    int[] result = new int[3];

    result[0] = seconds / 3600; // compute hours
    seconds %= 3600; // remove hours from remaining seconds

    result[1] = seconds / 60; // compute minutes
    seconds %= 60; // remove minutes from remaining seconds

    result[2] = seconds; // remaining seconds

    return result;
}
public static int is121array(int []a){
    int first=0,second=0,count=0;
    if(a[0]!=1&&a[a.length-1]!=1) return 0;
    for(int i=0;i<a.length;i++){
        if(a[i]!=1&&a[i]!=2) return 0;
        if(a[i]==1&first==0){
            count++;
        }
        else if(a[i]==2&first==0){
            first=1;
        }
        else if(a[i]==2&&second==1) return 0;
        else if(first==1&&a[i]==1){
            count--;
            second=1;
        }
    }
    if(count!=0) return 0;
    return 1;
}
public static int loopsum(int []a,int n){
    int sum=0;
    for(int i=0;i<n;i++){

        sum+=a[i];
        if(i==a.length-1&n>a.length){
            i=-1;
            n=n-a.length;
        }
    }
    return sum;
}
public static int hasNValues(int[] a, int n) {  
    int zero=0,dublicate=0;
    int []b=new int[a.length];
    for(int i=0;i<a.length;i++){
        if(a[i]==0&zero==0){
            zero=1;
            n--;
        }
        else{
            for(int j=0;j<b.length;j++){
                dublicate=0;
                if(a[i]==b[j]){
                    dublicate=1;
                    break;
                }
            }
            if(dublicate==0){
                b[i]=a[i];
                n--;
            }
        }
    }
    if(n==0) return 1;
    return 0;

}
public static double eval(double x, int a[]){
    if(a.length==0) return 0;
    double sum=a[0],temp=x;
    for(int i=1;i<a.length;i++){
        sum+=a[i]*temp;
        temp*=x;
    }
    return sum;
}
public static int islayerd(int[] a){
    int count=0;
    if(a[a.length-1]!=a[a.length-2]) return 0;
    for(int i=0;i<a.length-1;i++){
        if(a[i]>a[i+1]) return 0;
        else{
            if(a[i]==a[i+1]){
                count++;
            }
            
            if(count<1) return 0;
            else if(a[i]>a[i+1]) count=0;
        }

    }
    return 1;
}
public static int[] updateMileage(int[] mileageCounter, int milesToAdd) {
    int carry = 0;

    for (int i = 0; i < mileageCounter.length; i++) {
        int newValue = mileageCounter[i] + carry + milesToAdd % 10;
        carry = newValue / 10;
        mileageCounter[i] = newValue % 10;
        milesToAdd /= 10;
    }

    return mileageCounter;
}
public static int isConsectiveFactored(int n){
    int first=0,second=0,m=1,k=1;
    for(int i=2;i<n;i++){
        if(n%i==0&first==0){
            m=i;
            first=1;
        }
        if(n%i==0&first==1){
            k=i;
            if(k==m+1) return 1;
            m=k;
        }
    }
    return 0;
}


public static int isZeroLimited(int[] a) {
    for (int i = 0; i < a.length; i++) {
        if (i != 3 * (i / 3) + 1 && a[i] == 0) {
            return 0;
        }
        if (i == 3 * (i / 3) + 1 && a[i] != 0) {
            return 0;
        }
    }
    return 1;
}
public static int countones(int n){
    int count=0;
    while(n>0){
        if(n%2==1){
            count++;
        }
        n/=2;
    }
    return count;
}


public static int isComplete(int []a){
    int min=0,max=0,even=0;
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0&even==0){
            min=a[i];
            max=a[i];
            even=1;
        }
        if(a[i]%2==0&a[i]<min) min=a[i];
        else if(a[i]%2==0&a[i]>max) max=a[i];
    }
    if(min==max) return 0;
    for(int i=min+1;i<max;i++){
        int yes=0;
        for(int j=0;j<a.length;j++){
            if(a[j]==i){
                yes=1;
                break;
            }
        }
        if(yes==0) {
            System.out.println(min+" "+max);
            return 0;}
    }
    System.out.println(min+" "+max);
    return 1;

}

public static int isPrimProduct(int n){
    for(int i=2;i<n;i++){
        if(isprime(i)==1){
            for(int j=2;j<n;j++){
                if(isprime(j)==1){
                    if(i*j==n) return 1;
                }
                if(i*j>n) break;
            }
        }
    }
    return 0;
}
public static int hasksmallproduct(int k,int n){
    for(int i=2;i<k;i++){
            for(int j=2;j<k;j++){
                    if(i*j==n) return 1;
                if(i*j>n) break;
        }
    }
    return 0;
}
public static int[ ] fill(int[ ] arr, int k, int n){
    if(k>n||k<0||n<0) return null;
    int []a=new int[n];
    for(int i=0,j=0;j<n;j++,i++){
        if(i==k) {
            j--;
            i=-1;}
        else{
            a[j]=arr[i];
        }
    }
    return a;
}
public static int minDistance(int n){
    int first=0,second=0,l=0,m=0;
    for(int i=1;i<n;i++){
        if(n%i==0&first==0){
            l=i;
            first=1;
        }
        else if(n%i==0&second==0){
            m=i;
            second=1;
        }
        else if(n%i==0&second==1&first==1){
            if(i-m<m-l) {
                l=m;
                m=i;
            }
        }
    }
    return m-l;
}
public static int isContinuousFactored(int n) {
    int temp=1;
    for(int i=1;i<n;i++){
        temp=i;
        for(int j=i+1;j<n;j++){
            temp*=j;
            if(temp==n) return 1;
            else if(temp>n) break;
        }
    }
    return 0;
}
public static int isSmart(int n) {
    int element = 1;
    int diff = 1;

    while (element < n) {
        element += diff;
        diff++;
    }

    return element == n ? 1 : 0;
}
public static int iscompl(int a[]){
    int max=0;
    for(int i=0;i<a.length;i++){
        if(a[i]<1) return 0;
        
        if(a[i]%2==0&a[i]>max) max=a[i];
        

        }
        for(int i=2;i<max;i+=2){
            int yes=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    yes=1;
                    break;
                }
            }
            if(yes==0) return 0;
        }
        return 1;
}
public static int isfabonica(int a){
    int x=1,b=1,c=0;
    while(c<a){
        x=b;
        b=c;
        c=x+b;
    }
    if(c==a) return 1;
    return 0;

}
public static int isfancy(int n){
    int a=1,b=1,c=0;
    while(c<n){
        c=3*a+2*b;
        b=a;
        a=c;
        
    }
    if(c==n) return 1;
    return 0;

}
public static int isdual(int a[]){  
    if(a.length%2!=0) return 0;
    int m=1,sum=0,first=0,second=0;
    for(int i=0;i<a.length-1;i+=m){
        m=1;
        if((a[i]%2==0&a[i+1]%2!=0)&first==0){
            sum=a[i]+a[i+1];
            System.out.println(sum+" "+a[i]+" "+a[i+1]);
            m=2;
            first=1;
        }
        else if((a[i]%2==0&a[i+1]%2!=0)){
            if(sum!=a[i]+a[i+1]) {
                System.out.println(sum+" "+a[i]+" "+a[i+1]);
                return 0;}
            m=2;
            second=1;
        }
    }
    if(first!=second){ 
        System.out.println(first+" "+second);
        return 0;}
    return 1;
}
public static int isDaphne (int[ ] a){
    int fcount=0,scount=0,first=0,second=0,odd=0;
    for(int i=0;i<a.length;i++){
    if(a[i]%2!=0){
        odd=1;
    }
    if(a[i]%2!=0&&first==0){
        first=1;
    }
    else if(a[i]%2==0&&first==0){
        fcount++;
    }
    else if(a[i]%2!=0&&first==1){
        scount=0;
    }
    else if(a[i]%2==0&&first==1){
        scount++;
    }
    System.out.println(fcount+" "+scount);
    }
    if(odd==0||fcount!=scount) return 0;
    return 1;
}

public static int isHollow(int[ ] a){
    int count=0,first=0,second=0,zero=0;
    for(int i=0;i<a.length;i++){
        if(a[i]==0){
            first=1;
            zero++;
        }
        if(a[i]!=0&&first==0){
            count++;
        }
        if(a[i]!=0&&first==1){
            second=1;
            count--;
        }
        if(a[i]==0&&second==1){
            {
                System.out.println("yes");
                return 0;}
        }
    }
    if(count!=0||zero!=3) {
        System.out.println(count+" "+zero);
        return 0;}
    return 1;
}
    public static void main(String []args)
    {
        int t[]={-6, -3, -3, 8, -5, -4};
        int []A = {1, 1, 1, 8, 1, 1, 1, 3, 3};
        int[] arr = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
        int []a ={-5,6,2,3,2,4,5,11,8,7};
        //int []z=fill(arr,2, 10);
        char[] w1={'a','c','b'};
        char []w2={'b','c','a'};
        int []l=encodeArray(0);
        System.out.println(isMadhavArray(t));
  /* for (int i : l){
        System.out.print(i);
    } */   }
}