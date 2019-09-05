#include<stdio.h>
int main()
{
  float a,b,c;
  scanf("%f%f%f",&a,&b,&c);
  
  printf("%.2f\n%.2f\n%.2f\n%.2f",(a*b*c/100),(a+(a*b*c/100)),(0.0002*a*b*c),(a+(a*b*c/100)-(0.0002*a*b*c)));
}