#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main()
{
    int T, R;
    char S[20];
    scanf("%d", &T);
    for (int i = 1; i <= T; i++) {
        scanf("%d %s", &R, &S);
        for (int j = 1; j <= strlen(S); j++) {
            for (int k = 1; k <= R; k++) {
                printf("%c", S[j - 1]);
            }
        }
        printf("\n");
    }
}