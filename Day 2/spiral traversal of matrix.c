#include<stdio.h>
int main(){
    int row,col;
    printf("enter the rows and columns ");
    scanf("%d%d",&row,&col);
    int mat[row][col];
    printf("enter the elements of matrix ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            scanf("%d",&mat[i][j]);
        }
    }
    int top=0;
    int bottom=row-1;
    int left=0;
    int right=col-1;
    while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            printf("%d",mat[top][i]);

        }
        top++;
        
        for(int i=top;i<=bottom;i++){
            printf("%d",mat[i][right]);
        }
       right--;     
    }  if(top<=bottom){
        for(int i=right;i>=left;i--){
            printf("%d",mat[bottom][i]);
        }
        
        bottom--;
    }   if(left<=right){
        for(int i=bottom;i>=top;i--){
            printf("%d",mat[i][left]);
        }
        left++;
    }
    return 0;
}