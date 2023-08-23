class maharish{

public static int isEvens(int n){
        while(n>0){
            if((n%10)%2!=0){
                return 0;
            }
            n=n/10;
        }
        return 1;
    }
public static int ismagicArray(int []a){
        int sum=0,isprime=1;
        for(int i=0;i<a.length;i++){
            if(a[i]<2){
                continue;
            }
            else{
                for(int j=2;j<a[i];j++){
                    isprime=1;
                    if(a[i]%j==0){
                        isprime=0;
                        break;
                    }
                }
                if(isprime==1) sum+=a[i];
            }
        }
        if(sum==a[0]) return 1;
        return 0;
    }
public static int isCompelte(int []a){
        int min=1,max=1,iseven=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0&iseven==0){
                min=a[i];
                max=a[i];
                iseven=1;
            }
            if(a[i]%2==0&iseven==1){
                if(a[i]<min) min=a[i];
                else if(a[i]>max) max=a[i];
            }
        }
        if(min!=max&min%2==0&max%2==0&iseven==1){
            for(int j=min+1;j<max;j++){
                int yes=0;
                for(int k=0;k<a.length;k++){
                    if(j==a[k]){
                        yes=1;
                        break;
                    }
                }
                if(yes==0) return 0;
            }
            return 1;
        }
        return 0;
    }
public static int isprime(int n){
    if(n<2) return 0;
    for(int i=2;i<n;i++){
        if(n%i==0) return 0;
    }
    return 1;
}
public static int isMeera(int []a){
    int prime=2,zero=2;
    for(int i=0;i<a.length;i++){
        if(isprime(a[i])==1) prime=1;
        if(a[i]==0) zero=1;
        if(prime==1&zero==1) return 1;
    }
    if(prime==2&zero==2) return 1;
    return 0;
}
public static int isFabonacci(int n){
    int sum=2,in=1,temp=0;
    while(sum<n){
        temp=sum;
        sum+=in;
        in=temp;
    }
    if(sum==n) return 1;
    return 0;
}
public static int minDistance(int n)
        {
            int minDist = n, count = 0, f1 = 0;
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    if (count == 0)
                        f1 = i;
                    count++;
                    if (count > 1)
                    {
                        if (minDist > i - f1)
                            minDist = i - f1;
                        f1 = i;
                    }

                }
                
                if (count == 1 && i == n - 1)
                    minDist = i - i;
            }
            if (count == 0)
            {
                return -1;
            }
            return minDist;

        }
public static int largestprimefactor(int n){
    int lpf=1;
    for(int i=2;i<n;i++){
        if(n%i==0){
            int prim=1;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    prim=0;
                    break;
                }
            }
            if(prim==1&i>lpf) lpf=i;
        }
    }
    if(lpf<=1) return 0;
    return lpf;
}
public static int [] encode(int n){
    if(n<2) return null;
    int length =0,temp=n;
    for(int i=2;i<=temp;){
        //System.out.println(temp);
        if(temp%i==0){
            int prim=1;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    prim=0;
                    break;
                }
            }
            if(prim==1){ 
               
                temp=temp/i;
                length++;
                i=2;
        }
            else i++;
    }
        else i++;
    }
