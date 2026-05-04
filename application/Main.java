package application;


import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        System.out.println("Quantos numeros voce vai digitar? ");
        int numeros = sc.nextInt();
        int[] nums = new int[numeros];


        for(int i = 0; i < numeros; i++){
            System.out.print("Digite um numero: ");
            int addNum = sc.nextInt();
            nums[i] = addNum;
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i< numeros; i++){
            if(nums[i] < 0){
                System.out.println(nums[i]);
            }
        }

        sc.close();

    }




}
