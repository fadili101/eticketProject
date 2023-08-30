#include "unistd.h"

int main(int ac, char **av)
{
	int i = 1;
	int j;
	// 3tit l i 1 hit galik makhasch yekhdm 3la dik ./a.out
	while (av[i])
	{
		while(1)
		{
			j = 0;
			while (av[i][j])
			{
				if (av[i][j+1] < av[i][j] && av[i][j + 1])
				{
					char help;
					help = av[i][j];
					av[i][j] = av[i][j+1] ;
					av[i][j+1]  = help;
				}
				{
					write(1, &av[i][j], 1);
				}
				j++;
			}
		}
		write(1, "\n", 1);
		i++;
	}
}