int [] factors=new int[length];
int prim=0;
for(int k=0;k<factors.length;){
   //System.out.println(length);
    for(int l=2;l<=n;){
        if(n%l==0){
            prim=1;
            for(int m=2;m<l;m++){
                if(l%m==0){
                    prim=0;
                    break;
                }

            }
            if(prim==1){
                factors[k]=l;
                n=n/l;
                k++;
                l=2;
            }
            else l++;

        }
        else l++;
    }

}
return factors;
}
public static int nextperfectsquare(int n){
    int perfect=0,temp=0;
    while(perfect<=n){
        temp=perfect;
        perfect*=perfect;
        if(perfect<=n){
            perfect=temp+1;
        }

    }
    return perfect;
}
public static int nUpCount(int []a,int n){
    int count=0,sum=0;
    for(int i=0;i<a.length;i++){
        sum+=a[i];
        if(sum>n) count++;
    }
    return count;
}
public static int primeCount(int start,int end){
    int count=0,prim=0;
    for(int i=start;i<=end;i++){
        for(int j=2;j<i;j++){
            prim=1;
            if(i%j==0){
                prim=0;
                break;
            }
        }
        if(prim==1){ 
            System.out.println(i);
            count++;
    }}
    return count;
}
public static int isMadhavArray(int []a){
    int lengh=1,n=1;
    while(lengh<a.length){
        lengh=n*(n+1)/2;
        n++;
    }
    if(lengh!=a.length) return 0;
    int s=1,end=2,sum=a[0],sum2=0;
    for(int i=s,j=2;i<=end&s+end<=a.length;i++){
        sum2+=a[i];
        if(i==end&sum==sum2){
            System.out.println(sum2);
            s=end+1;
            end=j+s;
            j++;
            sum2=0;

        }
        else if(i==end&sum!=sum2) {
            System.out.println(sum2);
            return 0;}
    }
    return 1;
}
public static int isinertial(int []a){
    int odd=0,max=a[0],index=0;
    for(int i=0;i<a.length;i++){
        if(a[i]%2!=0&odd==0) odd=1;
        if(a[i]>max){
            max=a[i];
            index=i;
        }
    }
    if(odd==1&max%2==0){
        for(int j=0;j<a.length;j++){
            if(a[j]==max) continue;
            for(int k=0;k<a.length;k++){
                if(a[j]%2==0&a[k]%2!=0&a[k]<a[j]) return 0;
            }
        }
        return 1;
    }
    return 0;
}
public static int isperfectsquare(int n){
    int perfect=0,temp=0;
    while(perfect<n){
        temp=perfect;
        perfect*=perfect;
        if(perfect<n){
            //System.out.println(perfect);
            perfect=temp+1;
        }

    }
    if(perfect==n) return 1;
    return 0;
}
public static int countsquarpairs(int []a)  {
    int count=0;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(j==i) continue;
            else if(a[i]>a[j]||a[i]<=0||a[j]<=0) continue;
            else{
                if(isperfectsquare(a[i]+a[j])==1){ 
                    System.out.println(a[i]);
                    System.out.println(a[j]);
                    count++;}
            }
        }
    } return count;
}
public static int isGuthrieSequence(int [] a){
    if(a[a.length-1]!=1) return 0;
    int start=a[0],i=1;
    while(start!=1&i<a.length){
        if(start%2==0) start=start/2;
        else  start=start*3+1;
        if(a[i]!=start){ return 0;}
        i++;
    }
    return 1;
}

public static int [] solve10()
{   int sum=1;
    int [] b=new int[2];
    for(int i=1;i<=10;i++){
        sum*=i;
    }
    sum+=1;
    System.out.println(sum);
    for(int j=1;j<=10;j++){
        int sum1=1;
        for(int k=1;k<=j;k++){
            sum1*=k;
        }
        int sum2=1;
        for(int l=1;l<=10;l++){
                sum2*=l;
            System.out.println(sum1+sum2);
            if(sum1+sum2==sum){
                b[0]=j;
                b[1]=l;
                return b;
            }
        }
    }
    return null;
}

public static int repsEqual(int []a,int n){
    int m=0,i=a.length-1;
    while(n>0&i>=0){
        m=n%10;
        n=n/10;
        if(a[i]!=m) return 0;
        i--;
    }
    if(n>0) return 0;
    return 1;
}

public static int isCentered15(int []a){
    int start=1,sum=0,s=0;
    for(int i=0;i<a.length;i++){
        sum=a[i];
        for(int j=i;j<a.length-1;j++){
            if(sum==15){
                //System.out.print(i);
                //System.out.print(a.length-j-1);
                if(i==a.length-j-1) return 1;
            } 
            if(sum>15){
                break;
            }
            sum+=a[j+1];


        }
}
return 0;
}

public static int henry(int start, int end) {
    if (start > end) {
        int temp = end;
        end = start;
        start = temp;
    }
    int count = 0, sum1 = 0, sum2 = 0, num = 2;
    while (end >= count) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            count++;
            if (start == count) {
                sum1 = sum;
            }
            if (end == count) {
                sum2 = sum + sum1;
            }
        }

        num++;
    }
    return sum2;
}

public static int isNunique(int []a,int n){
    int sum=0,count=0;
    if(a.length<2) return 0;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(i==j) continue;
            else{
                sum=a[i]+a[j];
                if(sum==n) count++;
                if(count>2) return 0;
            }
        }
    }
    if(count<2) return 0;
    return 1;
}

public static int computdepth(int n){
    int []a=new int[10];
    int zero=0,yes=0,count=0;
    int j=0;
    int temp=n;
    while(yes==0){
        j++;
        n=temp*j;
        int m=n;
        count++;
        while(m>0){
            int l=m%10;
            m=m/10;
            a[l]=l;
            if(l==0) zero=1;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=i||zero==0){
                yes=0;
                break;
            }
            yes=1;
        }
    }
    return count;
}

