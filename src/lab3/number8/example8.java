package lab3.number8;

public class example8 {
    public static void main(String[] args) {
        int size = 10;
        char[] charArray = new char[size];
        char[] arrGlas = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char firstChar = 'A';


        for(int i = 0; i < size; i++)
        {
            Boolean flag = true;
            for(int j = 0; j < arrGlas.length; j++)
            {
                if(firstChar == arrGlas[j])
                {
                    i--;
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                charArray[i] = firstChar;
            }
            firstChar++;
        }

        for(int i = 0; i < size; i++){
            System.out.print(charArray[i] + " ");
        }
    }
}
