#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[])
{
  int tamanho,cont,i,j;
     printf("Insira o numero de valores conhecidos da funcao que deseja interpolar:\t");
     scanf("%d",&tamanho);
     printf("\n"); 
  float vetfx[tamanho],vetx[tamanho],x,pdtparcial,pdtfinal,fx;
     printf("Valores de x pre existentes:\n");
     for(cont=0;cont<tamanho;cont++){
        printf("Insira o valor de x%d :\t",cont);
        scanf("%f",&vetx[cont]);
     }                                
     printf("\n");   
     printf("Valores de f<x> pre existentes:\n");    
     for(cont=0;cont<tamanho;cont++){
        printf("Insira o valor de y%d :\t",cont);
        scanf("%f",&vetfx[cont]);
     }                                
     
     
     printf("O valor de f<%f> e : %.4f ",x,fx);
     printf("\n\n");
  system("PAUSE");    
  return 0;
}
