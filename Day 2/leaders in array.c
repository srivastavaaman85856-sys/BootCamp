#include<stdio.h>
int main(){
    int n;
    printf("enter the size of an array ");
    scanf("%d",&n);
    int arr[n];
    printf("enter the elements of an array: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int max=arr[n-1];
    for(int i=n-2;i>=0;i--){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    printf("the maximum element in the array is %d",max);
    return 0;
}