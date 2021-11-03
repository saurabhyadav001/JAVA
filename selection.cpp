// #include<iostream>
// using namespace std;
// int main()
// {
//     int arr[]={55,57,23,76,32}, n=5;

//     for(int i=0; i<(n-1); i++) 
//     {
//         for(int j=(i+1); j<n;j++)
//         {
//             if(arr[j]< arr[i])
//             {
//                 int temp= arr[j];
//                 arr[j]= arr[i];
//                 arr[i]= temp;
//             }
//         }
//     }
//     for(int i=0; i<5;i++)
//     {
//         cout<<arr[i]<<" ";
//     }
// }
#include<iostream>
using namespace std;
int main()
{
    int arr[]={12,45,86,75,19,25,96,112},n=8;
    for(int i=0; i<n-1;i++)
    {
        for(int j=(i+1); j<n; j++)
        {
            if(arr[j]<arr[i])
            {
                int temp= arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
            }
        }
    }
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }
}