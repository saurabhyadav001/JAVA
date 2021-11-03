// #include<iostream>
// using namespace std;
// void bubbleSort()
// {
//    int n= arr[].length;
//    int temp;
//    for(int i=0; i<n; i++)
//    {
//        for(int j=1; j<(n-i); j++)
//        {
//            if(arr[j-1]>arr[j])
//            {
//                temp = arr[j-1];
//                arr[j-1]= arr[j];
//                arr[j]=temp;
//            }
//        }
//    }
// }
// int main()
// {
//     int arr[]= {41,21,46,89,62};
//     int n=5;
//     bubbleSort(arr);ḥ
//     for(int i=0; i<=arr.length;i++)
//     {
//        cout<<arr[i]<<" ";
//     }
// }

// #include<iostream>
// using namespace std;
// int main ()
// {
//    int i, j,temp,pass=0;
//    int a[10] = {10,2,0,14,43,25,18,1,5,45};
// //    cout <<"Input list ...\n";
// //    for(i = 0; i<10; i++) {
// //       cout <<a[i]<<"\t";
// //    }
// // cout<<endl;
// for(i = 0; i<10; i++) {
//    for(j = i+1; j<10; j++)
//    {
//       if(a[j] < a[i]) {
//          temp = a[i];
//          a[i] = a[j];
//          a[j] = temp;
//       }
//    }
// pass++;
// }
// cout <<"Sorted Element List ...\n";
// for(i = 0; i<10; i++) {
//    cout <<a[i]<<"\t";
// }
// cout<<"\nNumber of passes taken to sort the list:"<<pass<<endl;
// return 0;
// }

#include<iostream>
using namespace std;
int main()
{
    int i, j;
    int temp;
    int arr[5]={89,76,85,21,12};
    for(i=0; i<5; i++)
    {
        for(j=1; j<5; j++)
        {
            if(arr[j-1]> arr[j])
            {
                temp= arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;
            }
        }
    }
    for(i=0; i<5; i++)
    {
        cout<<arr[i]<<" ";
    }
}