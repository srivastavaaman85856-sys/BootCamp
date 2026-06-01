#include<stdio.h>
int main(){
    int row,col;
    printf("enter the rows and columns :");
    scanf("%d%d",&row,&col);
    int mat[row][col];
    printf("enter elements of matrix:");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            scanf("%d",&mat[i][j]);
        }
    }
    printf("matrix before reverse is\n");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("%d ",mat[i][j]);
        }
        printf("\n");
    }
    for(int i=0;i<row;i++){
        int start=0;
        int end=col-1;
        while(start<end){
            int temp=mat[i][start];
            mat[i][start]=mat[i][end];
            mat[i][end]=temp;
            start++;
            end--;
        }
    }
    
    printf("the reverse matrix is :\n");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("%d ",mat[i][j]);
        }
        printf("\n");

    }
    return 0;

}