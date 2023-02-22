public class Cube {


    static String[][] face = {
        {"1","2","3"},
        {"4","5","6"},
        {"7","8","9"}
    };
    static String[][][] cube = {
        {
            {"1b","2b","3b"},
            {"4b","5b","6b"},
            {"7b","8b","9b"}
        },
        {
            {"1r","2r","3r"},
            {"4r","5r","6r"},
            {"7r","8r","9r"}
        },
        {
            {"1o","2o","3o"},
            {"4o","5o","6o"},
            {"7o","8o","9o"}
        },
        {
            {"1g","2g","3g"},
            {"4g","5g","6g"},
            {"7g","8g","9g"}
        },
        {
            {"1y","2y","3y"},
            {"4y","5y","6y"},
            {"7y","8y","9y"}
        },
        {
            {"1w","2w","3w"},
            {"4w","5w","6w"},
            {"7w","8w","9w"}
        },
    };


    static void show(String[][] Face){
        for(String[] i: Face){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void move(String[][][] Cube, String input){
        // String[][][] tempCube = new String[6][3][3];

        // for(int i=0; i<3;i++)
        //     for(int j=0; j<3;j++)
        //         for(int k=0; k<3;k++)
        //             tempCube[i][j][k] = Cube[i][j][k];
        // int a;
        // int b;
        switch(input){
            

            case "u":
                rotateFaceCube(Cube, true, 0 );
                //Code Block
                break;
            case "u'":
                rotateFaceCube(Cube, false, 0 );
                break;
            case "l":
                rotateFaceCube(Cube, true, 1 );
                break;
            case "l'":
                rotateFaceCube(Cube, false, 1 );
                break;
            case "f":
                rotateFaceCube(Cube, true, 2 );
                break;
            case "f'": 
                rotateFaceCube(Cube, false, 2 );
                break;
            case "r":
                rotateFaceCube(Cube, true, 3 );
                break;
            case "r'":
                rotateFaceCube(Cube, false, 3 );
                break;
            case "d":
                rotateFaceCube(Cube, true, 4 );
                break;
            case "d'":
                rotateFaceCube(Cube, false, 4 );
                break;
            case "b":
                rotateFaceCube(Cube, true, 5 );
                break;
            case "b'":
                rotateFaceCube(Cube, false, 5 );
                break;
            default:
                //Code Block 
        }




    }

    static void rotateFaceCube(String[][][] Cube, boolean clockwise, int side){
        String[][][] tempCube = new String[6][3][3];
        for(int i=0; i<6;i++)
            for(int j=0; j<3;j++)
                for(int k=0; k<3;k++)
                    tempCube[i][j][k] = Cube[i][j][k];
    
        if(clockwise){  
            for(int i=0; i<9;i++){
                a = i/3;
                b = 2;
                for(int j=0; j<3;j++){
                     Cube[side][a][j] = tempcube[side][b][a];
                    b--;
                }
            }
            
        }else{
            for(int i=0; i<9;i++){
                a = i/3;
                b = 2;
                for(int j=0; j<3;j++){

                    Cube[side][b][a] = tempCube[side][a][j];
                    b--;
            
                }  
            }
        }

    
    }


    static void rotateFace(String[][] Face, boolean clockwise){

        String[][] tempFace = new String[3][3];

        for(int i=0; i<3;i++)
            for(int j=0; j<3;j++)
                tempFace[i][j] = Face[i][j];

        if(clockwise){
            //order is Face[y][x] or Face[row][col]
            int a;
            int b;
            for(int i=0; i<9;i++){
                a = i/3;
                b = 2;
                for(int j=0; j<3;j++){

                    Face[a][j] = tempFace[b][a];
                    b--;
                }
            }
            

            // Face[0][0] = tempFace[2][0];
            // Face[0][1] = tempFace[1][0];
            // Face[0][2] = tempFace[0][0];
            // Face[1][0] = tempFace[2][1];
            // Face[1][1] = tempFace[1][1];
            // Face[1][2] = tempFace[0][1];
            // Face[2][0] = tempFace[2][2];
            // Face[2][1] = tempFace[1][2];            
            // Face[2][2] = tempFace[0][2];
        }else{
            int a;
            int b;
            for(int i=0; i<9;i++){
                a = i/3;
                b = 2;
                for(int j=0; j<3;j++){

                    Face[b][a] = tempFace[a][j];
                    b--;
                }
            }
        }


    }


    public static void main(String[] args){
        show(face);
        System.out.println();
        System.out.println();
        rotateFace(face, true);
        show(face);
    }
}
