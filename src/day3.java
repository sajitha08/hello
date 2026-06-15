/*void main(){
    int n=5;
    //row loop
    for (int row =1;row <=n;row++) {
     //column loop
    for (int column =1;column <=row;column++) {
        System.out.print(column);
    }
        System.out.println();
    }
}*/



/*void main()
{
    int[] marks = {87,23,44,89,32} ;
    System.out.print("pass marks : ");
            for (int i=0;i<marks.length;i++)
            {
                if (marks[i] >= 40)
                {
                    System.out.print(marks[i] +" ");
                }
            }
            System.out.println();
    System.out.print("fail marks : ");
            for(int i=0;i<marks.length;i++)
            {
                if(marks[i]<40)
                {
                    System.out.print(marks[i]+" ");
                }
            }
}*/

void main() {
    int[] marks = {87, 23, 44, 89, 32};

    System.out.print("Pass marks : ");
    for (int i = 0; i < marks.length; i++) {
        if (marks[i] >= 40) {
            System.out.print(marks[i] + " ");
        }
    }
    System.out.println();

    System.out.print("Fail marks : ");
    for (int i = 0; i < marks.length; i++) {
        if (marks[i] < 40) {
            System.out.print(marks[i] + " ");
        }
    }
}




