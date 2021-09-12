#Edel Barcenas
#Prof: Summerfield
#CS100 105
#9/25/18
#Codelab0


import math

def quadratic(a,b,c):
    x=(-b+math.sqrt(b*b-4*a*c))/(2*a);
    y=(-b-math.sqrt(b*b-4*a*c))/(2*a);
    ans=(x,y)
    return ans;
    

print(quadratic(1,3,-4));
