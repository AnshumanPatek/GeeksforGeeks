class GfG

{

          public static int num(int arr[], int n, int k)

            {

                int count=0,rem=0;

                  for(int i=0;i<n;i++)

        {

            if(arr[i]>0&&arr[i]<10) {

                if (arr[i] == k)

                    count++;

            }

                else if(arr[i]>9)

                {

                    while(arr[i]>0)

                    {

                        rem=arr[i]%10;

                        if(rem==k)

                            count++;

                        arr[i]/=10;

                    }

                }

        }

                 return count;

            }

}
