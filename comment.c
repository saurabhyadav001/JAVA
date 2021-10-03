// #include<stdio.h>
// #include<conio.h>
// void main()
// {
//     char text[50];
//     int i,a;
//     printf("Enter Text : ");
//     gets(text);
//     if(text[0] == '/')
//     {
//         if(text[1] == '/') {
//             printf("It is a Comment.");
//         } 
//         else if(text[1] == '*') 
//         {
//             for(i = 2; i <= 50; i++)
//             {
//                 if(text[i] == '*' && text[i + 1] == '/')
//                 {
//                     printf("It is a Comment.");
//                     a = 1;
//                     break;
//                 }
//                 else {
//                     continue;
//                 }
//             }
//             if(a == 0)
//             {
//                 printf("\nIt is Not a Comment.");
//             }
//             else
//             {
//                 printf("\nIt is Not a Comment.");
//             }
//         }
//     }
//     else
//     {
//         printf("\nIt is Not a Comment.");
//     }
//     getch();
// }

// #include<stdio.h>
// #include<conio.h>
// void main(){
//          char text[50];
//          int a , i;
//          printf("enter text");
//          gets(text);
//          if(text[0] == '/')
//          {
//              if(text[1] == '/')
//              {
//                  printf("it is comment");
//              }
//              else if(text[1]== '*')
//              {
//                  for(i=2; i<=50 ;i++)
//                  {
//                      if (text[i]== "*" && text[i+1]== '/' )
//                      {
//                          printf("it is a comment");
//                          a=1;
//                          break;
//                      }
//                      else
//                      {
//                          continue;
//                      }

//                  }
//                  if(a ==0)
//                  {
//                      printf("it is not a comment\n");
//                  }
//                  else{
//                      printf("it is not a comment\n");
//                  }
             
//              }
//          }
//       else{
//           printf("it is not a comment");
//       }
//       getch();

// }

// #include<stdio.h>
// #include<conio.h>
// void main()
// {
//     int i,a;
//     char text[30];
//     printf("enter the text");
//     gets(text);
//     if(text[0]== '/')
//     {
//         if(text[1]== '/')
//         {
//             printf("it is a comment");
//         }
//         else if(text[0]=='*')
//         {
//             for(i=2; i<30; i++)
//             {
//                 if(text[i]=='*' && text[i+1] == '/')
//                 {
//                     printf("it is a comment");
//                     a = 1;
//                     break;
//                 }
//                 else{
//                     continue;
//                 }
//             }
//             if(a==0)
//             {
//                 printf("not comment");
//             }
//             else{
//                 printf("not comment");
//             }

//         }
//     }
//     else{
//         printf("not comment");
        
//     }

// }

#include<stdio.h>
#include<conio.h>
void main()
{
    int i,a;
    char text[50];
    printf("enter the text");
    gets(text);
    if(text[0]== '/')
    {
        if(text[1]== '/')
        {
            printf("it is a comment");
        }
        if(text[1]=='*')
        {
            for(i=2; i<50;i++)
            {
                if(text[i]== '*' && text[i+1]== '/')
                {
                    printf("it is a comment");
                    a=1;
                    break;
                }
                else{
                    continue;
                }
            }
            if(a==0)
            {
                printf("not a comment");
            }
            else{
                printf("not a comment");
            }
        }
    }
    else{
        printf("not a comment");
    }
}