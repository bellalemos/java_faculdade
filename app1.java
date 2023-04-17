    public static void main(String[] args) {
        Scanner event = new Scanner(System.in);

        int[] input = new int[5];

        // onde o usuario vai inserir os dados       
        for (int index = 0; index < input.length; index++) {
            input[index] = event.nextInt();
            
            Arrays.sort(input, 0, 5);
            System.out.println("Order" + input[index]);
        }
    }