public static int convertToBase10(int []a,int base){
    int temp=base,sum=a[a.length-1];
    for(int i=a.length-2;i>=0;i--){
        sum+=a[i]*base;
        base*=temp;
    }
    return sum;
}
   

public static int isTrivalent(int []k){
    int a=1,b=1,c=1,yes=0,f=1,s=0,t=0,fo=0;
    for(int i=0;i<k.length;i++){
        if(k[i]==a) {yes=1;break;}
    }
    for(int j=0;j<k.length;j++){
        if(yes==1&f==1){
            f=0;
            s=1;
        }
        if(yes==0&f==1) {
            a=k[j];
            f=0;
            s=1;
        }

        else if(s==1){
            if(k[j]!=a){
                b=k[j];
                s=0;
                t=1;
            }
        }
        else if(t==1){
            if(k[j]!=a&k[j]!=b){
                c=k[j];
                t=0;
                fo=1;
            }
    }
    else if(fo==1){
        if(k[j]!=a&k[j]!=b&k[j]!=c){
            return 0;
        }
    }
}
if(f+s+t!=0) {
    System.out.println("yes");
    return 0;}
return 1;

}

public static int countRepresentation(int n){
int count=0;
for (int rupee20=0; rupee20<=n/20; rupee20++)
for (int rupee10=0; rupee10<=n/10; rupee10++)
for (int rupee5=0; rupee5<=n/5; rupee5++)
for (int rupee2=0; rupee2<=n/2; rupee2++)
for (int rupee1=0; rupee1<=n; rupee1++)
{
int sum=rupee20*20+rupee10*10+rupee5*5+rupee2*2+rupee1;
System.out.println(sum);
if (sum==n){
count++;
break;}
else if(sum>n) break;
}
return count;
}
public static int minmaxdisjoint(int []a){
    if(a.length==0) return 0;
    int min=a[0],max=a[0],mi=0,mai=0,md=0,mad=0;
    for(int i=1;i<a.length;i++){
        if(a[i]<min){
            min=a[i];
            mi=i;
            md=0;
        }
        else if(a[i]>max){
            max=a[i];
            mai=i;
            mad=0;
        }
        else if(min==a[i]) md=1;
        else if(max==a[i]) mad=1;
    }
    if(mi>mai){
        int temp=mai;
        mai=mi;
        mi=temp;
    }
    if(mai-mi<2||md==1||mad==1) return 0;
    return 1;
}

public static int smallest(int n){
    int num=1;
    int count=0,yes=0;
    while(count!=n){
        count=0;
        for(int i=1;i<n+1;i++){
            yes=0;
            int temp=num*i;
            while(temp>0){
                if(temp%10==2){
                    yes=1;
                    count++;
                    break;
                }
                temp/=10;
            }
            if(yes==0) break;
        }
        num++;
    }
    return num-1;
}
public static int israilroad(int []a){
    int cond1=0;
    for(int i=0;i<a.length;i++){
        if(a[i]!=0){
            cond1=1;
            if(i==0){
            if(a[i+1]==0){
                System.out.println(a[i]);
                return 0;
            }}
            else if(i==a.length-1){
                System.out.println(a[i]);
               if( a[i-1]==0) return 0;}
            else {
                if(((a[i-1]==0&a[i+1]==0)||(a[i-1]!=0&a[i+1]!=0))) {
                    System.out.println(a[i]);
                    return 0;}
            }
        }
        else{
            if(i==0){
                System.out.println(a[i]);
                return 0;
            }
            else if(i==a.length-1) {System.out.println(a[i]);return 0;}
            else if(i>0&i<a.length-1){
                System.out.println(a[i]);
                if(!(a[i-1]!=0&a[i+1]!=0)) return 0;
            }

        }
 
    }
    if(cond1==1) return 1;
    return 0;
}
public static int fullness(int n){
    int count=0,yes=1;
    for(int i=2;i<10;i++){
        int temp=n;
        while(temp>=i){
             yes=1;
            if(temp%i==0){
                yes=0;
                break;
            }
            temp/=i;
        }
        if(yes==1) count++;
    }
    return count;
}


public static void main(String []args){
        int a[]={ 1,0, 3, 0};
        //int k[]=solve10();
        System.out.println(solve10());

    }
}