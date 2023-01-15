    package com.example.jogosdeazar;

    import java.util.Random;

    public class Sorteio {
        int[] generatedNumbers;
        int limitUnit;

        public Sorteio(int limitUnit, int[] generatedNumbers) {
            if(limitUnit <= 0)
                limitUnit = 30;
            this.limitUnit = limitUnit;
        }


        void randomCombination() {
            Random randomGenerator = new Random();


            this.generatedNumbers = new int[7];
            for (int i = 0; i < generatedNumbers.length; i++) {
                generatedNumbers[i] = randomGenerator.nextInt(this.limitUnit);
            }

            String results = "";

            for (int i = 0; i < generatedNumbers.length; i++) {
                results += generatedNumbers[i];

                if (i < generatedNumbers.length - 1) {
                    results += " - ";

                }
            }

            System.out.println(results);
        }
    }

