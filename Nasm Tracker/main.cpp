
#include <stdio.h>
#include <string.h>
main()
{
	char *aa,*bb,*cc,*dd,*ee,*ff;
	char intake[10];
	char first[50];
	char last[50];
	char number1[50];
	char number2[50];
	char number3[50];
	
	
	
	do
	{
		FILE *f = fopen("file.txt", "a");
		if (f == NULL)
		{	
    		printf("Error opening file!\n");
    
		}

		/* print some text */
		printf("Entre The Customer's First Name: \n");
		scanf("%s" , &first) ;
		
		printf("Entre The Customer's Last Name: \n");
		scanf("%s" , &last) ;
	
		printf("Entre The Contact Number: \n");
		scanf("%s" , &number1) ;
	
		printf("Entre The Customer Loan Number: \n");
		scanf("%s" , &number2) ;
	
		printf("Entre The Customer Amount: \n");
		scanf("%s" , &number3) ;
	
		printf("Entre The Customer Want Rcpt: \n");
		scanf("%s" , &ee) ;
	
		printf("*-*-*-*Information Has Been Added successfully!*-*-*-*\n");
	
		printf("do you want enter more? (y/n) \n");
		scanf("%s" , &intake) ;
		
		if(*intake=='y')
		{
			printf("\n*-*-*-*-*-*-*-*-*-*New Customer Information*-*-*-*-*-*-*-\n");
		}
	

		fprintf(f, "%s ", first);
		fprintf(f, "%s\t\t", last);
		fprintf(f, "%s\t", number1);
		fprintf(f, "%s\t", number2);
		fprintf(f, "%s\t", number3);
		fprintf(f, "%s\t\n", &ee);
	
		fclose(f);
	}while(*intake=='y');
}

