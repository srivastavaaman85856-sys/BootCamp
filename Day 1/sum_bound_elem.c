#include<stdio.h>
int main(){
    int m,n;
    int sum=0;
    printf("enter  the size of matrix:");
    scanf("%d%d",&m,&n);
    int mat[m][n];
    printf("enter the elemenrts of matrix:");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&mat[i][j]);
        }
    }
    printf("the matrix is:\n");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            printf("%d ",mat[i][j]);
        }
        printf("\n");
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0||i==m-1||j==0||j==n-1){
                sum+=mat[i][j];
            }
        }
    }
    printf("sum of boundary elements is: %d",sum);
    return 0;
}