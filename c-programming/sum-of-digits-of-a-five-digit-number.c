#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n, t, sum = 0;
    scanf("%d", &n);
    while(n > 0){
        t = n % 10;
        sum += t;
        n = n/10;
    }
    printf("%d",sum);

    return 0;
}

