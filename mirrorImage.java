public class mirrorImage {
    public static void main (String[] args){

        //2D Array of Characters Rows:4 & Columns:13
        //char[][] pixels = new char[4][13];
        //Call and Store make_forward() in array
        char[][] pixels = make_forward();


        //Using loops, print out the array contents character by character
        /*---------Car One----------------------*/
        for(int i=0;i<4; i++){
            for(int j=0; j<13; j++){
                System.out.print(pixels[i][j]);
            }
            System.out.println(" ");
        }
        /* -------------------- Car Two -----------------*/
        //char[][] mirrorCar = new char[4][13];
        char[][] mirrorCar = make_mirror(pixels);

        for(int i= 0; i < 4; i++){
            for(int j = 12; j >= 0 ; j--){
                System.out.print(mirrorCar[i][j]);
            }
            System.out.println(" ");
        }
        /*---------------------Car Three------------------*/

        for(int i=0; i<4; i++){
            for(int j=0; j<26;j++){
                if(j<13){
                    pixels = make_forward();
                    System.out.print(pixels[i][j]);
                }

            }
            for(int k=25; k>=13; k--){
                if(k>=13){
                    System.out.print(mirrorCar[i][k%13]);
                }
            }
            System.out.println();
        }
    }

    //METHOD make_mirror
    public static char[][] make_mirror(char[][] pixels) {

        for(int i= 0; i < 4; i++){
            for(int j = 12; j >= 0 ; j--){
                if(pixels[i][j] == '('){
                    pixels[i][j] = ')';
                }
                else if (pixels[i][j] ==')') {
                    pixels[i][j] = '(';
                }
                else if (pixels[i][j] == '/'){
                    pixels[i][j] = '\\';
                }
                else if( pixels[i][j] == '\\'){
                    pixels[i][j] = '/';
                }
            }
        }

        return pixels;
    }

    //Method make_forward
    public static char[][] make_forward() {
        char[][] pixel = new char[4][13];
        pixel[0][0]=' ';
        pixel[0][1]=' ';
        pixel[0][2]='_';
        pixel[0][3]='_';
        pixel[0][4]='_';
        pixel[0][5]='_';
        pixel[0][6]='_';
        pixel[0][7]='_';
        pixel[0][8]=' ';
        pixel[0][9]=' ';
        pixel[0][10]=' ';
        pixel[0][11]=' ';
        pixel[0][12]=' ';

        pixel[1][0]=' ';
        pixel[1][1]='/';
        pixel[1][2]='|';
        pixel[1][3]='_';
        pixel[1][4]='|';
        pixel[1][5]='|';
        pixel[1][6]='_';
        pixel[1][7]='\\';
        pixel[1][8]='\'';
        pixel[1][9]='.';
        pixel[1][10]='_';
        pixel[1][11]='_';
        pixel[1][12]=' ';

        pixel[2][0]='(';
        pixel[2][1]=' ';
        pixel[2][2]=' ';
        pixel[2][3]=' ';
        pixel[2][4]='_';
        pixel[2][5]=' ';
        pixel[2][6]=' ';
        pixel[2][7]=' ';
        pixel[2][8]=' ';
        pixel[2][9]='_';
        pixel[2][10]=' ';
        pixel[2][11]='_';
        pixel[2][12]='\\';

        pixel[3][0]='=';
        pixel[3][1]='\'';
        pixel[3][2]='-';
        pixel[3][3]='(';
        pixel[3][4]='_';
        pixel[3][5]=')';
        pixel[3][6]='-';
        pixel[3][7]='-';
        pixel[3][8]='(';
        pixel[3][9]='_';
        pixel[3][10]=')';
        pixel[3][11]='-';
        pixel[3][12]='\'';

        return pixel;
    }
}

