#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[])
{

                              
     printf("\n");   
     printf("Valores de f<x> pre existentes:\n");    
     for(cont=0;cont<tamanho;cont++){
        printf("Insira o valor de y%d :\t",cont);
        scanf("%f",&vetfx[cont]);
     }                                
     printf("\n");   
     
       fx=fx+vetfx[i]*pdtfinal;
       pdtfinal=0;                                            
     } 
     printf("O valor de f<%f> e : %.4f ",x,fx);
     printf("\n\n");
  system("PAUSE");    
  return 0;
}
