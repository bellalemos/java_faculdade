public static void main(String[] args) {
        Scanner event = new Scanner(System.in);

        int vetor1[][] = new int[3][3];
        int vetor2[][] = new int[3][3];
        int somar[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for(int index = 0; index < 3; i++){
                vetor1[i][index] = event.nextInt();
                vetor2[i][index] = event.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for(int index = 0; index < 3;index++){
                somar[i][index] = vetor1[i][index] + vetor2[i][index];
                System.out.println("A somar é: " + somar[i][index]);
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int index = 0; index < 3; i++){
                if(index == 2){
                    System.out.printf("\n");
                }
            }
        }
    }
