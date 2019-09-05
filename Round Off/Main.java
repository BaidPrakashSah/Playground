#include<stdio.h>
int main()
{
  float a;
  scanf("%f",&a);
  printf("%.0f\n%.1f\n%.1f",a,ceil(a),floor(a));
}