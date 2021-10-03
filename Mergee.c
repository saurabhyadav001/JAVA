// #include <stdio.h>
// #include <stdlib.h>
// void Merge(int arr[],int low,int mid,int high)
// {
//     int i=low,j=mid+1,k=low;
//     int B[100];
//     while(i<=mid && j<=high)
//     {
//         if(arr[i]<=arr[j])
//         {
//             B[k++] = arr[i++];
//         }
//         else
//         {
//              B[k++]=arr[j++]; 
//         }
//     }
//     for(;i<=mid;i++)
//     {
//        B[k++] = arr[i++];
//     }
//     for(;j<=high;j++)
//     {
//        B[k++] = arr[j++];
//     }
//     for(i=low;i<=high;i++)
//     {
//         arr[i] = B[i];
//     }
// }
// void MergeSort(int arr[],int low ,int high)
// {
//     if(low<high)
//     {
//         int mid = (low+high)/2;
//         MergeSort(arr,low,mid);
//         MergeSort(arr,mid+1,high);
//         Merge(arr,low,mid,high);
//     }
// }
// int main()
// {
//     int arr[]= {12,34,67,11,23,79,45,56,77,88},n=10,i;
//     // n = sizeof(arr)/sizeof(arr[0]);
//     printf("%d\n ",n);
//     MergeSort(arr,0,n-1);
//     for(i=0;i<n;i++)
//         printf("%d ",arr[i]);   
// return 0;
// }

#include<stdint.h>
#include<stdlib.h>
void MergeSort(int a[], int low, int high)
{
    if(low<high)
    {
        int mid= (low +high)/2;
        MergeSort(a, low, high);
        MergeSort(a, mid+1 , high);
        MergeSort(a, low, mid , high);
    }
}
int main()
{
    int a[]= {34,5,9,2,72}, n=5, i;
    printf("%d\n",n);
    MergeSort(a, 0, n-1);
    for(i=0; i<n ;i++)
    printf("%d", a[i]);
    return 0;

}